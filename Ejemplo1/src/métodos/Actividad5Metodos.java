package métodos;

import java.util.Scanner;

public class Actividad5Metodos {
	public static void main(String[] args) {
		numDivisor();
	}

	// reciba 2 números enteros y calcula si es divisible

	public static void numDivisor() {
		Scanner entrada = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		int mayor = 0;
		int menor = 0;
		System.out.println("Escribe un número entero: ");
		int num = entrada.nextInt();
		System.out.println("Escribe otro número entero para saber si es divisible: ");

		int num2 = teclado.nextInt();
		if (num > num2) {
			mayor = num;
			menor = num2;
		} else {
			mayor = num2;
			menor = num;
		}
		int divisible = mayor % menor;
		if (divisible == 0) {
			System.out.println("El número es divisible: " + mayor + " / " + menor + " = "
			                    + mayor / menor);
		} else {
			System.out.println("El número no es divisible");

		}
	}
}
