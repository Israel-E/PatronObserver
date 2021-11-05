package com.company;

public class Suscriptor implements IObservador {
    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Revista ejemplar) {
        System.out.println("Gracias Recibir esta revista: " +
                ejemplar.getNombre() + ", " + this.nombre);
    }
}
