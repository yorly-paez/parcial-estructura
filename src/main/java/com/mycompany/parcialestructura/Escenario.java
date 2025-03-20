
package com.mycompany.parcialestructura;


public class Escenario {
	
	public int[][] asistencias = {{23, 78, 34, 23, 45, 23},
				      {67, 45, 67, 45, 46, 34},
				      {89, 23, 88, 66, 55, 56},
				      {54, 26, 48, 19, 21, 78}};
	public String[] escenarios = {"GYM", "Teatro Bellas Artes", 
		"Canchas Sintéticas", "Restaurante Escolar"};
	public String[] diasSemana = {"Lunes", "Martes", "Miercoles", 
		"Jueves", "Viernes", "Sabado"};
	
	
	public String escenarioMasVisitado(){
		int mayorVisitas = Integer.MIN_VALUE;
		String escenario = "";
		for (int f = 0; f < asistencias.length; f++){
			int visitas = 0;
			for (int c = 0; c < asistencias[f].length; c++){
				visitas += asistencias[f][c];
			}
			if (visitas > mayorVisitas){
				mayorVisitas = visitas;
				escenario = escenarios[f];
			}
		}
		String message = "Escenario con mayor número de visitas: " + escenario 
		+ "\nTotal de visitas en la semana: " + mayorVisitas;
		return message;
	}
	
	public String escenarioMenosVisitado(){
		int menorVisitas = Integer.MAX_VALUE;
		String escenario = "";
		for (int f = 0; f < asistencias.length; f++){
			int visitas = 0;
			for (int c = 0; c < asistencias[f].length; c++){
				visitas += asistencias[f][c];
			}
			if (visitas < menorVisitas){
				menorVisitas = visitas;
				escenario = escenarios[f];
			}
		}
		String message = "Escenario con menor número de visitas: " + escenario 
		+ "\nTotal de visitas en la semana: " + menorVisitas;
		return message;
	}
	
	/*El siguiente método retorna el índice del día con menor cantidad de   
	visitas, para esto recibe por parametro el número del índice    
	correspondiente al escenario en específico que se desea analizar*/
	public String diaMasVisitado(int n){
		String dia = "";
		int visitas = 0;
		int mayorCantidadVisitas = Integer.MIN_VALUE;
		//Se recorre la fila correspondiente al escenario
		for (int c = 0; c < asistencias[n].length; c++){
			visitas += asistencias[n][c];
			if (visitas > mayorCantidadVisitas){
				mayorCantidadVisitas = visitas;
				dia = diasSemana[c];
			}
			visitas = 0;
		}
		String message = "Escenario: " + escenarios[n] + 
		"\nDía con mayor numero de visitas: " + dia +
		"\nCantidad: " + mayorCantidadVisitas;
		return message;
	}
	
	/*Parecido al metodo anterior pero retorna el día con menor cantidad de 
	visitas para un escenario en específico*/
	public String diaMenosVisitado(int n){
		String dia = "";
		int visitas = 0;
		int menorCantidadVisitas = Integer.MAX_VALUE;
		//Se recorre la fila correspondiente al escenario
		for (int c = 0; c < asistencias[n].length; c++){
			visitas += asistencias[n][c];
			if (visitas < menorCantidadVisitas){
				menorCantidadVisitas = visitas;
				dia = diasSemana[c];
			}
			visitas = 0;
		}
		String message = "Escenario: " + escenarios[n] + 
		"\nDía con mayor numero de visitas: " + dia +
		"\nCantidad: " + menorCantidadVisitas;
		return message;
	}
	
	//Día con menor número de visitas en toda la semana
	public String diaConMenosVisitas(){
		int filas = asistencias.length;
		int columnas = asistencias[0].length;
		int menosAsistencias = Integer.MAX_VALUE;
		String dia = "";
		for (int j = 0; j < columnas; j++){
			int visitas = 0;
			for (int i = 0; i < filas; i++){
				visitas += asistencias[i][j];
			}
			if (visitas < menosAsistencias){
				menosAsistencias = visitas;
				dia = diasSemana[j];
			}
		}
		String message = "Día de la semana con menor número de visitas: " 
			+ dia + "\nCantidad en total: " + menosAsistencias;
		return message;
	}
	
	//Día con mayor número de visitas en toda la semana
	public String diaConMasVisitas(){
		int filas = asistencias.length;
		int columnas = asistencias[0].length;
		int masAsistencias = Integer.MIN_VALUE;
		String dia = "";
		for (int j = 0; j < columnas; j++){
			int visitas = 0;
			for (int i = 0; i < filas; i++){
				visitas += asistencias[i][j];
			}
			if (visitas > masAsistencias){
				masAsistencias = visitas;
				dia = diasSemana[j];
			}
		}
		String message = "Día de la semana con mayor número de visitas: " 
			+ dia + "\nCantidad en total: " + masAsistencias;
		return message;
	}
	
	//Promedio de visitantes por día en la semana 
	public String promedioTotal(){
		double accu = 0;
		double acco = 6; //Valor fijo (Número de días en la semana)
		for (int f = 0; f < asistencias.length; f++){
			for (int c = 0; c < asistencias[f].length; c++){
				accu += asistencias[f][c];
			}
		}
		double promedio = (double) accu / acco;
		double promedioRedondeado = Math.round(promedio * 100.0) / 100.0;
		return "El promedio de visitas por día en los escenarios fue de : " 
			+ promedioRedondeado;
	}
	
	//Promedio de visitantes por día para un escenario en específico
	public double promediarVisitantes(int n){
		double accu = 0;
		double acco = 6; //Valor fijo (Número de días en la semana)
		for (int c = 0; c < asistencias[n].length; c++){
			accu += asistencias[n][c];
		}
		return accu / acco;
	}
	
	//Total de visitas en la semana
	public int totalVisitas(){
		int visitas = 0;
		for (int f = 0; f < asistencias.length; f++){
			for (int c = 0; c < asistencias[f].length; c++){
				visitas += asistencias[f][c];
			}
		}
		return visitas;
	}
	
}
