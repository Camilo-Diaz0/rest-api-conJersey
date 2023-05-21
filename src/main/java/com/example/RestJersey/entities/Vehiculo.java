package com.example.RestJersey.entities;

import com.example.RestJersey.entities.componentes.Bateria;
import com.example.RestJersey.entities.componentes.Motor;

abstract public class Vehiculo {
    public String marca = "";
    public int ruedas;
    public int velActual = 0;
    public Bateria bateria = new Bateria();
    public Motor motor = new Motor();

    Vehiculo(int ruedas,String marca){
        this.ruedas = ruedas;
        this.marca = marca;
    }
    abstract void acelerar();
    abstract void encender();
    abstract void apagar();
    public void frenar() {
        velActual =  0;
    }
}
