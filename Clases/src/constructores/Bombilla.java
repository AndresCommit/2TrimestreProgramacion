package constructores;

public class Bombilla {
	private int potencia;
	private boolean encendida;

	public Bombilla() {

	}

	public Bombilla(int p) {
		this.potencia = p;
	}

	public Bombilla(boolean e) {
		this.encendida = e;
	}

	public Bombilla(int p, boolean e) {
		this.potencia = p;
		this.encendida = e;
	}
}
