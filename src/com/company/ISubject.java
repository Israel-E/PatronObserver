package com.company;

public interface ISubject {
    void suscribirse(IObservador suscriptor);
    void desafiliarse(IObservador suscriptor);
    void enviarRevista(Revista ejemplar);
}
