package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjercicioDataInputS {

	public static void main(String[] args) {
		double[] precios = { 200, 230, 450, 6300, 789 };
		int[] unidades = { 30, 7, 90, 45, 32 };
		String[] descrip = { "cajas grapas", "cajas lápices", "cajas bolis", "carteras", "estilográficas" };
		int i;
		int unidad;
		double precio, total = 0.0;
		String descripcion;
		// abrimos para escritura
		try {
			FileOutputStream fichero = new FileOutputStream("inventario.dat");
			DataOutputStream salida = new DataOutputStream(fichero);
			for (i = 0; i < precios.length; i++) {
				salida.writeUTF(descrip[i]);
				salida.writeInt(unidades[i]);
				salida.writeDouble(precios[i]);
			}
			salida.close();
		} catch (IOException e) {
			System.out.println("Error E/S");
		}
		try {
			FileInputStream fichero = new FileInputStream("inventario.dat");
			DataInputStream entrada = new DataInputStream(fichero);
			descripcion = entrada.readUTF();
			while (descripcion != null) {
				unidad = entrada.readInt();
				precio = entrada.readDouble();
				System.out.println("Has pedida " + unidad + " " + descripcion + " a " + precio
				                    + " euros");
				total = total + unidad * precio;
				descripcion = entrada.readUTF();
			}
			entrada.close();
		} catch (EOFException e) {
			System.out.println(" ");
		} catch (IOException e) {
			System.out.println("Error E/S");
		} finally {
			System.out.println("Por un total de: " + total + " euros.");
		}

	}

}
