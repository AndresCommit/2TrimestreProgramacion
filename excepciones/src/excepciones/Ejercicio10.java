package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {

    public static void main(String[] args){
        int num1;
        boolean fin=false;		
        int suma=0;
        System.out.print("Inserta un número: ");        
		while(fin==false)
	        try {
	            num1 = pedirEntero();
	            System.out.println("El número insertado"
	                    + " es " + num1);
	            suma=suma+num1;
	        }catch (IOException e) {
	        	System.out.println("Nos vamos del programa porque"
	                    + "ha ocurrido un error grave");
	        	System.exit(0);
	        }
	        catch (NumberFormatException e) {
	            System.out.println("Se han insertado letras "
	                    + "en vez de números. MENSAJE QUE "
	                    + "VISUALIZA EL MAIN");
	            fin=true;
	        } catch (Exception e) {	
	        	System.out.println("ERROR GRAVE");
	        	fin=true;				
			}   
		System.out.println("La suma es: "+suma);

    }//Fin main

    static String pedirCadena() throws IOException{
        String cadena="";
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
        try {
	        cadena = teclado.readLine();	        
        }catch (NumberFormatException e) {
        	throw new NumberFormatException();        	
        }catch (IOException e) {
        	throw new IOException();        	
        }        
        return cadena;
    }

    static int pedirEntero() throws IOException {
        String cadena;
        int num;
        try {
        	cadena = pedirCadena();
        }catch (NumberFormatException e) {
        	throw new NumberFormatException();
        }
        num = Integer.parseInt(cadena);
        return num;
    }
}

