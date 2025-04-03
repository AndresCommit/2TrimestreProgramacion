package ejemplos;

public class EjemploExcepNegat2 {
	public int suma(int a, int b){		
		int suma=0;
		ExceptionNegativo ex=new ExceptionNegativo("Sumando negativo");
		try {
			if (a<0 || b<0)
				throw ex;
			else
				suma=a+b;
		}catch(ExceptionNegativo exneg) {
			System.out.println(exneg.getMessage());			
		}
		return(suma);
	}
}

