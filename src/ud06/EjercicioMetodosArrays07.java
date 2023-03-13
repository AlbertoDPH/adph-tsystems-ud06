package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double cantidadEuro = 0;
		String tipoMoneda = "";
		int opcion = 0;

		System.out.println("A que tipo de moneda quieres convertir");
		System.out.println("1.Libras");
		System.out.println("2.Dorales");
		System.out.println("3.Yenes");

		// Seguirá preguntando la opción mientras no se cumpla
		while (opcion < 1 || opcion > 3) {

			System.out.println("\nElige una opción (1,2,3)");
			opcion = scan.nextInt();

			// Los condicionales guardan el tipo de moneda, para pasarlo por parámetro.
			if (opcion == 1)
				tipoMoneda = "Libras";

			else if (opcion == 2)
				tipoMoneda = "Dorales";

			else if (opcion == 3)
				tipoMoneda = "Yenes";

			else
				System.err.println("Opción no valida");

		}

		System.out.println("\nIntroduce cantidad a convertir:");
		cantidadEuro = scan.nextDouble();

		// Llamada a la función y se le pasa por parámetro la cantidad a convertir y el
		// tipo de moneda.
		convieterEuro(cantidadEuro, tipoMoneda);

		scan.close();

	}

	/**
	 * Método que convierte de euro a libras,dolares y yenes
	 * 
	 * @param euro       cantidad de euros a convertir
	 * @param tipoMoneda tipod de la moneda a convertir
	 */
	public static void convieterEuro(double euro, String tipoMoneda) {

		double monedaConvertida;

		switch (tipoMoneda) {
		case "Libras":
			monedaConvertida = euro * 0.86;
			System.out.println(euro + " euros son: " + monedaConvertida + " " + tipoMoneda);
			break;
		case "Dorales":
			monedaConvertida = euro * 1.28611;
			System.out.println(euro + " euros son: " + monedaConvertida + " " + tipoMoneda);
			break;
		case "Yenes":
			monedaConvertida = euro * 129.852;
			System.out.println(euro + " euros son: " + monedaConvertida + " " + tipoMoneda);

		}
	}
}
