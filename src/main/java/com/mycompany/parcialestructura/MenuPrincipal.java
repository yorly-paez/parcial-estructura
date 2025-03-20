
package com.mycompany.parcialestructura;

import java.awt.Color;
import javax.swing.JOptionPane;


public class MenuPrincipal extends javax.swing.JFrame {
    Escenario esc1 = new Escenario();
    
    public MenuPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jMenu1 = new javax.swing.JMenu();
                jLabel1 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                separador = new javax.swing.JSeparator();
                masVisitasRestaurante = new javax.swing.JButton();
                escMenosVisitado = new javax.swing.JButton();
                totalVisitantesEsc = new javax.swing.JButton();
                promedioVisitantes = new javax.swing.JButton();
                diaMasVisitantes = new javax.swing.JButton();
                diaMenosVisitantes = new javax.swing.JButton();
                escMasVisitado = new javax.swing.JButton();
                jComboBox1 = new javax.swing.JComboBox<>();

                jMenu1.setText("jMenu1");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(250, 250, 250));

                jLabel1.setBackground(new java.awt.Color(255, 51, 51));
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Sistema de gestion de asistencias a escenarios ");
                jLabel1.setOpaque(true);

                jButton1.setText("comprar entrada");

                masVisitasRestaurante.setText("Dia con más visitas para el restaurante");
                masVisitasRestaurante.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                masVisitasRestauranteActionPerformed(evt);
                        }
                });

                escMenosVisitado.setText("Escenario menos visitado");
                escMenosVisitado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                escMenosVisitadoActionPerformed(evt);
                        }
                });

                totalVisitantesEsc.setText("Total de visitantes");
                totalVisitantesEsc.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                totalVisitantesEscActionPerformed(evt);
                        }
                });

                promedioVisitantes.setText("Promedio de visitantes");
                promedioVisitantes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                promedioVisitantesActionPerformed(evt);
                        }
                });

                diaMasVisitantes.setText("Dia con mas visitantes");
                diaMasVisitantes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                diaMasVisitantesActionPerformed(evt);
                        }
                });

                diaMenosVisitantes.setText("Dia con menos visitantes");
                diaMenosVisitantes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                diaMenosVisitantesActionPerformed(evt);
                        }
                });

                escMasVisitado.setText("Escenario mas visitado");
                escMasVisitado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                escMasVisitadoActionPerformed(evt);
                        }
                });

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el escenario", "GYM", "Teatro Bellas Artes", "Canchas sintéticas", "Restaurantes escolar" }));
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(totalVisitantesEsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(masVisitasRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(escMenosVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(escMasVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(promedioVisitantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(diaMasVisitantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(diaMenosVisitantes, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(separador)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(promedioVisitantes)
                                        .addComponent(escMasVisitado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(masVisitasRestaurante)
                                        .addComponent(diaMasVisitantes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(escMenosVisitado)
                                        .addComponent(diaMenosVisitantes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalVisitantesEsc)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(0, 44, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void totalVisitantesEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalVisitantesEscActionPerformed
        JOptionPane.showMessageDialog(null, "El total de visitas a los escenarios "
		+ "durante la semana fue de : " + esc1.totalVisitas());
    }//GEN-LAST:event_totalVisitantesEscActionPerformed

    private void escMenosVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escMenosVisitadoActionPerformed
        JOptionPane.showMessageDialog(null, esc1.escenarioMenosVisitado());
    }//GEN-LAST:event_escMenosVisitadoActionPerformed

    private void masVisitasRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masVisitasRestauranteActionPerformed
        JOptionPane.showMessageDialog(null, esc1.diaMasVisitado(3));
    }//GEN-LAST:event_masVisitasRestauranteActionPerformed

    private void promedioVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioVisitantesActionPerformed
        JOptionPane.showMessageDialog(null, esc1.promedioTotal());
    }//GEN-LAST:event_promedioVisitantesActionPerformed

    private void escMasVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escMasVisitadoActionPerformed
        JOptionPane.showMessageDialog(null, esc1.escenarioMasVisitado());
    }//GEN-LAST:event_escMasVisitadoActionPerformed

    private void diaMasVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaMasVisitantesActionPerformed
	JOptionPane.showMessageDialog(null, esc1.diaConMasVisitas());
    }//GEN-LAST:event_diaMasVisitantesActionPerformed

    private void diaMenosVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaMenosVisitantesActionPerformed
        JOptionPane.showMessageDialog(null, esc1.diaConMenosVisitas());
    }//GEN-LAST:event_diaMenosVisitantesActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton diaMasVisitantes;
        private javax.swing.JButton diaMenosVisitantes;
        private javax.swing.JButton escMasVisitado;
        private javax.swing.JButton escMenosVisitado;
        private javax.swing.JButton jButton1;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JButton masVisitasRestaurante;
        private javax.swing.JButton promedioVisitantes;
        private javax.swing.JSeparator separador;
        private javax.swing.JButton totalVisitantesEsc;
        // End of variables declaration//GEN-END:variables
}
