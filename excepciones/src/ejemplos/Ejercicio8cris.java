package ejemplos;

public class Ejercicio8cris {
	public static void main(String[] args) {
		int vector[]=new int[10];
		int i=0;
		try {
			for(i=0;i<vector.length;i++) {
				vector[i]=i;
				System.out.println(vector[i]);
			}
			System.out.println("Ultimo número: "+vector[vector.length]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error: índice fuera de rango");
		}		
	}
}
