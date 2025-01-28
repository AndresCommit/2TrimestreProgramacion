package ejemplos;

public class Alumno {
	public static void main(String[] args) {
		AuxAlumno Alumno1 = new AuxAlumno();
		AuxAlumno Alumno2 = new AuxAlumno();
		AuxAlumno Alumno3 = new AuxAlumno();

		System.out.println("Introducimos los datos de los alumnos: ");
		
		System.out.println("Alumno 1:");
		Alumno1.guardarDatos(); 
		Alumno1.mostrarDatos();
		System.out.println("Alumno 2:");
		Alumno2.guardarDatos();
		Alumno2.mostrarDatos();
		System.out.println("Alumno 3:");
		Alumno3.guardarDatos();
		Alumno3.mostrarDatos();
		System.out.println("La media de edad es: "
		                    + (Alumno1.getEdad() + Alumno2.getEdad() + Alumno3.getEdad() / 3));
	}
}
