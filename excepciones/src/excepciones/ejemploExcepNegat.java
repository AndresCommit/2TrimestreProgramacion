package excepciones;

public class ejemploExcepNegat {
//aqui tenemos el método para lanzar la excepcion
	public int suma (int a, int b) throws valornegativo {
		int suma=a+b;
		valornegativo ex= new valornegativo("Sumando negativos");
		if (a<0 || b<0)
			throw ex;
		
		return (suma);
	}
}
