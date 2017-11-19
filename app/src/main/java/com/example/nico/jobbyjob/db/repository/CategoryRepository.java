package com.example.nico.jobbyjob.db.repository;

import com.example.nico.jobbyjob.pojo.Category;

import java.util.ArrayList;



public class CategoryRepository {
    private ArrayList<Category> categories;
    private static CategoryRepository categoryRepository;

    static {
        categoryRepository = new CategoryRepository();
    }

    private CategoryRepository(){
        this.categories = new ArrayList<>();
        initialize();
    }

    public void initialize(){
        addCategory(new Category(1, "Categoría 1", "CG1",
                "Categoría con el número 1"));
        addCategory(new Category(2, "Categoría 2", "CG2",
                "Categoría con el número 2"));
        addCategory(new Category(3, "Categoría 3", "CG3",
                "Categoría con el número 3"));
        addCategory(new Category(4, "Categoría 4", "CG4",
                "Categoría con el número 4"));
        addCategory(new Category(5, "Categoría 5", "CG5",
                "Categoría con el número 5"));

    }

    /* Patrón Singleton*/
    public static CategoryRepository getInstance(){
        if(categoryRepository == null)
            categoryRepository = new CategoryRepository();
        return categoryRepository;
    }

    public void addCategory(Category category){
        categories.add(category);
    }

    public ArrayList<Category> getCategories(){
        return categories;
    }

}
