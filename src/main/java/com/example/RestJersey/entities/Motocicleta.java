package com.example.RestJersey.entities;

public class Motocicleta extends Vehiculo {
    private boolean tacometroDigitalOn = false;
    public Motocicleta(){
        super(2,"");
    }
    public Motocicleta(String marca){
        super(2,marca);
    }

    @Override
    public void encender() {
        motor.setEncendido(true);
        setTacometroDigitalOn(true);
    }
    @Override
    public void apagar() {
        motor.setEncendido(false);
        setTacometroDigitalOn(false);
    }
    @Override
    public void acelerar() {
        velActual += 60;
    }

    public void setTacometroDigitalOn(boolean tacometroDigitalOn) {
        this.tacometroDigitalOn = tacometroDigitalOn;
    }

    public boolean isTacometroDigitalOn() {
        return tacometroDigitalOn;
    }
}


