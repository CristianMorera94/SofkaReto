/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sofkareto;

import java.util.ArrayList;

public class Mundo {
    
    public final static int NUM_PREGUNTAS = 25;
    Preguntas[] preguntas= new Preguntas[NUM_PREGUNTAS];
    ArrayList<Jugador> jugadores = new ArrayList<>();
    
    public Mundo() {

        preguntas[0] = new Preguntas("¿Rio mas largo Colombia?","Orinico","Putumaya","Sumapaz","Magdalena");
        preguntas[1] = new Preguntas("¿En cuantos departamentos está dividido Colombia ?","33","28","31","32");
        preguntas[2] = new Preguntas("¿Cuantas regiones tiene Colombia?","5","4","7","6");
        preguntas[3] = new Preguntas("¿Con que país no limita Colombia?","Venezuela","Brasil","Ecuador","Bolivia");
        preguntas[4] = new Preguntas("¿Capital de Colombia?","Cali","Medellín","Cartagena","Bogotá");
        ///////////////////
        preguntas[5] = new Preguntas("¿País con más copas mundo?","Italia","Alemania","Brasil","Francia");
        preguntas[6] = new Preguntas("¿Equipo con más UEFA Champions League Ganadas?","Barcelona","Bayer Munich","Liberpool","Real Madrid");
        preguntas[7] = new Preguntas("¿Jugador con más balones de oro ganados?","Ronaldo","Cristiano Ronaldo","Joohann Cruyff","Lionel Messi");
        preguntas[8] = new Preguntas("¿Equipo con más copas Libertadores ganadas?","Boca Junior","Peñarol","River Plate","Independiente");
        preguntas[9] = new Preguntas("¿Jugador con más mundiales ganados?","Lionel Mesi","Diego Maradona","Cristiano Ronaldo","Pelé");
        //////////////////
        preguntas[10] = new Preguntas("¿En que año termino la segunda guerra mundial?","1935","1934","1944","1945");
        preguntas[11] = new Preguntas("¿Cual de estos Reyes no fue rey de Francia?","Luis XV","CarloMagno","Carlos X","Enrique VIII");
        preguntas[12] = new Preguntas("¿Cual fue el ultimo emperador Romano?","Nerón","Tiberio","Julio Cesar","Rómulo Augusto");
        preguntas[13] = new Preguntas("¿Cuantos viajes realizo Cristóbal Colon a América?","1","3","5","4");
        preguntas[14] = new Preguntas("¿Quién dibujo al famoso Hombre de Vitruvio?","Rafael Sanzio","Miguel Ángel Buonarroti","Donato di Betto Bardi","Leonardo da Vinci");
        //////////////
        preguntas[15] = new Preguntas("¿Cuantos premios Oscar gano el Señor de los Anillos?","10","12","14","11");
        preguntas[16] = new Preguntas("¿Cuantos nominaciones a los premios Oscar obtuvo Titanic?","10","11","12","14");
        preguntas[17] = new Preguntas("¿Cuantos actores interpretaron a Batman en el cine?","5","4","6","9");
        preguntas[18] = new Preguntas("¿Franquicia cinematografica más taquillera de la historia?","Harry Potter","El señor de lo Anillos","Star Wars","Marvel");
        preguntas[19] = new Preguntas("¿En que fecha fue la primera entrega de los premios Oscar?","15 de Marzo de 1929","15 de Mayo de 1928","16 de Marzo de 1928","16 de Mayo de 1929");
        /////////////
        preguntas[20] = new Preguntas("¿Cual fue la última obra literaria publicada de Wiliam Shakespeare?","Romeo y Julieta","Noche de Reyes","Como Gustes","La Tempestad");
        preguntas[21] = new Preguntas("¿Autor de la famosa obra Drácula?","Alexander Dumas","Stephen King","Vlad Tepes","Bram Strker");
        preguntas[22] = new Preguntas("¿Cuantas Novelas escribio Gabriel Garcia Márquez?","37","15","21","11");
        preguntas[23] = new Preguntas("¿Que escritor dijo las siguientes palabras?: No piesnso en toda la descgracia, sino en toda la belleze que aún permanece.","Gabriel Garcia Marquez","Gandi","Pablo Neruda","Ana Frank");
        preguntas[24] = new Preguntas(" ¿Quién es el autor de la Divina Comedia?","Virgilio","Giovanni Boccacio","Donato di Betto Bardi","Dante Alighieri");
    }

    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
}
