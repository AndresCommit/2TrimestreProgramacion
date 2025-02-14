package practicaHerencia;

import java.util.Scanner;

public class Instrumento {

	protected String[] melodia;
	protected int cantidadNotas;
	private static final String[] NOTAS_VALIDAS = { "DO", "RE", "MI", "FA", "SOL", "LA", "SI" };

	// Constructor Instrumento

	public Instrumento() {
		this.melodia = new String[50];
		this.cantidadNotas = 0;
	}

	// Método para validar las notas

	protected boolean notaValida(String nota) {
		for (int i = 0; i < NOTAS_VALIDAS.length; i++) {
			if (NOTAS_VALIDAS[i].equals(nota)) {
				return true;
			}
		}
		return false;
	}

	// Método para introducir las notas de la melodía

	protected boolean introMelodia(String[] nuevaMelodia) {
		for (int i = 0; i < nuevaMelodia.length; i++) {
			if (!notaValida(nuevaMelodia[i])) {
				System.out.println("La nota que has introducido no es correcta.");
				return false;
			}
		}
		// Si las notas son correctas, guardamos la melodía
		cantidadNotas = nuevaMelodia.length;
		for (int i = 0; i < nuevaMelodia.length; i++) {
			melodia[i] = nuevaMelodia[i];
		}
		return true;
	}

	// Método para Mostrar las notas de la Melodía

	public void interpretar() {
		for (int i = 0; i < cantidadNotas; i++) {
			System.out.println(melodia[i] + "");
		}
		System.out.println("");
	}

	// Mostrar la cantidad de notas de una melodía
	public int duracion() {
		return cantidadNotas;
	}

	// Método para contar notas
	public int contarNota(String nota) {
		int contador = 0;
		for (int i = 0; i < cantidadNotas; i++) {
			if (melodia[i].equals(nota)) {
				contador++;
			}
		}
		return contador;
	}
}
