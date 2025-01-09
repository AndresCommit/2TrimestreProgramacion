package métodos;

import java.util.Scanner;

public class EjemploPizarraMetodos {

	public static void main(String[] args) {
		int x = 5;
		int v[] = new int[6];
		met1(x);
		met2(x);
	}

	public static void met1(int a) {
		a = a * 2;
		System.out.println(a);
	}

	public static void met2(int a) {
		a = a * 2;
		System.out.println(a);
	}

	public static void leeVector(int array[]) {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce número entero: ");
			array[i]=entrada.nextInt();
		}
	}
	public static int maxVector (int array []) {
		int i = 0;
		int maximo=array[0];
		for (int j = 0; j < array.length; j++) {
			if(array[i]>maximo)
				maximo=array[i];
		}
		return maximo;
	}
}
