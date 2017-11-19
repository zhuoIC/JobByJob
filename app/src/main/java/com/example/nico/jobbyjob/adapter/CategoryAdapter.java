package com.example.nico.jobbyjob.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nico.jobbyjob.R;
import com.example.nico.jobbyjob.pojo.Category;
import com.example.nico.jobbyjob.db.repository.CategoryRepository;


/**
 * Created by nico on 18/11/17.
 */

public class CategoryAdapter extends ArrayAdapter<Category> {
    public CategoryAdapter (@NonNull Context context){
        super(context, R.layout.item_category, CategoryRepository.getInstance().getCategories());
    }

    // Devuelve un objeto View
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CategoryHolder categoryHolder;

        View view = convertView;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(R.layout.item_category, null);
            categoryHolder = new CategoryHolder();
            categoryHolder.txvName = view.findViewById(R.id.txvName);
            categoryHolder.txvShortName = view.findViewById(R.id.txvShortName);
            view.setTag(categoryHolder);
        }else{
            categoryHolder = (CategoryHolder) view.getTag();
        }
        categoryHolder.txvName.setText(getItem(position).getName());
        categoryHolder.txvShortName.setText(getItem(position).getShortName());
        return view;
    }

    class CategoryHolder{
        TextView txvName;
        TextView txvShortName;
    }
}
