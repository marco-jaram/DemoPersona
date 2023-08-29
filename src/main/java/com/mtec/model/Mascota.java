package com.mtec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mascota {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_mascota;
@Column
	private String nombre;
@Column
	private String especie;
@Column
	private String raza;
@Column
	private String color;

	public Mascota() {
		super();
	}

	public Mascota(Long id_mascota, String nombre, String especie, String raza, String color) {
		super();
		this.id_mascota = id_mascota;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.color = color;
	}

	public Long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
