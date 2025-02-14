package herencia;

public class AuxLongitud {
	public class Main {
		public static void main(String[] args) {
			Linea linea = new Linea(5.0);
			System.out.println("Longitud de la línea: " + linea.getLongitud());

			Rectangulo rectangulo = new Rectangulo(4.0, 3.0);
			System.out.println("Área del rectángulo: " + rectangulo.getArea());

			Caja caja = new Caja(2.0, 3.0, 4.0);
			System.out.println("Volumen de la caja: " + caja.getVolumen());
		}
	}
}
