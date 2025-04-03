package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import ArrayList.AluComparable;
import ArrayList.Alumno;

public class ejercicio20 {
	public static void main(String[] args) {

		ArrayList<Empleado> empleado = new ArrayList<Empleado>();
		char seguir = 'S';
		Scanner teclado = new Scanner(System.in);
		int i = 0;

		while (seguir == 's' || seguir == 'S') {
			empleado.add(i, pedirDatos());
			i++;
			System.out.println("¿Deseas seguir? (S=Sí/N=No");
			seguir = teclado.next().charAt(0);

			}

		// Lista de alumnos ordenada
		System.out.println("\n\nLista de Empleados Ordenada");
		Collections.sort(empleado);
		for (Empleado indice : empleado)
			System.out.println(indice.toString());
	
	
	EmpleadoCom em3= new EmpleadoCom();
	Collections.sort(empleado,em3);
}
	public static Empleado pedirDatos() {
		Empleado empleado = new Empleado();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre empleado: ");
		empleado.setNombre(teclado.nextLine());
		System.out.println("Sueldo del empleado: ");
		empleado.setSueldo(teclado.nextFloat());
		return empleado;
	}
}
