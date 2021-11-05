package com.company;

public class Client {
    public static void test() {
        Empresa empresa1 = new Empresa();

        Suscriptor Victor = new Suscriptor("Victor Viera");
        Suscriptor Pedro = new Suscriptor("Pedro Duarte");
        Suscriptor Carlos = new Suscriptor("Carlos Fuentes");

        empresa1.suscribirse(Victor);
        empresa1.suscribirse(Pedro);
        empresa1.suscribirse(Carlos);

        Revista revista1 = new Revista("Nueva A");
        empresa1.enviarRevista(revista1);
        System.out.println("****************************************");
        Revista revista2 = new Revista("Nueva B");
        empresa1.desafiliarse(Pedro);
        empresa1.enviarRevista(revista2);
    }
}
