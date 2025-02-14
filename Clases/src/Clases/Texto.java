package Clases;

import java.time.*;
import java.util.Scanner;

public class Texto {
	private String cadena;
	private final int LONGMAX;
	private LocalDate fCreac;
	private LocalDateTime fModif;
	static final String VOCALES = "aeiouáéíóú";
	Scanner entrada= new Scanner (System.in);

	// constructor
	public Texto(int lon) {
		this.cadena = "";
		this.LONGMAX = lon;
		this.fCreac = LocalDate.now();
		this.fModif = null;
	}

	public void addFinal(char c) {
		if(this.LONGMAX>this.cadena.length()) {
			//añadimos
			this.cadena=this.cadena+c;
			this.fModif=LocalDateTime.now();
		}
	}
	
	// mostrar datos
	public void mostrarDatos() {
		System.out.println("Cadena: " + this.cadena);
		System.out.println("Fecha Objeto Texto: " + this.fCreac);
		System.out.println("Fecha de última modificación: " + this.fModif);
	}
	/*
	
	 Marcar longitud maxima de la cadena con un método 
	 
	 */

	public int longitudMax(int lon) {
		Scanner entrada= new int lon (System.in);
		return lon;
		
	}
	
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public LocalDate getfCreac() {
		return fCreac;
	}

	public void setfCreac(LocalDate fCreac) {
		this.fCreac = fCreac;
	}

	public LocalDateTime getfModif() {
		return fModif;
	}

	public void setfModif(LocalDateTime fModif) {
		this.fModif = fModif;
	}

	public int getLONGMAX() {
		return LONGMAX;
	}
}
