/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sofkareto;

import java.util.Stack;
import javax.swing.JOptionPane;

public class IniciarJuego extends javax.swing.JFrame {

    private Preguntas[] preguntasMundo;
    private Mundo mundo;
    private SofkaReto principal;
    private Jugador jugador;
    private int contador = 0;
    int puntaje = 0;
    Stack < Integer > pCartas = new Stack <> ();
    Stack < Integer > pRespuestas = new Stack <> ();

    public IniciarJuego(Mundo pMundo,SofkaReto pPrincipal, String pNombre) {
        initComponents();
        mundo = pMundo;
        principal = pPrincipal;
        preguntasMundo = mundo.getPreguntas();
        jugador = new Jugador(pNombre);
        this.setLocationRelativeTo(null);
        this.setSize(370, 410);
        this.setResizable(false);
        mundo.getJugadores().add(jugador);
        this.aleatoriSinRepeticionPreguntas();
        this.aleatoriSinRepeticionRespuestas();
        lblPreguntas.setText(preguntasMundo[pCartas.get(contador)].getPregunta());
        res1.setText(this.darPreguntaPorNumero(pRespuestas.get(0)));
        res2.setText(this.darPreguntaPorNumero(pRespuestas.get(1)));
        res3.setText(this.darPreguntaPorNumero(pRespuestas.get(2)));
        res4.setText(this.darPreguntaPorNumero(pRespuestas.get(3)));
    }

    IniciarJuego(Mundo mundo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void asignarBien(){
       jugador.setPreguntasbien(jugador.getPreguntasbien() + 1);
    }

    private void verificarRespuesta(){
        String respuesta = "";
        if(res1.isSelected()){
            respuesta = res1.getText();
        }
        else if(res2.isSelected()){
            respuesta = res2.getText();
        }
        else if(res3.isSelected()){
            respuesta = res3.getText();
        }
        else if(res4.isSelected()){
            respuesta = res4.getText();
        }
        if(respuesta.equals(preguntasMundo[pCartas.get(contador)].getRespuestaBien())){
            this.asignarBien();
        }
        else{
            JOptionPane.showMessageDialog(null, "Perdiste");
            this.dispose();
            this.principal.setVisible(true);
        }
    }

    private void reset(){
        buttonGroup1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblPreguntas = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        res1 = new javax.swing.JRadioButton();
        res2 = new javax.swing.JRadioButton();
        res4 = new javax.swing.JRadioButton();
        res3 = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 400));
        setMinimumSize(new java.awt.Dimension(350, 400));

        lblPreguntas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreguntas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPreguntas.setName("pregunta"); // NOI18N

        siguiente.setText("Siguiente");
        siguiente.setName("siguiente"); // NOI18N
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(res1);
        res1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(res2);
        res2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(res4);
        res4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(res3);
        res3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res3ActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguiente)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(res1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(res2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(res3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(res4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(lblPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(res1)
                .addGap(18, 18, 18)
                .addComponent(res2)
                .addGap(18, 18, 18)
                .addComponent(res3)
                .addGap(18, 18, 18)
                .addComponent(res4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(btnRegresar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        this.verificarRespuesta();
        this.reset();
        this.aleatoriSinRepeticionRespuestas();
        contador++;
        if(contador < preguntasMundo.length-1){
        lblPreguntas.setText(preguntasMundo[pCartas.get(contador)].getPregunta());
        res1.setText(this.darPreguntaPorNumero(pRespuestas.get(0)));
        res2.setText(this.darPreguntaPorNumero(pRespuestas.get(1)));
        res3.setText(this.darPreguntaPorNumero(pRespuestas.get(2)));
        res4.setText(this.darPreguntaPorNumero(pRespuestas.get(3)));
        }
        else if(contador == preguntasMundo.length-1){
        siguiente.setText("Finalizar");
        lblPreguntas.setText(preguntasMundo[pCartas.get(contador)].getPregunta());
        res1.setText(this.darPreguntaPorNumero(pRespuestas.get(0)));
        res2.setText(this.darPreguntaPorNumero(pRespuestas.get(1)));
        res3.setText(this.darPreguntaPorNumero(pRespuestas.get(2)));
        res4.setText(this.darPreguntaPorNumero(pRespuestas.get(3)));
        }
        else{
            this.dispose();
            this.principal.setVisible(true);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private String darPreguntaPorNumero(int pNumero){
        return switch (pNumero) {
            case 0 -> preguntasMundo[pCartas.get(contador)].getRespuestaBien();
            case 1 -> preguntasMundo[pCartas.get(contador)].getRespuestaMala1();
            case 2 -> preguntasMundo[pCartas.get(contador)].getRespuestaMala2();
            default -> preguntasMundo[pCartas.get(contador)].getRespuestaMala3();
        };
    }
    
    private void aleatoriSinRepeticionPreguntas() {
        int pos;
        int nCartas = Mundo.NUM_PREGUNTAS;
        for (int i = 0; i < nCartas ; i++) {
            pos = (int) Math.floor(Math.random() * nCartas );
        while (pCartas.contains(pos)) {
            pos = (int) Math.floor(Math.random() * nCartas );
        }
            pCartas.push(pos);
        }
    }

     private void aleatoriSinRepeticionRespuestas() {
        this.pRespuestas = new Stack <> ();
        int pos;
        int nCartas = 4;
        for (int i = 0; i < nCartas ; i++) {
            pos = (int) Math.floor(Math.random() * nCartas );
        while (pRespuestas.contains(pos)) {
            pos = (int) Math.floor(Math.random() * nCartas );
        }
            pRespuestas.push(pos);
        }
    }


    private void res3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res3ActionPerformed

    private void res2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res2ActionPerformed

    private void res1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res1ActionPerformed

    private void res4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_res4ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Boton regresar no guarda los datos regresa al menu de inicio 
        this.mundo.getJugadores().remove(jugador);
        this.dispose();
        this.principal.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblPreguntas;
    private javax.swing.JRadioButton res1;
    private javax.swing.JRadioButton res2;
    private javax.swing.JRadioButton res3;
    private javax.swing.JRadioButton res4;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables

    private void exit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
