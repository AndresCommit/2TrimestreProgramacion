package métodos;

import java.util.Scanner;

public class Actividad3Metodos {

	public static void main(String[] args) {
		System.out.println("El mayor de los 3 números es: " + numMayor());
	}

	// reciba 3 números enteros y calcula el mayor de los 3
	public static int numMayor() {
		Scanner entrada = new Scanner(System.in);
		int mayor = 0;

		for (int i = 0; i < 3; i++) { 
			System.out.println("Escribe un número entero:");
			int num = entrada.nextInt();
			if (num > mayor) { 
				mayor = num; 
			}
		}
		return mayor; 
	}
}