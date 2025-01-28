package ejemplos;

public class auxEjemplo {
	private String nombre;
	private int edad;

	// Constructor con parametros
	public auxEjemplo(String name, int age) {
	nombre = name;
	edad = age;
	}

	public void visualizarDatos() {
	System.out.println("Nombre: " + nombre);
	System.out.println("Edad: " + edad);
	}

}
