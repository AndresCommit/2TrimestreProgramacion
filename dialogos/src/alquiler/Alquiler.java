package alquiler;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import dialogos.Dialogos_Cris;

public class Alquiler {
	private String nombre;
	private String DNI;	
	private LocalDate fechIni;
	private int []pos=new int[2];
	private Barco barco=null;
	private final int PRBASE=15;	
	
	public Alquiler() {
		this.nombre="";
		this.DNI="";
	}
	
	public Alquiler(String nombre, String DNI, String fechIni, int[] pos, Barco barco) {		
		//formato de String de fecha aaaa-mm-dd
		this.nombre = nombre;
		this.DNI = DNI;
		this.fechIni = LocalDate.parse(fechIni);
		this.pos = pos;
		this.barco = barco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}	
	
	public LocalDate getFechIni() {
		return fechIni;
	}

	public void setFechIni(LocalDate fechIni) {
		this.fechIni = fechIni;
	}

	public int getPRBASE() {
		return PRBASE;
	}

	public Barco getBarco() {
		return barco;
	}
	
	public void setBarco(Barco b) {
		this.barco = b;
	}
	
	public int[] getPos() {
		return pos;
	}
	
	public void setPos(int[] pos) {
		this.pos = pos;
	}
	
	public long calcNumDias() {
		long numDias;
		numDias=ChronoUnit.DAYS.between(this.fechIni,LocalDate.now());
		return(numDias);
	}
	
	public double calcAlquiler(){
		double valor=0;		
		try {			
			valor=this.barco.calculaValor()*this.calcNumDias();		
			return(valor);
		}
		catch (NullPointerException e){			
			dialogos.Dialogos_Cris.mensajeError("Hay que añadir los datos del barco","Apli de alquiler");
			return(valor);
		}
	}

	@Override
	public String toString() {
		try {
		return "Alquiler [nombre=" + nombre + ", DNI=" + DNI + ", fechIni=" + fechIni.toString() + ", pos=" + Arrays.toString(pos)
				+ ", barco=" + this.getBarco().toString() + "]";
		}
		catch (NullPointerException e){			
			dialogos.Dialogos_Cris.mensajeError("Faltan datos del barco","Apli de alquiler");
			return("");
		}
	}	
}
