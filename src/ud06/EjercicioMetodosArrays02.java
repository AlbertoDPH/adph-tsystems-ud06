package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cantidadNumeros; // Cantidad de números que se generan
		int valorNum1; // Valor primer rango de números
		int valorNum2; // Valor segundo rango de números

		int numeroGenerado;// número aleatorio generado

		System.out.println("Introduce la cantidad de números:");
		cantidadNumeros = scan.nextInt();

		System.out.println("Introduce rango de valores:");

		System.out.println("Valor 1");
		valorNum1 = scan.nextInt();

		System.out.println("Valor 2");
		valorNum2 = scan.nextInt();

		/*
		 * bucle que llama al método que genera los números aleatorios, las veces que
		 * indique la variable cantidadNumeros
		 */
		for (int i = 0; i < cantidadNumeros; i++) {
			// Llamada al método pasando por parámetro los rangos entre los números
			numeroGenerado = generaNumeroAleatoio(valorNum1, valorNum2);

			// Muestra el número generado
			System.out.print(numeroGenerado + " ");
		}

		scan.close();

	}

	/**
	 * Método que devuelve un número aleatorio entre dos rangos de números
	 * 
	 * @param num1 Valor del primer rango pasado por parámetro
	 * @param num2 Valor del segundo rango pasado por parámetro
	 * @return devuelve el número aleatorio generado
	 */
	public static int generaNumeroAleatoio(int num1, int num2) {
		/*
		 * Genera un número aleatorio entero entre dos números ambos incluidos. Se hace
		 * cast a int para que el número sea de tipo entero
		 */
		int numeroAlea = (int) (Math.floor(Math.random() * (num1 - num2 + 1) + num2));
		return numeroAlea;
	}

}
