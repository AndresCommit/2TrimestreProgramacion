package Ejercicios;

public class Empleado implements Comparable{
	protected String nombre;
	private float sueldo;
	
	
	public Empleado() {
		
	}
	public Empleado(String nombre, float sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected float getSueldo() {
		return sueldo;
	}
	protected void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public String toString() {
		return "Empleado [ Nombre=" + nombre + ", Sueldo=" + sueldo + " ]";
	}	
	
	public int compareTo(Object o) {
		int resul=0;
	Empleado empleado=(Empleado)o;
		return (int) (this.sueldo-empleado.getSueldo());
		
	}
}
