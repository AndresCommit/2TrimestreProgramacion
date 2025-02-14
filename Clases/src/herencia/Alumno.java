package herencia;

public class Alumno extends Persona {
	private String curso;
	private int notas[] = new int[7];

	public Alumno() {
		super();
	}

	public Alumno(String curso, int[] notas) {
		super();
		this.curso=curso;
		this.notas=notas;
	}
	public String toString() {
		String cadena;
		
		return cadena;
		
	}
	public Alumno(String nombre, String apellidos, int edad, String curso, int[] notas, String dir) {
		super(nombre, apellidos, edad,dir);
		this.curso = curso;
		this.notas = notas;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
}
