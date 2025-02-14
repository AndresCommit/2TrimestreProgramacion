package herencia;

public class PrincipalEjemplo1 {

	public static void main(String[] args) {
		Persona per1 = new Persona("Cristina", "Pérez García",25, "Calle Mayor, 25");
		System.out.println("Datos persona: " + per1.toString());
		per1.setNombre("Luisa");
		
		per1.setApellidos("Risas, elRisas");
		System.out.println("Datos persona: " + per1.toString());

		Alumno all=new Alumno() ;
	}
}
