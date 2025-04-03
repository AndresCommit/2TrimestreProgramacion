package ArrayList;

public class Alumno implements Comparable {
	private String nombre;
	private int edad;
	
	public Alumno() {
		this.nombre="";
	}	
	
	public Alumno(String nombre) {		
		this.nombre = nombre;
	}

	public Alumno(String nombre, int edad) {		
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre = n;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int e) {
		this.edad = e;
	}
	public int compareTo(Object o) {
		int resul=0;
	Alumno al=(Alumno)o;
		return (this.edad-al.getEdad());
		
	}
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}		
	
}
