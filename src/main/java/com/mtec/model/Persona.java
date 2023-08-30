package com.mtec.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

@Column
	private String nombre;
@Column
	private String apellido;
@Column
	private int edad;


@OneToMany
private List<Mascota> listaMascota;


public Persona() {
	super();
}


public Persona(Long id, String nombre, String apellido, int edad, List<Mascota> listaMascota) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.listaMascota = listaMascota;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public List<Mascota> getListaMascota() {
	return listaMascota;
}


public void setListaMascota(List<Mascota> listaMascota) {
	this.listaMascota = listaMascota;
}




}
