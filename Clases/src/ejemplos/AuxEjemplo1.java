package ejemplos;

public class AuxEjemplo1 {
	void metodoSaludo1() {
		System.out.println("Este es el método de ruky");
		separador();
		metodoSaludo2();
		// this.metodoSaludo2();
	}

	void metodoSaludo2() {
		System.out.println("Este es el método de ruky-tuky");
		separador();
	}

	void separador() {
		System.out.println("*----------------------------------------*");
	}

	void metodoConParametros() {
		int num1 = 4;
		int num2 = 6;
		int suma = num1 + num2;
		separador();
		System.out.println("La suma es: " + suma);
		separador();
	}
}
