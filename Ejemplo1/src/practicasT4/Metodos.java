package practicasT4;

import java.util.Scanner;

public class Metodos {
	final static int TAM = 50;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		while (opcion != 6) {
			mostrarMenu();
			opcion = entrada.nextInt();
			entrada.nextLine();
		}
		// bucle if else para seleccionar las opciones que nos lleven a los métodos
		// que son las opciones del menú

		if (opcion == 1) {
			insertarValores(entrada);
		} else if (opcion == 2) {
			imprimirVector();
		} else if (opcion == 3) {
			imprimirCopiaInversa();
		} else if (opcion == 4) {
			mostrarCaracterMayor();
		} else if (opcion == 5) {
			contarCaracter(entrada);
		} else if (opcion == 6) {
			System.out.println("Saliendo del programa :) ");
		} else {
			System.out.println("Opción no válida. Inténtalo de nuevo.");
		}
		entrada.close();
	}

	public static char vector[] = new char[TAM];
	public static int contador = 0;

	public static void mostrarMenu() {
		System.out.println("Selecciona una de las siguientes opciones:");
		System.out.println("1 - Insertar valores en el vector");
		System.out.println("2 - Imprimir el vector");
		System.out.println("3 - Crear una copia del vector en orden inverso e imprimirla");
		System.out.println("4 - Mostrar el carácter mayor en el vector");
		System.out.println("5 - Contar cuántas veces aparece un carácter");
		System.out.println("6 - Salir");

	}
	/*Esto es un comentario */
	/**
	 * Esto es documentación
	 * @param scanner
	 */
	public static void insertarValores(Scanner scanner) {
		System.out.println("Introduce una cadena de caracteres:");
		String entrada = scanner.nextLine();
		char[] vector = new char[TAM];
		for (char c : entrada.toCharArray()) {
			if (contador < vector.length) {
				vector[contador++] = c;
			} else {
				System.out.println("El vector está lleno.");
			}
		}
	}

	public static void imprimirVector() {
		System.out.print("Tenemos guardado: ");
		for (int i = 0; i < contador; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}

	public static void imprimirCopiaInversa() {
		System.out.print("Vector al revés: ");
		for (int i = contador - 1; i >= 0; i--) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		imprimirVector();
	}

	public static void mostrarCaracterMayor() {
		if (contador == 0) {
			System.out.println("El vector está vacío.");
			return;
		}
		char mayor = vector[0];
		for (int i = 1; i < contador; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}
	}

	public static void contarCaracter(Scanner scanner) {
		System.out.println("Ingresa un carácter a buscar:");
		char buscar = scanner.nextLine().charAt(0);
		int contadorCaracter = 0;
		// bucle for para contar carácteres
		for (int i = 0; i < contador; i++) {
			if (vector[i] == buscar) {
				contadorCaracter++;
			}
		}
		System.out.println("El carácter '" + buscar + "' sale " + contadorCaracter + " veces.");
	}
}
