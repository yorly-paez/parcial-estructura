/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialestructura;

import com.mycompany.parcialestructura.models.Estudiante;
import com.mycompany.parcialestructura.models.Nodo;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author yorly_quintero
 */
public class LinkedList {
	Nodo head;
	public LocalDate fechaActual = LocalDate.now(); 
	
	LinkedList(){
		head = null;
	}
	
	public void comprar(String documento, String nombre, LocalDate fechaNacimiento, String pelicula, String sexo){
		Estudiante estudiante = new Estudiante(documento, nombre, fechaNacimiento, sexo);
		Nodo nuevoNodo = new Nodo(estudiante, pelicula);
		if (head == null){
			head = nuevoNodo;
		} else {
			Nodo temp = head; //Nodo para recorrer la lista
			while (temp.getEnlace() != null){
				temp = temp.getEnlace();
			}
			temp.setEnlace(nuevoNodo);
		}
	}
	
	public int adultosMayores(){
		Nodo temp = head;
		int acco = 0;
		while (temp != null){
			LocalDate fechaNacimiento = temp.getEstudiante().getFechaNacimiento();
			int age = Period.between(fechaNacimiento, fechaActual).getYears();
			if (age > 65){
				acco++;
			}
			temp = temp.getEnlace();
		}
		return acco;
	}
	
	public int contarHombres(){
		Nodo temp = head;
		int acco = 0;
		while (temp != null){
			if (temp.getEstudiante().getSexo().equals("M")){
				acco++;
			}
			temp = temp.getEnlace();
		}
		return acco;
	}
	
	public int contarMujeres(){
		Nodo temp = head;
		int acco = 0;
		while (temp != null){
			if (temp.getEstudiante().getSexo().equals("F")){
				acco++;
			}
			temp = temp.getEnlace();
		}
		return acco;
	}
	/*Si la lista esta vacia los botones deben estar bloquedos menos el de comprar 
	Solo se puede comprar una entrada para una película
	*/
}
