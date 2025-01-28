package constructores;

import java.util.Scanner;

public class Alumno {
	private String nombre;
	private int grupo;
	private int nota1, nota2, nota3, nota4, nota5;
	Scanner entrada = new Scanner(System.in);

	public Alumno() {

	}

	public Alumno(String n) {
		this.nombre = n;
	}

	public Alumno(String n, int g) {
		this.nombre = n;
		this.grupo = g;
	}

	public Alumno(String n, int g, int no1, int no2, int no3, int no4, int no5) {
		this.nombre = n;
		this.grupo = g;
		this.nota1 = no1;
		this.nota2 = no2;
		this.nota3 = no3;
		this.nota4 = no4;
		this.nota5 = no5;

	}

	public void pedirDatos() {
		System.out.println("\nIntroduzca los datos del aluumno:");
		System.out.println("\t\nNombre: ");
		nombre = entrada.nextLine();
		System.out.println("\t\nGrupo: ");
		grupo = entrada.nextInt();
		System.out.println("\t\nIntroduzca las calificaciones del alumno: ");
		System.out.println("\t\nIntroduce la nota del módulo 1: ");
		nota1 = entrada.nextInt();
		System.out.println("\t\nIntroduce la nota del módulo 2: ");
		nota2 = entrada.nextInt();
		System.out.println("\t\nIntroduce la nota del módulo 3: ");
		nota3 = entrada.nextInt();
		System.out.println("\t\nIntroduce la nota del módulo 4: ");
		nota4 = entrada.nextInt();
		System.out.println("\t\nIntroduce la nota del módulo 5: ");
		nota5 = entrada.nextInt();
	}
	public void mostrarDatos() {
		System.out.println("\t\tDatos de: "+ nombre);
		System.out.println("\t\nGrupo: "+grupo);
		System.out.println("\t\nNotas: "+nota1);
		System.out.println("\t\nNotas: "+nota2);
		System.out.println("\t\nNotas: "+nota3);
		System.out.println("\t\nNotas: "+nota4);
		System.out.println("\t\nNotas: "+nota5);

	}
	public void Media() {
		double media;
		media= nota1 +nota2+nota3+nota4+nota5;
		media= media/5;
		System.out.println("La media de los módulos es: "+media);
	}
	public void nSuspensos() {
		
	}
}
