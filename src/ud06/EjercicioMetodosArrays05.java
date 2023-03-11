package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		String numBinario;

		System.out.println("Introduce un número");
		num = scan.nextInt();

		// Guardamos el número binario convertido
		numBinario = covertirABinario(num);

		System.out.println("El binario del número " + num + " es: " + numBinario);

		scan.close();
	}

	/**
	 * Convierte un número decimal a binario
	 * 
	 * @param num que le pasamso por parámetro
	 * @return nos devuelve el binario en formato String
	 */
	public static String covertirABinario(int num) {

		// Guarda el resto de la divisiones
		int restoDiv;

		// Guarda el resultado de la divisiones
		int resultDiv;

		// Acomula el resultado de la división
		int acomuResultDivi = num;

		// Guarda los restos de la divisiones
		String binarioInvertido = "";

		// Guarda el número binario
		String binario = "";

		// Lo usaremos para guardar las posicionesdel String
		char caracterBin;

		// Mientras el resultado de la división sea mayor que 1
		while (acomuResultDivi >= 1) {

			// Guarda el resultado de la división
			resultDiv = acomuResultDivi / 2;

			// Guarda el resto de la división acomulada
			restoDiv = acomuResultDivi % 2;

			// Acomula el resto de la división en cada vuelta
			acomuResultDivi = resultDiv;

			// Añade cada resto de la división en el String
			binarioInvertido += restoDiv;
		}
		// Bucle para invertir la cadena binarioInvertido
		for (int i = binarioInvertido.length() - 1; i >= 0; i--) {

			// Guarda el caracter de la posición de la cadena
			caracterBin = binarioInvertido.charAt(i);

			// Inserta en la cadena binario los caracteres de caracterBin
			binario += caracterBin;

		}
		// Devuelve el String con el número binario convertido
		return binario;
	}

}
