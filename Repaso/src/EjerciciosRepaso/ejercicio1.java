package EjerciciosRepaso;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        char seguir = 'S';

        while (seguir == 's' || seguir == 'S') {
            System.out.println("Introduce un número entero positivo:");
            int n = entrada.nextInt();

            // Verificar si el número es positivo
            if (n <= 0) {
                System.out.println("Introduce un número positivo");
            }

            // Verificar si el número es primo
            boolean esPrimo = true;
            if (n < 2) {
                esPrimo = false; // 0 y 1 no son primos
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        esPrimo = false;
                    }
                }
            }

            // Sumar si es primo
            if (esPrimo) {
                suma += n;
            }

            // Preguntar si desea seguir
            System.out.println("Desea seguir? [ S=Sí | N=No ]");
            seguir = entrada.next().charAt(0);
        }

        System.out.println("La suma de números primos es: " + suma);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
