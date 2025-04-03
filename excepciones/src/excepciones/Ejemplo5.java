package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int dividendo=0,divisor=0,resul=0;
		
		int intentos=0;
		boolean terminar=false;
		while(terminar==false) {
			System.out.println("Intentos: "+intentos);
			try {
				System.out.println("Dividendo: ");
				dividendo=teclado.nextInt();
				System.out.println("Divisor: ");
				divisor=teclado.nextInt();
				resul=dividendo/divisor;
				System.out.println("Resultado: "+resul);
				terminar=true;				
			}		
			catch(ArithmeticException ex) {
				System.out.println("Error: el divisor no puede ser cero");
				System.out.println(ex.getMessage());
				terminar=true;
			}
			catch (InputMismatchException ex){
				teclado.next();
				System.out.println("Error: tipo de dato no válido");
				intentos++;				
				if (intentos>=3) {
					terminar=true;
					System.out.println("Cerramos el programa. Demasiadas entradas erróneas");
				}
			}
			catch(Exception ex) {
				System.out.println("Error de sistema");
				System.out.println(ex.getMessage());
			}			
		}
			
	}

}
