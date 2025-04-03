package ejemplos;

public class EjeExcNegPropagando {
	public int suma(int a, int b) throws ExceptionNegativo{		
		int suma=0;
		ExceptionNegativo ex=new ExceptionNegativo("Sumando negativo");
		if (a<0 || b<0)
			throw ex;
		else
			suma=a+b;
		return(suma);
	}
}

