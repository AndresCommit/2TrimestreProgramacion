package ejemplos;

import java.util.Iterator;
import java.util.Scanner;

public class AuxAlumnoBis {
	public static void main(String[] args) {
		int i;
		AuxAlumno alumnos[] = new AuxAlumno[3];
		Scanner entrada = new Scanner(System.in);
		System.out.println("--Toma de datos de los Alumnos--");
		float me = 0.0f;
		for (i = 0; i < 3; i++) {
			System.out.println("Alumno " + (i + 1) + ": ");
			alumnos[i] = new AuxAlumno();
			System.out.println("Nombre: ");
			alumnos[i].setNombre(entrada.nextLine());
			System.out.println("Edad: ");
			alumnos[i].setEdad(entrada.nextInt());
			me = me + alumnos[i].getEdad();
			System.out.println("La media es: "+me/3);
		}

	}
}
