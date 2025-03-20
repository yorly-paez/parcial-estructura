
package com.mycompany.parcialestructura;

import java.awt.Color;
import javax.swing.JComboBox;
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
        comprarEntrada = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        informacionEscenario = new javax.swing.JButton();
        escMenosVisitado = new javax.swing.JButton();
        totalVisitantesEsc = new javax.swing.JButton();
        promedioVisitantes = new javax.swing.JButton();
        diaMasVisitantes = new javax.swing.JButton();
        diaMenosVisitantes = new javax.swing.JButton();
        escMasVisitado = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de gestion de asistencias a escenarios ");
        jLabel1.setOpaque(true);

        comprarEntrada.setText("comprar entrada");
        comprarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarEntradaActionPerformed(evt);
            }
        });

        informacionEscenario.setText("Consultar información de un escenario");
        informacionEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionEscenarioActionPerformed(evt);
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

        diaMasVisitantes.setText("Día con más visitantes");
        diaMasVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaMasVisitantesActionPerformed(evt);
            }
        });

        diaMenosVisitantes.setText("Día con menos visitantes");
        diaMenosVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaMenosVisitantesActionPerformed(evt);
            }
        });

        escMasVisitado.setText("Escenario más visitado");
        escMasVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escMasVisitadoActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(separador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalVisitantesEsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(diaMasVisitantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escMasVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(promedioVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(escMenosVisitado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diaMenosVisitantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(informacionEscenario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(comprarEntrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalVisitantesEsc)
                    .addComponent(promedioVisitantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaMasVisitantes)
                    .addComponent(diaMenosVisitantes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escMenosVisitado)
                    .addComponent(escMasVisitado))
                .addGap(18, 18, 18)
                .addComponent(informacionEscenario)
                .addGap(25, 25, 25)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comprarEntrada)
                .addGap(0, 38, Short.MAX_VALUE))
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

    private void informacionEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionEscenarioActionPerformed
        String[] escenarios = {"GYM", "Teatro Bellas Artes", "Canchas Sintéticas" , "Restaurante Escolar"};

    // Crear el JComboBox con las opciones
    JComboBox<String> comboBox = new JComboBox<>(escenarios);

    // Mostrar un cuadro de diálogo con el JComboBox
    int opcion = JOptionPane.showConfirmDialog(
        this, // El JFrame principal
        comboBox, // El JComboBox dentro del cuadro de diálogo
        "Seleccione un Escenario", // Título del cuadro
        JOptionPane.OK_CANCEL_OPTION, // Botones OK y Cancel
        JOptionPane.QUESTION_MESSAGE // Icono de pregunta
    );

    // Verificar si el usuario presionó "OK"
    if (opcion == JOptionPane.OK_OPTION) {
        String seleccionado = (String) comboBox.getSelectedItem(); // Obtener la opción seleccionada
        int index;
	switch (seleccionado){
		case "GYM":	
			index = 0;
			break;
		case "Teatro Bellas Artes":
			index = 1;
			break;
		case "Canchas Sintéticas":
			index = 2;
			break;
		case "Restaurante Escolar":
			index = 3;
			break;
		default:
			index = -1;
	}
	String diaMas = esc1.diaMasVisitado(index);
	String diaMenos = esc1.diaMenosVisitado(index);
	String promedio = esc1.promediarVisitantes(index);
	String message = "Escenario: " + seleccionado + "\n"
		+ diaMas + "\n" + diaMenos + "\n" + promedio;
	JOptionPane.showMessageDialog(this, message); 
    }
    }//GEN-LAST:event_informacionEscenarioActionPerformed

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

        private void comprarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarEntradaActionPerformed
                MenuSecundario menuS = new MenuSecundario();
                menuS.setVisible(true);
        }//GEN-LAST:event_comprarEntradaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprarEntrada;
    private javax.swing.JButton diaMasVisitantes;
    private javax.swing.JButton diaMenosVisitantes;
    private javax.swing.JButton escMasVisitado;
    private javax.swing.JButton escMenosVisitado;
    private javax.swing.JButton informacionEscenario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JButton promedioVisitantes;
    private javax.swing.JSeparator separador;
    private javax.swing.JButton totalVisitantesEsc;
    // End of variables declaration//GEN-END:variables
}
