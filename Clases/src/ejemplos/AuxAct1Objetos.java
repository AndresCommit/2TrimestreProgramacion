package ejemplos;

public class AuxAct1Objetos {
    private int asteriscos;
    private char caracter;

    // Constructor con parámetros para el número de asteriscos y el carácter
    public AuxAct1Objetos(int nAsteriscos, char caracter) {
        this.asteriscos = nAsteriscos;
        this.caracter = caracter;
    }

    // Método para imprimir el carácter especificado tantas veces como asteriscos
    public void imprimirCaracteres() {
        for (int i = 0; i < asteriscos; i++) {
            System.out.print(caracter);
        }
        System.out.println(); // Para saltar a la siguiente línea después de imprimir
    }
}