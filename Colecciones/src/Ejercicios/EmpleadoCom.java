package Ejercicios;

import java.util.Comparator;

public class EmpleadoCom implements Comparator {

	public int compareTo(Object o1, Object o2) {
		int resul;
		Empleado em1=(Empleado)o1;
		Empleado em2=(Empleado)o2;
		resul=em1.getNombre().compareTo(em2.getNombre());

		return resul;
	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
