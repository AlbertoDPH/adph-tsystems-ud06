package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tamanyoArray;

		// El tamaño del array lo introducimos por teclado
		System.out.print("Introduce tamaño del array: ");
		tamanyoArray = scan.nextInt();

		int numeros[] = new int[tamanyoArray];

		// Llamada al método que rellena el array con números aleatorios.
		rellenaArrayAlea(numeros);

		// LLamada al método que muestra loos valores de los indices y después los suma.
		mostrarArray(numeros);

	}

	/**
	 * Muestra los valores de los indices del array y después hace la suma total del
	 * valor de los indices.
	 * 
	 * @param numeros array de de numeros enteros que se pasa por parámetro
	 */
	public static void mostrarArray(int[] numeros) {

		int sumaArray = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice: " + i + ",Valor: " + numeros[i]);

			sumaArray += numeros[i];

		}
		System.out.println("\nSuma total del valor de los indices del array: " + sumaArray);

	}

	/**
	 * Rellena una array con números enteros aleatorios entre 0 y 9
	 * 
	 * @param numeros array vacio que se le pasa por parámetro
	 */
	public static void rellenaArrayAlea(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10);
		}

	}
}
