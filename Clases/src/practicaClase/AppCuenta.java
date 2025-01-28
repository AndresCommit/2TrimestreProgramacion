package practicaClase;

import java.util.Scanner;

public class AppCuenta {

	public static void main(String[] args) {
		CuentaCorriente cuenta1;
		Gestor gestor1;
		gestor1 = new Gestor("Alvaruky", 695201434);
		cuenta1 = new CuentaCorriente("71972364M", "Andrés", 0.0, 3.5);
		cuenta1.ingresarDinero();
		cuenta1.sacarDinero();
		cuenta1.mostrarDatos();
		cuenta1.modificarInteres();
	}
}