
package com.mycompany.parcialestructura;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class MenuPrincipal extends javax.swing.JFrame {
    Escenario esc1 = new Escenario();
    LinkedList lista = new LinkedList();
    public String[] peliculas = {"Avatar", "Avengers Endgame", "Titanic"};
    public int[] ventas = {0, 0, 0};
    
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
                textName = new javax.swing.JTextField();
                textDocument = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                textFecha = new javax.swing.JTextField();
                selectSex = new javax.swing.JComboBox<>();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                peliAvatar = new javax.swing.JCheckBox();
                peliAvengers = new javax.swing.JCheckBox();
                peliTitanic = new javax.swing.JCheckBox();
                nombreE = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                fechaE = new javax.swing.JLabel();
                peliE = new javax.swing.JLabel();
                documentoE = new javax.swing.JLabel();

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
                comprarEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

                textName.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                textNameActionPerformed(evt);
                        }
                });

                jLabel3.setText("Nombre");

                jLabel4.setText("Documento");

                jLabel5.setText("Fecha Nacimiento");

                selectSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
                selectSex.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                selectSexActionPerformed(evt);
                        }
                });

                jLabel6.setText("Sexo");

                jLabel7.setText("Selecciona tus entradas");

                peliAvatar.setText("Avatar");

                peliAvengers.setText("Avengers EndGame");

                peliTitanic.setText("Titanic");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(consultarEntrada)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(nombreE)
                                                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(47, 47, 47)
                                                                                .addComponent(jLabel8))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(documentoE)
                                                                                .addGap(118, 118, 118)
                                                                                .addComponent(fechaE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(36, 36, 36)
                                                                                .addComponent(jLabel4)
                                                                                .addGap(59, 59, 59)
                                                                                .addComponent(jLabel5))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(textDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(peliAvatar)
                                                                                .addGap(266, 266, 266)))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(79, 79, 79))))
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
                                                .addGap(264, 264, 264)
                                                .addComponent(peliE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(197, 197, 197)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(peliAvengers)
                                                                        .addComponent(jLabel7)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(211, 211, 211)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(comprarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mostrarCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(consultarInformacion)
                                                        .addComponent(peliTitanic))))
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
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombreE)
                                        .addComponent(jLabel8)
                                        .addComponent(fechaE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(documentoE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(peliAvengers)
                                        .addComponent(peliAvatar)
                                        .addComponent(peliTitanic))
                                .addGap(49, 49, 49)
                                .addComponent(peliE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprarEntrada)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(consultarEntrada)
                                        .addComponent(consultarInformacion)
                                        .addComponent(mostrarCartelera))
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
                
		String name = textName.getText();
		String doc = textDocument.getText();
		String fechaString = textFecha.getText();
		LocalDate fecha = LocalDate.parse(fechaString);
		String sex = ((String) selectSex.getSelectedItem() == "Femenino") ? "F": "M";
		int cantAvatar = (peliAvatar.isSelected()) ? 1 : 0;
		int cantAvengers = (peliAvengers.isSelected()) ? 1 : 0;
		int cantTitanic = (peliTitanic.isSelected()) ? 1 : 0;
		
		
		int [] cantEntradas = {cantAvatar, cantAvengers, cantTitanic};
		lista.comprar(doc, name, fecha, cantEntradas, sex);
		if (validarFormulario(name, doc, fechaString, sex, cantEntradas) == true){	
			JOptionPane.showMessageDialog(null, "Compra exitosa");
			textName.setText("");
			textDocument.setText("");
			textFecha.setText("");
			peliAvatar.setSelected(false);
			peliAvengers.setSelected(false);
			peliTitanic.setSelected(false);
			for (int i = 0; i < ventas.length; i++){
				ventas[i] += cantEntradas[i];
			}
		}
		
        }//GEN-LAST:event_comprarEntradaActionPerformed

    private void mostrarCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCarteleraActionPerformed
        String cartelera = "_________________________________________________\n";
        for(int i = 0; i < peliculas.length; i++){
            cartelera += "Película: " + peliculas[i] + "\nEntradas vendidas: "
		    + ventas[i] + "\n";
        }
        cartelera += "___________________________________________________";
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

    private boolean validarFormulario(String name, String doc, String fecha, String sex, int[] cantEntradas) {
    // Validar nombre
    if (name.isEmpty() || name.length() > 50) {
        nombreE.setText("El nombre no puede estar vacío ni exceder 50 caracteres.");
        return false;
    }

    // Validar documento
    if (doc.isEmpty() || doc.length() > 10 || !doc.matches("\\d+")) {
        documentoE.setText("El documento debe ser numérico y no exceder 10 dígitos.");
        return false;
    }

    // Validar fecha (formato YYYY-MM-DD)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    try {
        LocalDate.parse(fecha, formatter);
    } catch (DateTimeParseException e) {
        fechaE.setText("La fecha debe estar en formato YYYY-MM-DD.");
        return false;
    }

    // Validar selección de películas (al menos una película debe ser seleccionada)
    int totalPeliculasSeleccionadas = 0;
    for (int i = 0; i < cantEntradas.length; i++) {
        totalPeliculasSeleccionadas += cantEntradas[i];
    }
    if (totalPeliculasSeleccionadas == 0) {
        peliE.setText("Debe seleccionar al menos una película.");
        return false;
    }

    return true;
}

        private void selectSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_selectSexActionPerformed

        private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_textNameActionPerformed

    
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
        private javax.swing.JLabel documentoE;
        private javax.swing.JButton escMasVisitado;
        private javax.swing.JButton escMenosVisitado;
        private javax.swing.JLabel fechaE;
        private javax.swing.JButton informacionEscenario;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JButton mostrarCartelera;
        private javax.swing.JLabel nombreE;
        private javax.swing.JCheckBox peliAvatar;
        private javax.swing.JCheckBox peliAvengers;
        private javax.swing.JLabel peliE;
        private javax.swing.JCheckBox peliTitanic;
        private javax.swing.JButton promedioVisitantes;
        private javax.swing.JComboBox<String> selectSex;
        private javax.swing.JTextField textDocument;
        private javax.swing.JTextField textFecha;
        private javax.swing.JTextField textName;
        private javax.swing.JButton totalVisitantesEsc;
        // End of variables declaration//GEN-END:variables
}
