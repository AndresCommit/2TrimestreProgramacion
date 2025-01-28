package ejemplos;

import java.util.Scanner;

public class Ejemplo6Banco {

	public static void main(String[] args) {
		Cliente clien1,clien2;
		clien1=new Cliente("María");
		clien2=new Cliente("Luis");
		Cliente.setBeneficio(42f);
		clien1.ingresar(100);
		System.out.println(clien1.toString());

	}

}
