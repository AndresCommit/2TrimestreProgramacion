package métodos;

public class Actividad1Metodos {
	// sumar dos números
	public static int sumar(int num1, int num2) {
		System.out.println();
		return num1 + num2;
	}

	// restar dos números
	public static int restar(int num1, int num2) {
		return num1 - num2;
	}

	// multiplicar dos números
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	// dividir dos números
	public static double dividir(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("No se puede dividir por cero.");
		}
		return num1 / num2;
	}
}
