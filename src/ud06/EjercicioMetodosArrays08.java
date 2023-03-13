package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays08 {

	public static void main(String[] args) {

		int numAleatorio[] = new int[10];

		rellenaArray(numAleatorio);

		mostrarArray(numAleatorio);

	}

	/**
	 * Muestra el contendo de una Array de números enteros
	 * @param numeros Se le pasa por parámetro el Array a mostrar
	 */
	public static void mostrarArray(int[] numeros) {
		System.out.println("\nMostrando valores del Array");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice: " + i + ", Valor: " + numeros[i]);
		}

	}
	/**
	 * Rellena un Array con números enteros
	 * @param numeros Se le pasa por parámetro el Array a rellenar
	 */
	public static void rellenaArray(int[] numeros) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce número " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}
		scan.close();
	}

}
