package ejemplos;

import java.util.Scanner;

public class Actividad1Constructor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Qué carácter quieres elegir para imprimir?");
        char caracter = entrada.next().charAt(0); // Leer el carácter
        
        System.out.println("Introduce un número para imprimirlo tantas veces como quieras:");
        int numeroAsteriscos = entrada.nextInt();
        
        // Crear el objeto con el número de asteriscos y el carácter
        AuxAct1Objetos asterisco = new AuxAct1Objetos(numeroAsteriscos, caracter);
        asterisco.imprimirCaracteres();

        entrada.close(); // Cerrar el Scanner
    }
}