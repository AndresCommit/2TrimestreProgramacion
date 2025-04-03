package ArrayList;
import java.util.*;

public class EjemploAlumno {
	public static void main (String[]args) {
		ArrayList <Alumno> alumnos = new ArrayList<Alumno>();
		char seguir='S';
		Scanner teclado = new Scanner (System.in);
		int i = 0;
		
		while(seguir=='s' || seguir=='S') {
			alumnos.add(i,pedirDatos());
			i++;
			System.out.println("¿Deseas seguir? (S=Sí/N=No");
			seguir=teclado.next().charAt(0);
		}
		
		for(Alumno indice: alumnos)
			System.out.println(indice.toString());
		
		//Lista de alumnos ordenada
		Collections.sort(alumnos);
		for (Alumno indice: alumnos) 
			System.out.println(indice.toString());
	
		//Ordenamos por nombre
		AluComparable c2= new AluComparable();
		Collections.sort(alumnos,c2);
		
		System.out.println("Lista de alumnos Ordenada por Nombre: ");
		for (Alumno indice: alumnos)
			System.out.println(indice.toString());
	}
	
	public static Alumno pedirDatos() {
		Alumno al=new Alumno();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre alumno: ");
		al.setNombre(teclado.nextLine());
		System.out.println("Edad alumno: ");
		al.setEdad(teclado.nextInt());
		return al;
	}
	
	public static boolean borrarAlumno (int edad) {
		boolean borrado = true;
		for (int i = 0; i < edad; i++) {
			
		}
		return false;
	}
}

