package ejemplos;

public class EjemploExcepPropia2 {

	public static void main(String[] args) {
		int val1=5,val2=-8;
		int suma=0;
		EjemploExcepNegat2 ejem=new EjemploExcepNegat2();
		suma=ejem.suma(val1,val2);
		System.out.println("Suma= "+suma);
		
	}
}
