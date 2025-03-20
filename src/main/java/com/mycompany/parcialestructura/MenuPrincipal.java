
package com.mycompany.parcialestructura;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class MenuPrincipal extends javax.swing.JFrame {
    Escenario esc1 = new Escenario();
    LinkedList lista = new LinkedList();
    
    public MenuPrincipal() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        comprarEntrada = new javax.swing.JButton();
        informacionEscenario = new javax.swing.JButton();
        escMenosVisitado = new javax.swing.JButton();
        totalVisitantesEsc = new javax.swing.JButton();
        promedioVisitantes = new javax.swing.JButton();
        diaMasVisitantes = new javax.swing.JButton();
        diaMenosVisitantes = new javax.swing.JButton();
        escMasVisitado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mostrarCartelera = new javax.swing.JButton();
        consultarEntrada = new javax.swing.JButton();
        consultarInformacion = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de gestion de asistencias a escenarios ");
        jLabel1.setOpaque(true);

        comprarEntrada.setBackground(new java.awt.Color(254, 254, 254));
        comprarEntrada.setText("Comprar entrada");
        comprarEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarEntradaActionPerformed(evt);
            }
        });

        informacionEscenario.setBackground(new java.awt.Color(254, 254, 254));
        informacionEscenario.setText("Consultar información de un escenario");
        informacionEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionEscenarioActionPerformed(evt);
            }
        });

        escMenosVisitado.setBackground(new java.awt.Color(254, 254, 254));
        escMenosVisitado.setText("Escenario menos visitado");
        escMenosVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escMenosVisitadoActionPerformed(evt);
            }
        });

        totalVisitantesEsc.setBackground(new java.awt.Color(254, 254, 254));
        totalVisitantesEsc.setText("Total de visitantes");
        totalVisitantesEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalVisitantesEscActionPerformed(evt);
            }
        });

        promedioVisitantes.setBackground(new java.awt.Color(254, 254, 254));
        promedioVisitantes.setText("Promedio de visitantes");
        promedioVisitantes.setOpaque(true);
        promedioVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioVisitantesActionPerformed(evt);
            }
        });

        diaMasVisitantes.setBackground(new java.awt.Color(254, 254, 254));
        diaMasVisitantes.setText("Día con más visitantes");
        diaMasVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaMasVisitantesActionPerformed(evt);
            }
        });

        diaMenosVisitantes.setBackground(new java.awt.Color(254, 254, 254));
        diaMenosVisitantes.setText("Día con menos visitantes");
        diaMenosVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaMenosVisitantesActionPerformed(evt);
            }
        });

        escMasVisitado.setBackground(new java.awt.Color(254, 254, 254));
        escMasVisitado.setText("Escenario más visitado");
        escMasVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escMasVisitadoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entradas para bellas artes");
        jLabel2.setOpaque(true);

        mostrarCartelera.setBackground(new java.awt.Color(254, 254, 254));
        mostrarCartelera.setText("Mostrar cartelera ");
        mostrarCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCarteleraActionPerformed(evt);
            }
        });

        consultarEntrada.setBackground(new java.awt.Color(254, 254, 254));
        consultarEntrada.setText("Consultar cant entradas");
        consultarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEntradaActionPerformed(evt);
            }
        });

        consultarInformacion.setBackground(new java.awt.Color(254, 254, 254));
        consultarInformacion.setText("Consultar informacion");
        consultarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarInformacionActionPerformed(evt);
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
                            .addComponent(diaMasVisitantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escMasVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(promedioVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(escMenosVisitado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diaMenosVisitantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(informacionEscenario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comprarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultarInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrarCartelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarEntrada)
                    .addComponent(mostrarCartelera))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarEntrada)
                    .addComponent(consultarInformacion))
                .addGap(33, 33, 33))
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

    private void mostrarCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCarteleraActionPerformed
        String cartelera = "_________________________________________________\n";
        for(String pelicula: lista.getPeliculas()){
            cartelera += pelicula + " - " + "entradas vendidas \n";
            cartelera += "___________________________________________________\n";
        }
        
        JOptionPane.showMessageDialog(null, cartelera);
    }//GEN-LAST:event_mostrarCarteleraActionPerformed

    private void consultarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEntradaActionPerformed
       
        
                
                
        String documento = JOptionPane.showInputDialog("Ingrese el documento");
        JOptionPane.showMessageDialog(null, lista.contarEntradas(documento));
    }//GEN-LAST:event_consultarEntradaActionPerformed

    private void consultarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarInformacionActionPerformed
        String info = "Cantidad de mujeres que compraron entradas: " + lista.contarMujeres();
        info += "\nCantidad de hombres que compraron entradas: " + lista.contarHombres();
        info += "\nCantidad de de adultos mayores (>65): " + lista.adultosMayores();
        info += "\n" + lista.peliConMasMujeres();
        JOptionPane.showMessageDialog(null, info);
        
    }//GEN-LAST:event_consultarInformacionActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprarEntrada;
    private javax.swing.JButton consultarEntrada;
    private javax.swing.JButton consultarInformacion;
    private javax.swing.JButton diaMasVisitantes;
    private javax.swing.JButton diaMenosVisitantes;
    private javax.swing.JButton escMasVisitado;
    private javax.swing.JButton escMenosVisitado;
    private javax.swing.JButton informacionEscenario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JButton mostrarCartelera;
    private javax.swing.JButton promedioVisitantes;
    private javax.swing.JButton totalVisitantesEsc;
    // End of variables declaration//GEN-END:variables
}
