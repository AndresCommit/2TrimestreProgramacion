package ejemplos;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int dividendo=0,divisor=0,resul=0;
		System.out.println("Dividendo: ");
		dividendo=teclado.nextInt();
		
		try {
			System.out.println("Divisor: ");
			divisor=teclado.nextInt();
			resul=dividendo/divisor;
			System.out.println("Resultado: "+resul);
		}		
		catch(ArithmeticException ex) {
			System.out.println("Error: el divisor no puede ser cero");
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Error de sistema");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("FIN");
		}	
			
	}

}
