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
	public String[] peliculas = {"peli1", "peli2", "peli3"};
	
	LinkedList(){
		head = null;
	}
	
	public void comprar(String documento, String nombre, LocalDate fechaNacimiento, int[] cantEntradas, String sexo){
		Estudiante estudiante = new Estudiante(documento, nombre, fechaNacimiento, sexo);
		Nodo nuevoNodo = new Nodo(estudiante, cantEntradas);
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
	
	public boolean validar(String documento){
		Nodo temp = head;
		while (temp != null){
			if (temp.getEstudiante().getNombre().equals(documento)){
				return true;
			}
			temp = temp.getEnlace();
		}
		return false;
	}
	
	public String contarEntradas(String documento){
		Nodo temp = head;
		int acco = 0;
		String nombre = "";
		loop: 
		while (temp != null){
			if (temp.getEstudiante().getNombre().equals(documento)){
				int[] entradas = temp.getCantEntradas();
				for (int i = 0; i < entradas.length; i++){
					acco += entradas[i];
				}
				nombre = temp.getEstudiante().getNombre();
				break loop;
			}
			temp = temp.getEnlace();
		}
		return "Estudiante" + nombre + "\nEntradas adquiridas: " + acco;
	}
	
	public String peliConMasMujeres(){
		Nodo temp = head;
		int peli1 = 0;
		int peli2 = 0;
		int peli3 = 0;
		while (temp != null){
			if (temp.getEstudiante().getSexo().equals("F")){
				int[] entradas = temp.getCantEntradas();
				peli1 += entradas[0];
				peli2 += entradas[1];
				peli3 += entradas[2];
			}
			temp = temp.getEnlace();
		}
		int[] comprasMujeres = {peli1, peli2, peli3};
		int mayorCompra = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < comprasMujeres.length; i++){
			if (comprasMujeres[i] > mayorCompra){
				mayorCompra = comprasMujeres[i];
				index = i;
			}
		}
		String message = "Película que más mujeres compraron: " 
			+ peliculas[index] + " con un total de " + mayorCompra + "compras";
		return message;
	}
	
	public int adultosMayores(){
		Nodo temp = head;
		int acco = 0;
		LocalDate fechaActual = LocalDate.now(); 
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
	
}
