package ArrayList;

import java.util.Comparator;

public class AluComparable implements Comparator {

	public int compareTo(Object o1, Object o2) {
		int resul;
	Alumno al1=(Alumno)o1;
	Alumno al2=(Alumno)o2;
	resul=al1.getNombre().compareTo(al2.getNombre());
	
		return (resul);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
