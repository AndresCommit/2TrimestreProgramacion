package herencia;

import java.util.Scanner;

public class Animal {
	protected String nombre;
	protected int numCrias;

	public Animal() {		
	}
	
	public Animal(String nom, int numCrias) {
		this.nombre=nom;
		this.numCrias = numCrias;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumCrias() {
		return numCrias;
	}
	public void setNumCrias(int numCrias) {
		this.numCrias = numCrias;
	}
	
	public void pedirDatos() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Nombre: ");
		this.nombre=teclado.next();
		System.out.println("Número de crías: ");
		this.numCrias=teclado.nextInt();
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre+" Número de crías: "+this.numCrias);		
	}
	
}
