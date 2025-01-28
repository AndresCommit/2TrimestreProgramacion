package ejemplos;

import java.util.Scanner;

public class Profesor {
	private String nombre;
	private String especialidad;

	public Profesor(String nombre, String especialidad) {
		this.nombre = "";
		this.especialidad = "";
	}

	public Profesor(String nombre) {

	}

	private String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getEspecialidad() {
		return this.especialidad;
	}

	private void mostrarDatos() {
		getNombre();
		getEspecialidad();
	}

	private void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	private void inicializarDatos(String n, String e) {
		this.nombre = n;
		this.especialidad = e;
	}

	private void modificarDatos() {
		System.out.println(" >Los datos del usuario son:");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Especialidad: " + this.especialidad);
	}
}
