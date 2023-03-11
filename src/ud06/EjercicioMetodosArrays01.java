package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		double resultado = 0;
		int opcion = -1;

		System.out.println("Elige una opción:" + "\n1.Calcula area del circulo" + "\n2.Calcula area del triangulo"
				+ "\n3.Calcula area del cuadrado" + "\n\nElige opción (1-3)");

		opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			resultado = areaCirculo();
			System.out.println("El area del circulo es: " + resultado);
			break;

		case 2:
			resultado = areaTriangulo();
			System.out.println("El area del triangulo es: " + resultado);
			break;

		case 3:
			resultado = areaCuadrado();
			System.out.println("El area del cuadrado es: " + resultado);
			break;
		default:
			System.err.println("Opción incorrecta");

		}
	}

	public static double areaCuadrado() {
		System.out.println("Introduce lado");
		double lado = scan.nextDouble();
		double areaCuadrado = lado * lado;
		return areaCuadrado;
	}

	public static double areaTriangulo() {
		System.out.println("Introduce base");
		double base = scan.nextDouble();
		System.out.println("Introduce altura");
		double altura = scan.nextDouble();
		double areaTriangulo = (base * altura) / 2;
		return areaTriangulo;
	}

	public static double areaCirculo() {
		System.out.println("Introduce radio del circulo:");
		int radio = scan.nextInt();
		double areaCirculo = Math.pow(radio, 2) * Math.PI;
		return areaCirculo;
	}

}
