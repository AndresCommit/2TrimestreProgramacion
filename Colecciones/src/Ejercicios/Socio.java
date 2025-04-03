package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Socio implements Comparable{
	private int id;
	private String nombre;
	LocalDate fechaNacimiento;
	
	public Socio(int id, String nombre, String fechaNacimiento) {		
		this.id = id;
		this.nombre = nombre;
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		this.fechaNacimiento=LocalDate.parse(fechaNacimiento,f);
	}
	public Socio() {
		
	}
	public int edad() {
		int años=(int) this.fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
		return(años);
	}	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	
	public int compareTo(Object ob) {
		int resul;
		Socio otroS=(Socio) ob;
		if (this.id<otroS.id)
			resul=-1;
		else
			if (this.id==otroS.id)
				resul=0;
			else
				resul=1;
		return (resul);
	}
	
	
	public boolean equals(Object soc) {
		boolean iguales;		
		Socio otroS=(Socio) soc;
		if (this==soc)
			iguales=true;
		if (soc==null)
			iguales=false;
		if (this.getClass()!=soc.getClass())
			iguales=false;
		if (this.id==otroS.id)
			iguales=true;
		else
			iguales=false;
		return iguales;
		
		//Otra forma más compacta:
		//return (this.id==(((Socio) soc).id));
		
	}
	
	public int hashCode() {
		return(this.id);
	}
	
	
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}	
	

}
