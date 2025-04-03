package excepciones;

public class valornegativo extends Exception {

	public valornegativo(String msg) {
		super (msg);

	}
	public void getMensaje(String msg) {
		System.out.println(msg);
	}
	
}
