package ejemplos;

public class Libro {
	private String titulo;
	private String autor;
	static String editorial;

	public Libro() {

	}

	public Libro(String tit, String aut) {
		this.titulo = tit;
		this.autor = aut;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public static String getEditorial() {
		return editorial;
	}

	public static void setEditorial(String editorial) {
		Libro.editorial = editorial;
	}

	public String toString() {
		String datosLib = "Libro [titulo= " + titulo + ", autor= " + autor;
		datosLib = datosLib + ", editorial " + Libro.editorial + " ]";
		return datosLib;
	}
}
