package com.example.nico.jobbyjob.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.example.nico.jobbyjob.R;
import com.example.nico.jobbyjob.pojo.Service;
import com.example.nico.jobbyjob.db.repository.ServiceRepository;

import java.util.ArrayList;

/**
 * Created by nico on 18/11/17.
 */

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder>{
    private ArrayList<Service> services;
    private ArrayList<Service> servicesModified;

    public ServiceAdapter(ArrayList<Service> servicesModified){
        services = ServiceRepository.getInstance().getServices();
        this.servicesModified = servicesModified;
    }

    public ServiceAdapter (){
        services = ServiceRepository.getInstance().getServices();
        servicesModified = new ArrayList<>();
    }

    @Override
    public ServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_service, null);
        ServiceViewHolder serviceViewHolder = new ServiceViewHolder(view);
        return serviceViewHolder;
    }


    @Override
    public void onBindViewHolder(ServiceViewHolder serviceViewHolder, int position) {

        serviceViewHolder.txvName.setText(services.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    public static class ServiceViewHolder extends RecyclerView.ViewHolder{

        private Switch swEnabled;
        private TextView txvName;
        private TextView txvSectorDefault;

        public ServiceViewHolder(View view) {
            super(view);
            txvName = view.findViewById(R.id.txvName);
        }
    }

    public ArrayList<Service> getServicesModified() {
        return servicesModified;
    }

}
