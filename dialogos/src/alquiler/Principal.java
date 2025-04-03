package alquiler;
import java.time.LocalDate;
import java.time.format.*;

public class Principal {

	public static void main(String[] args) {		
		String [] opciones = {"Barco", "Velero", "Deportivo", "Yate", "Salir"};
		
		Alquiler alquileres[]=new Alquiler[3];
		int opcion=0,i;				
		
		//creamos 3 alquileres
		//inicializamos
		for (i=0;i<3;i++) {
			alquileres[i]=new Alquiler();
		}
		for (i=0;i<3;i++) {
			opcion=dialogos.Dialogos_Cris.pedirOpcion("Elige el tipo de barco", "AppAlquiler", opciones);
			switch (opcion) {
				case 0:
					datosBarco(alquileres[i]); break;
				case 1:
					datosVelero(alquileres[i]); break;
				case 2:
					datosDeportivo(alquileres[i]); break;
				case 3:
					datosYate(alquileres[i]); break;
				case 4:
					dialogos.Dialogos_Cris.mensajeInfo("FIN DATOS BARCO", "AppAlquiler"); break;
				default:
					opcion = 4; break;
			}
		}		
	}
	private static void datosBarco(Alquiler alquiler) {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		String matricula;
		dialogos.Dialogos_Cris.mensajeInfo("Información del barco", "AppAlquiler");
		matricula=dialogos.Dialogos_Cris.pedirCadena("Introduce la matrícula");		
		int eslora = dialogos.Dialogos_Cris.pedirEntero("Eslora");
		int anno = dialogos.Dialogos_Cris.pedirEntero("Año Fabricacion");
		Barco barco = new Barco(matricula, eslora, anno);		
		int j=0;		
		String nombre,dni,fechIni;
		int pos[]=new int[2];
		nombre=dialogos.Dialogos_Cris.pedirCadena("Nombre cliente");
		alquiler.setNombre(nombre);
		dni=dialogos.Dialogos_Cris.pedirCadena("DNI");
		alquiler.setDNI(dni);
		fechIni=dialogos.Dialogos_Cris.pedirCadena("Fecha de inicio (dd-mm-aaaa)");	
				
		try {
			alquiler.setFechIni(LocalDate.parse(fechIni,formato1));
		}
		catch(DateTimeParseException e) {
			dialogos.Dialogos_Cris.mensajeError("Error en la fecha. Formato dd-mm-aaaa","Apli de alquiler");
		}		
		catch (Exception e) {			
			dialogos.Dialogos_Cris.mensajeError("ERROR","Apli de alquiler");
		}
		
		for (j=0;j<2;j++)
			pos[j]=dialogos.Dialogos_Cris.pedirEntero("Posición "+(j+1));
		alquiler.setPos(pos);
		alquiler.setBarco(barco);		
		dialogos.Dialogos_Cris.mensajeInfo(Double.toString(alquiler.calcAlquiler())+" €","AppAlquileres");		
	}
	
	private static void datosVelero(Alquiler alquiler) {		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		String matricula;
		dialogos.Dialogos_Cris.mensajeInfo("Información del barco", "AppAlquiler");
		matricula=dialogos.Dialogos_Cris.pedirCadena("Introduce la matrícula");		
		int eslora = dialogos.Dialogos_Cris.pedirEntero("Eslora");
		int anno =dialogos.Dialogos_Cris.pedirEntero("Año Fabricacion");
		int nmas=dialogos.Dialogos_Cris.pedirEntero("Número de mástiles");
		Velero velero = new Velero(matricula, eslora, anno,nmas);		
		int j=0;		
		String nombre,dni,fechIni;
		int pos[]=new int[2];
		nombre=dialogos.Dialogos_Cris.pedirCadena("Nombre cliente");
		alquiler.setNombre(nombre);
		dni=dialogos.Dialogos_Cris.pedirCadena("DNI");
		alquiler.setDNI(dni);
		fechIni=dialogos.Dialogos_Cris.pedirCadena("Fecha de inicio (dd-mm-aaaa)");
		try {
			alquiler.setFechIni(LocalDate.parse(fechIni,formato1));
		}
		catch(DateTimeParseException e) {
			dialogos.Dialogos_Cris.mensajeError("Error en la fecha. Formato dd-mm-aaaa","Apli de alquiler");
		}		
		catch (Exception e) {			
			dialogos.Dialogos_Cris.mensajeError("ERROR","Apli de alquiler");
		}				
		for (j=0;j<2;j++)
			pos[j]=dialogos.Dialogos_Cris.pedirEntero("Posición "+(j+1));
		alquiler.setPos(pos);
		alquiler.setBarco(velero);		
		dialogos.Dialogos_Cris.mensajeInfo(Double.toString(alquiler.calcAlquiler())+" €","AppAlquileres");		
	}
	
	private static void datosDeportivo(Alquiler alquiler) {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String matricula;
		dialogos.Dialogos_Cris.mensajeInfo("Información del barco", "AppAlquiler");
		matricula=dialogos.Dialogos_Cris.pedirCadena("Introduce la matrícula");		
		int eslora =dialogos.Dialogos_Cris.pedirEntero("Eslora");
		int anno = dialogos.Dialogos_Cris.pedirEntero("Año Fabricacion");
		int potencia=dialogos.Dialogos_Cris.pedirEntero("Potencia");
		Deportiva depor = new Deportiva(matricula, eslora, anno,potencia);		
		int j=0;		
		String nombre,dni,fechIni;
		int pos[]=new int[2];
		nombre=dialogos.Dialogos_Cris.pedirCadena("Nombre cliente");
		alquiler.setNombre(nombre);
		dni=dialogos.Dialogos_Cris.pedirCadena("DNI");
		alquiler.setDNI(dni);
		fechIni=dialogos.Dialogos_Cris.pedirCadena("Fecha de inicio (dd-mm-aaaa)");		
		try {
			alquiler.setFechIni(LocalDate.parse(fechIni,formato1));
		}
		catch(DateTimeParseException e) {
			dialogos.Dialogos_Cris.mensajeError("Error en la fecha. Formato dd-mm-aaaa","Apli de alquiler");
		}		
		catch (Exception e) {			
			dialogos.Dialogos_Cris.mensajeError("ERROR","Apli de alquiler");
		}		
		for (j=0;j<2;j++)
			pos[j]=dialogos.Dialogos_Cris.pedirEntero("Posición "+(j+1));
		alquiler.setPos(pos);
		alquiler.setBarco(depor);		
		dialogos.Dialogos_Cris.mensajeInfo(Double.toString(alquiler.calcAlquiler())+" €","AppAlquileres");		
	}
	
	private static void datosYate(Alquiler alquiler) {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		String matricula;
		dialogos.Dialogos_Cris.mensajeInfo("Información del barco", "AppAlquiler");
		matricula=dialogos.Dialogos_Cris.pedirCadena("Introduce la matrícula");		
		int eslora = dialogos.Dialogos_Cris.pedirEntero("Eslora");
		int anno = dialogos.Dialogos_Cris.pedirEntero("Año Fabricacion");
		int potencia=dialogos.Dialogos_Cris.pedirEntero("Potencia");
		int camar=dialogos.Dialogos_Cris.pedirEntero("Camarotes");
		Yate yate = new Yate(matricula, eslora, anno,potencia,camar);		
		int j=0;		
		String nombre,dni,fechIni;
		int pos[]=new int[2];
		nombre=dialogos.Dialogos_Cris.pedirCadena("Nombre cliente");
		alquiler.setNombre(nombre);
		dni=dialogos.Dialogos_Cris.pedirCadena("DNI");
		alquiler.setDNI(dni);
		fechIni=dialogos.Dialogos_Cris.pedirCadena("Fecha de inicio (dd-mm-aaaa)");			
		
		try {
			alquiler.setFechIni(LocalDate.parse(fechIni,formato1));
		}
		catch(DateTimeParseException e) {
			dialogos.Dialogos_Cris.mensajeError("Error en la fecha. Formato dd-mm-aaaa","Apli de alquiler");
		}		
		catch (Exception e) {			
			dialogos.Dialogos_Cris.mensajeError("ERROR","Apli de alquiler");
		}		
		for (j=0;j<2;j++)
			pos[j]=dialogos.Dialogos_Cris.pedirEntero("Posición "+(j+1));
		alquiler.setPos(pos);
		alquiler.setBarco(yate);		
		dialogos.Dialogos_Cris.mensajeInfo(Double.toString(alquiler.calcAlquiler())+" €","AppAlquileres");	
	}		
	
}
