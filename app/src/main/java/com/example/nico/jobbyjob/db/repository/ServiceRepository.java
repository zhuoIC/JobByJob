package com.example.nico.jobbyjob.db.repository;

import com.example.nico.jobbyjob.pojo.Service;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nico on 18/11/17.
 */

public class ServiceRepository {

    private ArrayList<Service> services;
    private static ServiceRepository serviceRepository;

    static {
        serviceRepository = new ServiceRepository();
    }

    private ServiceRepository(){
        this.services = new ArrayList<>();
        initialize();
    }

    /* Métodos */
    public void initialize(){
        addService(new Service(1, "Paseo perros",
                "Paseo perros por el barrio a cambio de que me arreglen el grifo",
                false, new Date(), null));
        addService(new Service(2, "Doy masajes terapéuticos",
                "Doy masajes terapéuticos a gente sin medios", true, new Date(), null));
        addService(new Service(3, "Pinto tu casa",
                "Siempre y cuando limpies la mía", false, new Date(), null));
        addService(new Service(4, "Cuido niños",
                "A cambio solo pido clases de conducir", false, new Date(), null));
        addService(new Service(5, "Abrazos gratis",
                "Pues eso", true, new Date(), null));
    }

    public static ServiceRepository getInstance(){
        if(serviceRepository == null)
            serviceRepository = new ServiceRepository();
        return serviceRepository;
    }


    public void addService(Service service){
        services.add(service);
    }

    public ArrayList<Service> getServices(){
        return services;
    }
}
