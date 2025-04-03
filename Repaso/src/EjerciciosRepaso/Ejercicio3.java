package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el número de Jugadores [ 2-6 ]:");
		int jugadores=entrada.nextInt();
	
		for (int i = 0; i < jugadores; i++) {
			if (jugadores>=2 && jugadores<=6)  {
				for (int j = 0; j < 10 ; j++) {
					int num=(int) ((Math.random()*10)+1);
					System.out.print(num +" ");
				}
			} else {

				
				
			}
		}
		
	}
}
