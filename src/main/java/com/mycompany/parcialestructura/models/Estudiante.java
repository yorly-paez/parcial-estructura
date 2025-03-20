/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialestructura.models;

import java.time.LocalDate;

/**
 *
 * @author yorly_quintero
 */
public class Estudiante {
	
	private String documento;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String sexo;

	public Estudiante(String documento, String nombre, LocalDate fechaNacimiento, String sexo) {
		this.documento = documento;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
