package ejemplos;

public class Cliente {
	private String titular;
	private float saldo;
	private static float beneficio;

	public Cliente() {
	}

	public Cliente(String t) {
		this.titular = t;
		this.saldo = 0f;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return (this.saldo);
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public static float getBeneficio() {
		return (Cliente.beneficio);
	}

	public static void setBeneficio(float beneficio) {
		Cliente.beneficio = beneficio;
	}

	public void ingresar(float cantidad) {
		if (cantidad >= 0)
			this.saldo = this.saldo + cantidad;
	}

	public void extraer(float cantidad) {
		if (cantidad < this.saldo)
			this.saldo = this.saldo - cantidad;
	}

	public String toString() {
		return "Cliente [titular=" + titular + ", saldo=" + saldo + ", beneficio=" + Cliente.beneficio
		                    + "]";
	}

}
