package ejemplos;

import java.util.Scanner;

public class Figura {

	// atributos
	private float lado1, lado2, lado3;
	private float area, perimetro, baseT, alturaT;

	// métodos

	void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte la longitud del lado 1");
		lado1 = teclado.nextFloat();
		System.out.println("Inserte la longitud del lado 2");
		lado2 = teclado.nextFloat();
	}
	void pedirDatosTriangulo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte la base del triángulo");
		baseT = teclado.nextFloat();
		System.out.println("Inserte la altura del triángulo");
		alturaT = teclado.nextFloat();
	}

	void calcularArea() {
		float area = lado1 * lado2;
		System.out.println("El área de la figura es: " + area + " centímetros");
	}

	public float calcularAreaTriangulo() {
		float areaTri = baseT * alturaT / 2;
		System.out.println("El área del triángulo es: " + areaTri + " centímetros");
		return(areaTri);
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public float getBaseT() {
		return baseT;
	}

	public void setBaseT(float baseT) {
		this.baseT = baseT;
	}

	public float getAlturaT() {
		return alturaT;
	}

	public void setAlturaT(float alturaT) {
		this.alturaT = alturaT;
	}

	void calcularPerimetro() {
		float perimetro = lado1 + lado1 + lado2 + lado2;

	}
	void calcularPerimetroTriangulo() {
		float perimetro = baseT + alturaT+alturaT;

	}

	void elegirOperacion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pulsa 1 para calcular el área y 2 para calcular el perímetro de la figura");
		int elegir = teclado.nextInt();
		if (elegir == 1) {
			calcularArea();
		}
		if (elegir == 2) {
			calcularPerimetro();
		}
	}
	void elegirOperacionTriangulo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pulsa 1 para calcular el área y 2 para calcular el perímetro de la figura");
		int elegir = teclado.nextInt();
		if (elegir == 1) {
			calcularAreaTriangulo();
		}
		if (elegir == 2) {
			calcularPerimetroTriangulo();
		}
	}
	void elegirFigura() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pulsa 1 para elegir el triángulo y 2 para elegir el cuadrado");
		int elegir = teclado.nextInt();
		if (elegir == 1) {
			pedirDatosTriangulo();
			elegirOperacionTriangulo();
		}
		if (elegir == 2) {
			pedirDatos();
			elegirOperacion();
		}
	}
}
