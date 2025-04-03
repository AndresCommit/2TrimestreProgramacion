package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {		
		int i=0;
		int num, suma=0;
		Scanner teclado=new Scanner(System.in);
		boolean fin=false;
		while(fin==false && i<5) {
			try {
				System.out.println("Inserte entero: ");
				num=teclado.nextInt();
				suma=suma+num;	
				i++;
			}catch(InputMismatchException ex) {
				System.out.println("Fin");
				fin=true;
			}			
		}
		System.out.println("La suma es: "+suma);
	}
}
