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
	private String pelicula;
	private Nodo enlace;

	public Nodo(Estudiante estudiante, String pelicula) {
		this.estudiante = estudiante;
		this.pelicula = pelicula;
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

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
}
