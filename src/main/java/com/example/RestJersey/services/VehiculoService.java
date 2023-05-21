package com.example.RestJersey.services;

import com.example.RestJersey.entities.Vehiculo;
import com.example.RestJersey.entities.componentes.VehiculoFactory;
import jakarta.ws.rs.NotFoundException;
import javassist.tools.reflect.CannotCreateException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class VehiculoService{
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public ArrayList<Vehiculo> getAll(){
        if(!vehiculos.isEmpty()){
            return vehiculos;
        }
        throw new NotFoundException();
    }
    public Vehiculo crearVehiculo(String tipo) throws CannotCreateException {
        if(tipo.equalsIgnoreCase("coche") || tipo.equalsIgnoreCase("moto")){
            VehiculoFactory vehiculoFactory = new VehiculoFactory(tipo);
            Vehiculo vehiculo = vehiculoFactory.getVehiculo();
            vehiculos.add(vehiculo);
            return vehiculo;
        }
        throw new CannotCreateException(("El tipo de vehiculo no se ha encontrado"));
    }
}
