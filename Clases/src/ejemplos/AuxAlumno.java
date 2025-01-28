package ejemplos;

import java.util.Scanner;

public class AuxAlumno {
	private String nombre;

	private int edad;

	String getNombre() {
		return nombre;
	}

	void setNombre(String n) {
		this.nombre = n;
	}

	int getEdad() {
		return edad;
	}

	void setEdad(int e) {
		this.edad = e;
	}

	void guardarDatos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el nombre del alumno: ");
		nombre = entrada.nextLine();
		System.out.println("Introduzca la edad del alumno");
		edad = entrada.nextInt();
	}

	void mostrarDatos() {
		System.out.println("El alumno " + getNombre() + " tiene " + getEdad() + " años.");

	}
	
}
