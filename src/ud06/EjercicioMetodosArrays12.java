package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tamanyoArray;
		int digito = 0;
		int[] numArray;
		int[] numArraySelec;
		int cont = 0;

		System.out.println("Introduce tamaño del array:");
		tamanyoArray = scan.nextInt();

		// Le pasamos las posiciones que tendrá el array
		numArray = new int[tamanyoArray];

		// Controlamos que el número este entre (0 -9)
		do {
			System.out.println("Introduce un número entre (0 - 9)");
			digito = scan.nextInt();

			if (digito < 0 || digito > 9)
				System.err.println("Dígito no valido");
		} while (digito < 0 || digito > 9);

		// Instanciamos un array que contendra los números acabados en el digito
		// seleccionado
		numArraySelec = new int[tamanyoArray];

		// Llenamos el array con números entre (1-300)
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = (int) (Math.random() * 300 + 1);

			/*
			 * Si el digito seleccionado = al último digito del número de la posición actual
			 * del array añade ese número a el array numArraySelec.
			 */
			if (digito == numArray[i] % 10) {
				numArraySelec[cont] = numArray[i];
				// usamos cont para que no haya espacios vacios en las posiciones del array
				cont++;
			}
		}
		// Muestra por consola el contenido del array de números aleatorios
		System.out.println("Array con números aleatorios entre (1 -300): ");
		for (int numAle : numArray) {
			System.out.print(numAle + " ");
		}

		System.out.println("\n\nNúmeros de array acabados en: " + cont);

		// Muestra el contenido del array con los números acabados en el digito
		// seleccinado
		for (int i = 0; i < cont; i++) {
			System.out.print(numArraySelec[i] + " ");
		}
		scan.close();
	}
}
