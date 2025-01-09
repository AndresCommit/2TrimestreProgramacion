package métodos;

import java.util.Scanner;

public class Actividad4Métodos {
	public static void main(String[] args) {
		// leer un número natural por teclado
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserta un número para saber la suma de sus anteriores:  ");
		int num = entrada.nextInt();
		sumaNum(num);
	}

	public static void sumaNum(int num) {
				int suma=0;
		int cont = 0;
		for (int i = 0; i <= num; i++) {
			suma = i +suma;
		}
		System.out.println("La suma es: "+suma);
	}
}
