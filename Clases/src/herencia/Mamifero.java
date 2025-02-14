package herencia;

import java.util.Scanner;

public class Mamifero extends Animal{
	protected int numHuesos;
	protected int numExtrem;
	
	public Mamifero() {
		super();
	}

	public Mamifero(int numHuesos, int numExtrem) {
		super();
		this.numHuesos = numHuesos;
		this.numExtrem = numExtrem;
	}

	public int getNumHuesos() {
		return this.numHuesos;
	}

	public void setNumHuesos(int numHuesos) {
		this.numHuesos = numHuesos;
	}

	public int getNumExtrem() {
		return this.numExtrem;
	}

	public void setNumExtrem(int numExtrem) {
		this.numExtrem = numExtrem;
	}
	
	public void pedirDatos() {
		Scanner teclado=new Scanner(System.in);
		super.pedirDatos();
		System.out.println("Número de huesos: ");
		this.numHuesos=teclado.nextInt();
		System.out.println("Número de extremidades: ");
		this.numExtrem=teclado.nextInt();
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Número de huesos: "+this.numHuesos);
		System.out.println("Número de extremidades: "+this.numExtrem);
	}
}
