package dialogos;
import javax.swing.*;

public class Dialogos_Cris {
	public static String pedirCadena(String mensaje) {
		try {
			return(JOptionPane.showInputDialog(mensaje));
		}
		catch(NumberFormatException ex) {
			Dialogos_Cris.mensajeError("Error de tipo de dato","Aplicación de Cris");
		}
		catch(Exception e) {
			Dialogos_Cris.mensajeError("ERROR GRAVE","Aplicación de Cris");
		}
		return("");
	}
	
	public static int pedirEntero(String mensaje){
		try {
			String ax = JOptionPane.showInputDialog(mensaje);
			int valor=Integer.parseInt(ax);
			return valor;
			
		}
		catch(NumberFormatException ex) {
			Dialogos_Cris.mensajeError("Error de tipo de dato","Aplicación de Cris");
		}
		catch(Exception e) {
			Dialogos_Cris.mensajeError("ERROR GRAVE","Aplicación de Cris");
		}
		return 0;
	}

	public static float pedirFloat (String mensaje) {
		try {
			String ax = JOptionPane.showInputDialog(mensaje);
			float valor=Float.parseFloat(ax);
			return valor;
			
		}catch(NumberFormatException ex) {
			Dialogos_Cris.mensajeError("Error de tipo de dato","Aplicación de Cris");
		}
		catch(Exception e) {
			Dialogos_Cris.mensajeError("ERROR GRAVE","Aplicación de Cris");
		}
		return 0;
	}	

	public static double pedirDouble (String mensaje) {
		try {
			String ax = JOptionPane.showInputDialog(mensaje);
			double valor=Double.parseDouble(ax);
			return valor;
			
		}catch(NumberFormatException ex) {
			Dialogos_Cris.mensajeError("Error de tipo de dato","Aplicación de Cris");
		}
		catch(Exception e) {
			Dialogos_Cris.mensajeError("ERROR GRAVE","Aplicación de Cris");
		}
		return 0;
	}	
	public static void mensajeWarning(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje,"título",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void mensajeWarning(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
	}
	
	public static void mensajeInfo(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje,"título",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void mensajeInfo(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void mensajeError(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje,"título",JOptionPane.ERROR_MESSAGE);
	}
	
	public static void mensajeError(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
	public static int confirmaDialogo(String pregunta) {
		int respuesta=0;
		respuesta=JOptionPane.showConfirmDialog(null, pregunta,"",JOptionPane.YES_NO_OPTION);
		return(respuesta);
	}
	public static int pedirOpcion(String mensaje, String titulo, String []opciones) {
		int opcion=0;
		opcion = JOptionPane.showOptionDialog(null, mensaje, 
					opciones[0], 0, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
		return(opcion);
	}

}
