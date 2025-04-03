package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo6 {
	public static void main(String[] args) {
		System.out.println("Inserte entero: ");
		int numero=0;
		try {
			numero=pedirEntero();
			System.out.println("Valor leído: "+numero);
		}
		catch(InputMismatchException ex) {
			System.out.println("No se ha insertado un número");
		}
	}
	
	static int pedirEntero() {
		int num;
		Scanner teclado=new Scanner(System.in);
		num=teclado.nextInt();
		return(num);
	}
}


