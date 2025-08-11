package com.example;

public class Main {
    public static void main(String[] args) {

        Estadio estadio1 = new Estadio("Metropolitano", "Barranquilla", 46000);
        Estadio estadio2 = new Estadio("El Campín", "Bogotá", 36000);

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();

        JugadorFutbol jugador1 = new JugadorFutbol("Luis", 20, "Delantero");
        JugadorFutbol jugador2 = new JugadorFutbol("James", 22, "Volante");
        JugadorFutbol jugador3 = new JugadorFutbol("David", 25, "Arquero");

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        jugador2.cambiarPosicion("Extremo derecho");
        jugador2.presentarse();
    }

}
