package com.example.RestJersey.entities.componentes;

import com.example.RestJersey.entities.Coche;
import com.example.RestJersey.entities.Motocicleta;
import com.example.RestJersey.entities.Vehiculo;

public class VehiculoFactory {
    Vehiculo vehiculo;
    VehiculoFacade vehiculoFacade = new VehiculoFacade();
    private VehiculoFactory(){}
    public VehiculoFactory(String tipo){
        if(tipo.equalsIgnoreCase("coche")){
            vehiculo = new Coche();
        }else if (tipo.equalsIgnoreCase("moto")){
            vehiculo = new Motocicleta();
        }
    vehiculoFacade.setPropiedades(vehiculo);
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
}
