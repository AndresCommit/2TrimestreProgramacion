package ejemplos;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private float sueldo;
	private float sueldoComparado;
	void pedirDatos() {
		Scanner teclado= new Scanner (System.in);
		System.out.println("Inserte el nombre del empleado");
		nombre=teclado.nextLine();
		System.out.println("Inserta el sueldo del empleado");
		sueldo=teclado.nextFloat();
	}
	
	void datosEmpleado() {
		System.out.println("\t>>Nombre:"+nombre);
		System.out.println("\t>>Sueldo:"+sueldo);
	}
	
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo (float sueldo) {
		this.sueldo=sueldo;
	}
	public String getNombre() {
	return nombre;
		
	}
}