package excepciones;

public class ExcepValorNegativo {

	public static void main(String[] args) {
		int val1 = 5, val2 = 8;
		int suma = 0;
		ejemploExcepNegat ejem = new ejemploExcepNegat();
		try {

		} catch (valornegativo valornegativo) {
			System.out.println(valornegativo.getMensaje());
			valornegativo.getMensaje("Valor negativo");
		}
	}

}
