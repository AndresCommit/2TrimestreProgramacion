package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SocioEjemplo {

	public static void main(String[] args) {
		ArrayList<Socio> socios = new ArrayList<Socio>();
		char seguir = 'S';
		Scanner entrada = new Scanner(System.in);
		int i = 0;

		while (seguir == 's' || seguir == 'S') {
			socios.add(i, pedirDatos());
			i++;
			System.out.println("¿Deseas seguir? (S=Sí/N=No");
			seguir = entrada.next().charAt(0);

		}
		// Lista de alumnos ordenada
		System.out.println("\n\nLista de Socios Ordenada");
		Collections.sort(socios);
		for (Socio indice : socios)
			System.out.println(indice.toString());
		
		
		//Comparable implementado
		System.out.println("OPOPOSASA");
		SocioComparable so3= new SocioComparable();
		Collections.sort(socios,so3);
		for (Socio indice : socios) {
			System.out.println(indice.toString());
		}
	}

	public static Socio pedirDatos() {
		Socio socio = new Socio();
		int id;
		String nombre;
		String fechNac;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre sucio: ");
		nombre=entrada.nextLine();
		System.out.println("Identificador del sucio: ");
		id=entrada.nextInt();
		System.out.println("Introduzca la fecha de nacimiento (dd-mm-aaaa");
		fechNac=entrada.next();
		socio=new Socio(id,nombre,fechNac);
		return socio;
	}
}
