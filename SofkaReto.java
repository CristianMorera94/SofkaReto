/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sofkareto;

import java.awt.event.KeyEvent;
public class SofkaReto extends javax.swing.JFrame {
    
    Mundo mundo;

    public SofkaReto() {
        initComponents();
        mundo = new Mundo();
        this.setLocationRelativeTo(null);
        this.setSize(370, 410);
        this.setResizable(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        BTHistorial = new javax.swing.JButton();
        BTinicio = new javax.swing.JButton();
        txtNombreJugador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 400));
        setMinimumSize(new java.awt.Dimension(350, 400));
        setPreferredSize(new java.awt.Dimension(350, 400));

        Content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Content.setMaximumSize(new java.awt.Dimension(350, 350));
        Content.setMinimumSize(new java.awt.Dimension(350, 350));
        Content.setPreferredSize(new java.awt.Dimension(350, 350));

        BTHistorial.setText("Historial");
        BTHistorial.setMaximumSize(new java.awt.Dimension(150, 50));
        BTHistorial.setMinimumSize(new java.awt.Dimension(150, 50));
        BTHistorial.setPreferredSize(new java.awt.Dimension(150, 50));
        BTHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTHistorialActionPerformed(evt);
            }
        });

        BTinicio.setText("Inicio");
        BTinicio.setMaximumSize(new java.awt.Dimension(150, 50));
        BTinicio.setMinimumSize(new java.awt.Dimension(150, 50));
        BTinicio.setPreferredSize(new java.awt.Dimension(150, 50));
        BTinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTinicioActionPerformed(evt);
            }
        });

        txtNombreJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreJugadorKeyTyped(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jugador:");

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreJugador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(BTHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTinicioActionPerformed
        String nombre = txtNombreJugador.getText();
        if(nombre.isEmpty()){ }
        else{
            IniciarJuego p2 = new IniciarJuego(mundo, this, nombre);
            p2.setVisible(true);
            txtNombreJugador.setText("");
            this.setVisible(false);
        }        
    }//GEN-LAST:event_BTinicioActionPerformed

    private void BTHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTHistorialActionPerformed
        Historial p2 = new Historial(mundo, this);
        p2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTHistorialActionPerformed

    private void txtNombreJugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreJugadorKeyTyped
        char TeclaPresionada= evt.getKeyChar();
        if(TeclaPresionada==KeyEvent.VK_ENTER){
            BTinicio.doClick();
        }
    }//GEN-LAST:event_txtNombreJugadorKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SofkaReto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SofkaReto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SofkaReto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SofkaReto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SofkaReto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTHistorial;
    private javax.swing.JButton BTinicio;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNombreJugador;
    // End of variables declaration//GEN-END:variables
}
