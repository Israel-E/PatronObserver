package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements ISubject {

    private static List<IObservador> archivoSuscripcion = new ArrayList<>();

    @Override
    public void suscribirse(IObservador suscriptor) {
        archivoSuscripcion.add(suscriptor);
    }

    @Override
    public void desafiliarse(IObservador suscriptor) {
        archivoSuscripcion.remove(suscriptor);
    }

    @Override
    public void enviarRevista(Revista ejemplar) {
        for(int i=0; i<archivoSuscripcion.size(); i++) {
            archivoSuscripcion.get(i).update(ejemplar);
        }
    }
}
