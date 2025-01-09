package practicasT4;
import java.util.Scanner;

public class lamarranada {
	private static char[] vector = new char[100]; // Vector para almacenar caracteres
	    private static int contador = 0; // Contador para el número de caracteres en el vector

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcion = 0;

	        while (opcion != 6) {
	            mostrarMenu();
	            opcion = scanner.nextInt();
	            scanner.nextLine(); // Limpiar el buffer

	            if (opcion == 1) {
	                insertarValores(scanner);
	            } else if (opcion == 2) {
	                imprimirVector();
	            } else if (opcion == 3) {
	                imprimirCopiaInversa();
	            } else if (opcion == 4) {
	                mostrarCaracterMayor();
	            } else if (opcion == 5) {
	                contarCaracter(scanner);
	            } else if (opcion == 6) {
	                System.out.println("Saliendo del programa...");
	            } else {
	                System.out.println("Opción no válida. Intente de nuevo.");
	            }
	        }

	        scanner.close();
	    }

	    private static void mostrarMenu() {
	        System.out.println("Seleccione una opción:");
	        System.out.println("1 - Insertar valores en el vector");
	        System.out.println("2 - Imprimir el vector");
	        System.out.println("3 - Crear una copia del vector en orden inverso e imprimirla");
	        System.out.println("4 - Mostrar el carácter mayor en el vector");
	        System.out.println("5 - Contar cuántas veces aparece un carácter");
	        System.out.println("6 - Salir");
	    }

	    private static void insertarValores(Scanner scanner) {
	        System.out.println("Ingrese una cadena de caracteres:");
	        String entrada = scanner.nextLine();
	        for (char c : entrada.toCharArray()) {
	            if (contador < vector.length) {
	                vector[contador++] = c;
	            } else {
	                System.out.println("El vector está lleno.");
	                break;
	            }
	        }
	    }

	    private static void imprimirVector() {
	        System.out.print("Contenido del vector: ");
	        for (int i = 0; i < contador; i++) {
	            System.out.print(vector[i] + " ");
	        }
	        System.out.println();
	    }

	    private static void imprimirCopiaInversa() {
	        System.out.print("Copia inversa del vector: ");
	        for (int i = contador - 1; i >= 0; i--) {
	            System.out.print(vector[i] + " ");
	        }
	        System.out.println();
	        imprimirVector(); // Imprimir el original
	    }

	    private static void mostrarCaracterMayor() {
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
	        System.out.println("El carácter mayor es: " + mayor);
	    }

	    private static void contarCaracter(Scanner scanner) {
	        System.out.println("Ingrese un carácter a buscar:");
	        char buscar = scanner.nextLine().charAt(0);
	        int contadorCaracter = 0;

	        for (int i = 0; i < contador; i++) {
	            if (vector[i] == buscar) {
	                contadorCaracter++;
	            }
	        }
	        System.out.println("El carácter '" + buscar + "' aparece " + contadorCaracter + " veces.");
	    }
	}