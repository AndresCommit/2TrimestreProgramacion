package excepciones;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número para el dividendo");
		int dividendo = entrada.nextInt();
		System.out.println("Introduce un número para que sea el divisor");
		int divisor = entrada.nextInt();
		int resultado = dividendo / divisor;
		System.out.println("El resultado es: " + resultado);

		try {
			int dividendo1 = entrada.nextInt();
			/* instrucciones que se ejecutan salvo que haya un error */
		} catch (Exception Alvaruky) {
			
			/* instrucciones que se ejecutan si hay un error */
		}
	}
}
