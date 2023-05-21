package com.example.RestJersey.entities.componentes;

public class Motor {
    private boolean encendido = false;
    private int caballoDeFuerza;

    public Motor(){}
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getCaballoDeFuerza() {
        return caballoDeFuerza;
    }

    public void setCaballoDeFuerza(int caballoDeFuerza) {
        this.caballoDeFuerza = caballoDeFuerza;
    }
}
