package herencia;

public class Persona {
	public int edad;
	public String nombre;
	public String apellidos;
	public String dir;

	public Persona() {

	}

	public Persona(String nombre, String apellidos, int edad, String dir) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dir = dir;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}
}
