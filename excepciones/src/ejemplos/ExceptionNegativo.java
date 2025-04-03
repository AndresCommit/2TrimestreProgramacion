package ejemplos;

public class ExceptionNegativo extends Exception{
	public ExceptionNegativo(String msg) {
		super(msg);
	}
	public void getMensaje(String msg) {
		System.out.println(msg);
	}
}
