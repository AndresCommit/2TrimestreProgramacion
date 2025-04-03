package ArrayList;

import java.util.ArrayList;

public class Ejemplo1 {

	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //recorremos el arrayList
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars.get(i));
	    }
	}

}
