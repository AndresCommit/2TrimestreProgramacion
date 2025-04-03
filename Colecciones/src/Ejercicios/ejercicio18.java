package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ArrayList.Alumno;

public class ejercicio18 {
	public static void main(String[] args) {
		
		ArrayList<Empleado> empleado = new ArrayList<Empleado>();
		char seguir='S';
		Scanner teclado = new Scanner (System.in);
		int i = 0;
		
		while(seguir=='s' || seguir=='S') {
			empleado.add(i,pedirDatos());
			i++;
			System.out.println("¿Deseas seguir? (S=Sí/N=No");
			seguir=teclado.next().charAt(0);
		
		for (Empleado empleado2 : empleado) {	
			System.out.println(empleado2.toString());
			}
		}
		
		
	}
	public static Empleado pedirDatos() {
		Empleado empleado=new Empleado();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre empleado: ");
		empleado.setNombre(teclado.nextLine());
		System.out.println("Sueldo del empleado: ");
		empleado.setSueldo(teclado.nextFloat());
		return empleado;
	}
}
