package com.example.RestJersey.entities.componentes;

import com.example.RestJersey.entities.Coche;
import com.example.RestJersey.entities.Motocicleta;
import com.example.RestJersey.entities.Vehiculo;
import javassist.expr.Instanceof;

public class VehiculoFacade {

    public VehiculoFacade(){
    }
    public void setPropiedades(Vehiculo vehiculo){
        if(vehiculo instanceof Coche){
            vehiculo.bateria.setCapacidad(50);
            vehiculo.bateria.setVatiosHora(22000);
            vehiculo.motor.setCaballoDeFuerza(60);
            ((Coche) vehiculo).encender();
        }else if(vehiculo instanceof Motocicleta){
            vehiculo.bateria.setCapacidad(6);
            vehiculo.bateria.setVatiosHora(6000);
            vehiculo.motor.setCaballoDeFuerza(20);
            ((Motocicleta) vehiculo).encender();
        }
    }
}
