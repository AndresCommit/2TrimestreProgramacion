package practicaHerencia;

public class Piano extends Instrumento {
	private String[] melodia2;
	private int cantidadNotasPiano;

	// Constructor Piano
	public Piano() {
		super();
		this.melodia2 = new String[150];
		this.cantidadNotasPiano = 0;
	}

	public boolean introMelodia(String[] melodiaDer, String[] melodiaIzq) {
		if (!super.introMelodia(melodiaDer)) {
			return false;
		}
		for (int i = 0; i < melodiaIzq.length; i++) {
			if (!notaValida(melodiaIzq[i])) {
				return false;
			}
		}
		cantidadNotasPiano = melodiaIzq.length;
		for (int i = 0; i < cantidadNotasPiano; i++) {
			melodia2[i] = melodiaIzq[i];
		}
		return true;
	}

	public void Interpretar() {
		System.out.println("Melodía de la Mano Derecha: ");
		super.interpretar();
		System.out.println("Melodía de la Mano Izquierda: ");
		for (int i = 0; i < cantidadNotasPiano; i++) {
			System.out.println(melodia2[i] + "");
		}
		System.out.println("");
	}
	
	public int duracion() {
		return super.duracion()+cantidadNotasPiano;
		
	}
	public int contarNota(String nota) {
		int contador=0;
		super.contarNota(nota);
		for (int i = 0; i <cantidadNotasPiano; i++) {
			if (melodia2[i].equals(nota)) {
				contador++;
			}
		}
		return contador;
	}
}
