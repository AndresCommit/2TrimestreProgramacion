package ejemplos;

public class Ejer6 {
	public static void main(String[] args) {
		Empleado emp1 = new Empleado();

		emp1.asignarValores("Luisa", 1300);
		emp1.datosEmpleado();
		emp1.setSueldo(1450);
		emp1.datosEmpleado();
		emp1.setNombre("Sandra");
	}
}
