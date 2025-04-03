package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[20];
		boolean[] repetidos = new boolean[20];

		// Pedir 20 enteros
		System.out.println("Introduce 20 números enteros:");
		for (int i = 0; i < 20; i++) {
			numeros[i] = scanner.nextInt();
		}

		// Mostrar números repetidos
		System.out.println("Números repetidos:");
		for (int i = 0; i < 20; i++) {
			for (int j = i + 1; j < 20; j++) {
				if (numeros[i] == numeros[j]) {
					repetidos[i] = true;
				}
			}
		}

		for (int i = 0; i < 20; i++) {
			if (repetidos[i] && (i == 0 || numeros[i] != numeros[i - 1])) {
				System.out.println(numeros[i]);
			}
		}

		// Mostrar números únicos
		System.out.println("Números únicos:");
		for (int i = 0; i < 20; i++) {
			if (!repetidos[i]) {
				System.out.println(numeros[i]);
			}
		}

		scanner.close();
	}
}
