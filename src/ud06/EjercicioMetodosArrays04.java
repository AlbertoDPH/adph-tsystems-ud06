package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int numFactorial;

		System.out.println("Introduce un número");
		num = scan.nextInt();

		numFactorial = calcularFactorial(num);

		System.out.println("El número factorial de " + num + " es: " + numFactorial);

	}

	public static int calcularFactorial(int num) {

		// Variable que nos sirve de acomulador
		int acomulaNum = 0;

		// Guardamos el resultado del factorial y lo inicializamos con el número que
		// recibe por parámetro
		int numFactorial = num;

		/*
		 * Recorre todos los números de forma descendente, que hay entre el número
		 * pasado por parámetro y 1
		 */
		for (int i = num - 1; i >= 1; i--) {

			acomulaNum = numFactorial * i;// Acomula el resultado en cada vuelta de buble

			numFactorial = acomulaNum;// Guarda el resultado a cada vuelta y se lo pasa a acomulaNum

		}

		return acomulaNum;// Devuelve el número factorial
	}
}
