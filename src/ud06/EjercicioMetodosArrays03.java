package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		boolean esPrimo;

		System.out.println("Introduce un número");
		num = scan.nextInt();

		// Llama al método y el valor lo alamacena en una varaible
		esPrimo = esPrimo(num);

		System.out.println(esPrimo);

	}

	/**
	 * Método que devuelve true, si el número es primo y false si no lo es.
	 * 
	 * @param recibe por el número que hemos introducido por teclado
	 * @return devuelve true si el número es promo y false, si no lo es.
	 */
	public static boolean esPrimo(int num) {

		int contador = 2;// Lo iniciamos en 2 y no en 1 para que en el while no salga al dividir entre 1
		boolean primo = true;

		if (num == 0)
			System.err.println("Número no valido");// Controla el elemento neutro

		if (num == 1 || num == 2 || num == 3)
			return true;// Los tres primeros los obviamos

		if (num % 2 == 0)
			return false;// No continua con los demás números, si es divisible entre 2

		// mientras primo sea verdadero y contador sea diferente al número que hemos
		// introducido, seguirá
		while ((primo) && (contador != num)) {
			// Si el resto de la división entre el número introducido y el número del
			// contador es 0 devuelve false
			if (num % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

}
