
package com.mycompany.parcialestructura;


public class Escenario {
	
	public int[][] asistencias = {{23, 78, 34, 23, 45, 23},
				      {67, 45, 67, 45, 46, 34},
				      {89, 23, 88, 66, 55, 56},
				      {54, 26, 48, 19, 21, 78}};
	public String[] escenarios = {"GYM", "Teatro Bellas Artes", 
		"Canchas Sinteticas", "Restaurante Escolar"};
	public String[] diasSemana = {"Lunes", "Martes", "Miercoles", 
		"Jueves", "Viernes", "Sabado"};
	
	
	public String escenarioMasVisitado(){
		int visitas = 0;
		int mayorVisitas = Integer.MIN_VALUE;
		String escenario = "";
		for (int f = 0; f < asistencias.length; f++){
			for (int c = 0; c < asistencias[f].length; c++){
				visitas += asistencias[f][c];
			}
			if (visitas > mayorVisitas){
				mayorVisitas = visitas;
				escenario = escenarios[f];
			}
		}
		return escenario;
	}
	
	public String escenarioMenosVisitado(){
		int visitas = 0;
		int menorVisitas = Integer.MAX_VALUE;
		String escenario = "";
		for (int f = 0; f < asistencias.length; f++){
			for (int c = 0; c < asistencias[f].length; c++){
				visitas += asistencias[f][c];
			}
			if (visitas < menorVisitas){
				menorVisitas = visitas;
				escenario = escenarios[f];
			}
		}
		return escenario;
	}
	
	/*El siguiente método retorna el índice del día con menor cantidad de   
	visitas, para esto recibe por parametro el número del índice    
	correspondiente al escenario en específico que sedesea analizar*/
	public int diaMasVisitado(int n){
		int dia = 0;
		int visitas = 0;
		int mayorCantidadVisitas = Integer.MIN_VALUE;
		//Se recorre la fila correspondiente al escenario
		for (int c = 0; c < asistencias[n].length; c++){
			visitas += asistencias[n][c];
			if (visitas > mayorCantidadVisitas){
				mayorCantidadVisitas = visitas;
				dia = c;
			}
		}
		return dia;
	}
	
	/*Parecido al metodo anterior pero retorna el día con menor cantidad de 
	visitas para un escenario en específico*/
	public int diaMenosVisitado(int n){
		int dia = 0;
		int visitas = 0;
		int menorCantidadVisitas = Integer.MAX_VALUE;
		//Se recorre la fila correspondiente al escenario
		for (int c = 0; c < asistencias[n].length; c++){
			visitas += asistencias[n][c];
			if (visitas < menorCantidadVisitas){
				menorCantidadVisitas = visitas;
				dia = c;
			}
		}
		return dia;
	}
	
	public String diaConMenosVisitas(){
		String dia = "";
		int visitas = 0;
		int menosVisitas = Integer.MAX_VALUE;
		for (int c = 0; c < asistencias[0].length; c++){
			for (int f = 0; f < asistencias.length; c++){
				visitas += asistencias[c][f];
			}
			if (visitas < menosVisitas){
				menosVisitas = visitas;
				dia = diasSemana[c];
			}
		}
		return dia;
	}
	
	public String diaConMasVisitas(){
		String dia = "";
		int visitas = 0;
		int mayorVisitas = Integer.MIN_VALUE;
		for (int c = 0; c < asistencias[0].length; c++){
			for (int f = 0; f < asistencias.length; c++){
				visitas += asistencias[c][f];
			}
			if (visitas > mayorVisitas){
				mayorVisitas = visitas;
				dia = diasSemana[c];
			}
		}
		return dia;
	}
	
	//Promedio de visitantes por día en la semana 
	public double promedioTotal(){
		double accu = 0;
		double acco = 6; //Valor fijo (Número de días en la semana)
		for (int f = 0; f < asistencias.length; f++){
			for (int c = 0; c < asistencias[f].length; c++){
				accu += asistencias[f][c];
			}
		}
		return accu / acco;
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
