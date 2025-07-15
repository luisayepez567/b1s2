package com.example;

public class Main {
    public static void main(String[] args) {


        Estadio estadio1 = new Estadio ();
        estadio1.nombre = "Estadio Metropolitano";
        estadio1.ciudad = "Barranquilla";
        estadio1.capacidad = 46000;

        Estadio estadio2 = new Estadio ();
        estadio2.nombre = "Estadio El Campín";
        estadio2.ciudad = "Bogotá";
        estadio2.capacidad = 36000;
        

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();

        JugadorFutbol jugador1 = new JugadorFutbol();
        jugador1.nombre = "Carlos";
        jugador1.edad = 25;
        jugador1.posicion = "Delantero";
        jugador1.presentarse();
        jugador1.cambiarPosicion("Centrocampista");
        jugador1.presentarse();
        JugadorFutbol jugador2 = new JugadorFutbol();
        
        jugador2.nombre = "Andrés";
        jugador2.edad = 30;
        jugador2.posicion = "Defensa";
        jugador2.presentarse();
        jugador2.cambiarPosicion("Portero");
        jugador2.presentarse();
        
    }
}

