package ejemplos;

public class AuxEjemplo3 {
	public static void main(String[] args) {
		float sueldo1, sueldo2;
		Empleado empleado1, empleado2;

		empleado1 = new Empleado();
		empleado2 = new Empleado();

		System.out.println("Pido los datos del Empleado1");
		empleado1.pedirDatos();
		System.out.println("Pido los datos del Empleado2");
		empleado2.pedirDatos();

		System.out.println("Visualizo los datos de los 2 empleados");
		empleado1.datosEmpleado();
		empleado2.datosEmpleado();

		sueldo1 = empleado1.getSueldo();
		sueldo2 = empleado1.getSueldo();

	}

}
