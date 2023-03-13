package ud06;

import java.util.Random;
import java.util.Scanner;

public class EjercicioMetodosArrays11 {

	public static void main(String[] args) {

		Random rnd = new Random();

		Scanner scan = new Scanner(System.in);

		int dimenArray;
		int posAleArray1;

		System.out.println("Inrtroduce dimensiones para Array 1 y Array2:");
		dimenArray = scan.nextInt();

		int[] arrayNum1 = new int[dimenArray];
		int[] arrayNum2 = new int[dimenArray];

		// Genera el primer array con números aleatorios entre (0 - 100)
		for (int i = 0; i < arrayNum1.length; i++) {
			arrayNum1[i] = Math.abs(rnd.nextInt(100 - 0));
		}

		// Genera el segundo array con los números de las posiciones aleatorias del
		// primer array
		for (int i = 0; i < arrayNum2.length; i++) {
			posAleArray1 = (int) (Math.random() * dimenArray);
			arrayNum2[i] = arrayNum1[posAleArray1];

		}
		// Muestra contenido del primer array
		System.out.println("\nContenido Array1");
		for (int numeros1 : arrayNum1) {
			System.out.print(numeros1 + " ");
		}

		System.out.println();

		// Muestra contenido del segundo array
		System.out.println("\nContenido Array2");
		for (int numeros2 : arrayNum2) {
			System.out.print(numeros2 + " ");
		}
		System.out.println("\n");

		//Llamada al método mutiplicaArrays
		multiplicaArrays(arrayNum1, arrayNum2);

		scan.close();

	}

	/**
	 * Método que se encarga de multiplicar los números de las posciones del primer array con las de
	 * segundo array, mostrando por consola el resultado.
	 * @param arrayNum1 primer array de números aleatorios entre (0-100)
	 * @param arrayNum2 segundo array con números aleatorios del primer array
	 */
	public static void multiplicaArrays(int[] arrayNum1, int[] arrayNum2) {

		int[] multiplicaArrays = new int[arrayNum1.length];

		for (int i = 0; i < arrayNum1.length; i++) {
			multiplicaArrays[i] = arrayNum1[i] * arrayNum2[i];
		}

		for (int i = 0; i < multiplicaArrays.length; i++) {
			System.out.println("Indice " + i + " Array1 y Array2: " + arrayNum1[i] + " * " + arrayNum2[i] + " = "
					+ (multiplicaArrays[i] = arrayNum1[i] * arrayNum2[i]));

		}

	}

}
