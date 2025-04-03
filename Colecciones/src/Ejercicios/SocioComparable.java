package Ejercicios;

import java.util.Comparator;

public class SocioComparable implements Comparator {

	public int compareTo(Object o1, Object o2) {
		int resul;
	Socio so1=(Socio)o1;
	Socio so2=(Socio)o2;
	resul=so1.getNombre().compareTo(so2.getNombre());
	
		return (resul);
	}
	
	public int compare(Object o1, Object o2) {
		return 0;
	}
}
