package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double dividendo=0,divisor=0,resul=0;
		
		try {
			System.out.println("Dividendo: ");
			dividendo=teclado.nextDouble();
		}
		catch (InputMismatchException ex){
			System.out.println("Error: tipo de dato no válido");
			//System.out.println("Mensaje de la excepción: "+ex.getMessage());
		}
		teclado.next();
		try {
			System.out.println("Divisor: ");
			divisor=teclado.nextDouble();
			resul=dividendo/divisor;
			System.out.println("Resultado: "+resul);
		}
		catch (InputMismatchException ex){
			System.out.println("Error: tipo de dato no válido");
			//System.out.println("Mensaje de la excepción: "+ex.getMessage());
		}
		
			
	}

}
