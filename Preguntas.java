/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sofkareto;

public class Preguntas {

    String pregunta;
    
    String respuestaMala1;
    String respuestaMala2;
    String respuestaMala3;
    String respuestaBien;

    public Preguntas(String pregunta, String respuestaMala1, String respuestaMala2, String respuestaMala3, String respuestaBien) {
        this.pregunta = pregunta;
        this.respuestaMala1 = respuestaMala1;
        this.respuestaMala2 = respuestaMala2;
        this.respuestaMala3 = respuestaMala3;
        this.respuestaBien = respuestaBien;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuestaMala1() {
        return respuestaMala1;
    }

    public String getRespuestaMala2() {
        return respuestaMala2;
    }

    public String getRespuestaMala3() {
        return respuestaMala3;
    }

    public String getRespuestaBien() {
        return respuestaBien;
    }


}
