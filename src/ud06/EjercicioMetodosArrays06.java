package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int numCifras;
		boolean numOK = false;

		while (!numOK) {
			System.out.println("Introduce un número entero positivo:");
			num = scan.nextInt();

			if (num > -1)
				numOK = true;
			else
				System.err.println("El número debe ser positivo");
		}

		numCifras = cuentaCifras(num);

		System.out.println("El número " + num + " tiene: " + numCifras + " cifras.");

		scan.close();

	}

	public static int cuentaCifras(int num) {

		int contaLetras = 0;
		String converNum = "";

		converNum += num;

		for (int i = 0; i < converNum.length(); i++) {

			contaLetras++;

		}

		return contaLetras;
	}

}
