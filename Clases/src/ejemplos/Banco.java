package ejemplos;

public class Banco {
	private String Nombre;

	private float Saldo;
	private float Beneficio;

	public Banco(String nom, float sal) {
		this.Nombre = nom;
		this.Saldo = sal;
	}
	private String getNombre() {
		return Nombre;
	}

	private void setNombre(String nombre) {
		Nombre = nombre;
	}

	private float getSaldo() {
		return Saldo;
	}

	private void setSaldo(float saldo) {
		Saldo = saldo;
	}

	private float getBeneficio() {
		return Beneficio;
	}

	private void setBeneficio(float beneficio) {
		Beneficio = beneficio;
	}
}