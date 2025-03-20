/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialestructura.models;

/**
 *
 * @author yorly_quintero
 */
public class Nodo {
	
	private Estudiante estudiante;
	private int[] cantEntradas;
	private Nodo enlace;

	public Nodo(Estudiante estudiante, int[] cantEntradas) {
		this.estudiante = estudiante;
		this.cantEntradas = cantEntradas;
		this.enlace = null;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}

	public int[] getCantEntradas() {
		return cantEntradas;
	}
	
}
