package practicaClase;

import java.util.Scanner;

public class CuentaCorriente {
	Scanner entrada = new Scanner(System.in);
	private String dni;
	private String titular;
	private double saldo;
	private static double tipoInteres = 3.5;

	public CuentaCorriente(String d, String n, double s, double ti) {
		this.dni = d;
		this.titular = n;
		this.saldo = s;
		this.tipoInteres = ti;
	}

	public CuentaCorriente(String d, double s) {
		this.dni = d;
		this.saldo = s;

	}

	public CuentaCorriente(String d, String n, double s) {
		this.dni = d;
		this.titular = n;
		this.saldo = s;

	}

	public void mostrarDatos() {
		System.out.println("\nLos datos de la cuenta son: ");
		System.out.println("\nTitular de la cuenta:  " + getTitular());
		System.out.println("\nDNI:  " + getDni());
		System.out.println("\nSaldo:  " + getSaldo()+"€");

	}

	public void ingresarDinero() {
		saldo = getSaldo();
		System.out.println("Introduce la cantidad que quieres ingresar: ");
		double dinero = entrada.nextDouble();
		if (dinero > 0) {
			saldo = saldo + dinero;
			System.out.println("Has ingresado con éxito, ahora tienes: " + saldo+"€");
		} else {
			System.out.println("No puedes ingresar una cantidad inferior a 0€");
		}

	}

	public double modificarInteres() {
		System.out.println("Introduce el nuevo tipo de interés: ");
		tipoInteres = entrada.nextDouble();
		return tipoInteres;

	}

	public boolean sacarDinero() {
		saldo = getSaldo();
		System.out.println("Introduce la cantidad que quieres retirar: ");
		double dinero = entrada.nextDouble();

		if (dinero < saldo) {
			System.out.println("Has sacado: " + dinero + "€, te quedan: " + (saldo - dinero)+"€");
			saldo = saldo - dinero;
			return true;
		} else {
			System.out.println("No tienes suficiente saldo");
			System.out.println("Saldo: " + saldo);
		}
		return false;
	}

	private void setSaldo(double s) {
		this.saldo = s;
	}

	private String getDni() {
		return dni;
	}

	private void setDni(String d) {
		this.dni = d;
	}

	private String getTitular() {
		return titular;
	}

	private void setTitular(String n) {
		this.titular = n;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(float s) {
		this.saldo = s;
	}

}
