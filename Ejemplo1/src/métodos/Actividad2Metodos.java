package métodos;

import java.util.Scanner;

public class Actividad2Metodos {
	public static void main(String[] args) {
		double num;
		num=LeerNum();
		System.out.println("El número leído es; " + num);

}

	public static double LeerNum() {
		Scanner entrada = new Scanner(System.in);
		double num;
		System.out.println("Introduzca un número");
		num=entrada.nextDouble();
		return (num);

	}
}
