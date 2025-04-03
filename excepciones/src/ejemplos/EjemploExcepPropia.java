package ejemplos;

public class EjemploExcepPropia {

	public static void main(String[] args) {
		int val1=5,val2=-8;
		int suma=0;
		EjeExcNegPropagando ejem=new EjeExcNegPropagando();
		try {
			suma=ejem.suma(val1, val2);
			System.out.println("Suma= "+suma);
		}catch (ExceptionNegativo exneg){
			System.out.println(exneg.getMessage());
			exneg.getMensaje("Valor negativo---");
		}
	}
}
