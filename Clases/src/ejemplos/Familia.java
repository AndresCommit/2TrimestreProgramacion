package ejemplos;

import java.util.Scanner;

public class Familia {
	private String nombre;
	private static String direccion;
	private int edad;
	Scanner entrada = new Scanner(System.in);

	public Familia(String n, String dir, int edad) {
		String nombre = n;
		System.out.println("Introduce el nombre del miembro familiar: ");
		n = entrada.nextLine();
		System.out.println("Introduce la dirección");
		dir = entrada.nextLine();
		System.out.println("Introduce la edad del miembro familiar");

     	}

	public String getNombre(String n) {
		String nombre = n;
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

}
