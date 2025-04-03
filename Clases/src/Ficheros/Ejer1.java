package Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(nombreArchivo, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            System.out.println("Introduce líneas de texto (escribe 'salir' para terminar):");

            while (true) {
                String linea = scanner.nextLine();
                if (linea.equalsIgnoreCase("salir")) {
                    break;
                }
                printWriter.println(linea);
            }

            System.out.println("Texto guardado en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


