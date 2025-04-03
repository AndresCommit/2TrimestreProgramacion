package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo2 {

	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    // Ordena cars 
	    Collections.sort(cars); 
	    
	    //for-each para recorrer los elementos
	    for (String i : cars) { 
	      System.out.println(i);
	    }

	}

}
