package com.example.RestJersey.entities;

public class Coche extends Vehiculo{
    private boolean aireAcondiciodoOn = false;
    public Coche(){
        super(4,"");
    }

    @Override
    public void encender(){
        motor.setEncendido(true);
        setAireAcondiciodoOn(true);
    }

    @Override
    public void apagar() {
        motor.setEncendido(false);
        setAireAcondiciodoOn(false);
    }

    @Override
    public void acelerar() {
        velActual +=  150;
    }

    public void setAireAcondiciodoOn(boolean aireAcondiciodoOn) {
        this.aireAcondiciodoOn = aireAcondiciodoOn;
    }

    public boolean isAireAcondiciodoOn() {
        return aireAcondiciodoOn;
    }
}
