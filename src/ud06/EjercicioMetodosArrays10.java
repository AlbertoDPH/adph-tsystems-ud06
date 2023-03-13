package ud06;

import java.util.Scanner;

public class EjercicioMetodosArrays10 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tamanyoArray;
        int rangoNumAlea1;
        int rangoNumAlea2;
        int numArrayMayor;

        System.out.print("Introduce tamaño array:");
        tamanyoArray = scan.nextInt();

        int[] numerosPrimos = new int[tamanyoArray];

        do {
            System.out.println("Introduce primer rango del números aleatorios: ");
            rangoNumAlea1 = scan.nextInt();

            System.out.println("Introduce segundo rango de números aleatorios: ");
            rangoNumAlea2 = scan.nextInt();

            if (rangoNumAlea1 >= rangoNumAlea2 || rangoNumAlea1 == 0)
                System.err.println("El primer rango de números debe ser mayor que 0\nEl segundo rango de números, debe ser mayor que el primero");

        } while (rangoNumAlea1 >= rangoNumAlea2 || rangoNumAlea1 == 0);


        numerosPrimos = arrayNumPrimos(numerosPrimos, rangoNumAlea1, rangoNumAlea2);


        System.out.println("\nNúmeros primos aletorios");
        for (int primo : numerosPrimos) {
            System.out.print(primo + " ");
        }

        numArrayMayor = numPrimoMayor(numerosPrimos);

        System.out.print("\n\nNúmero primo mayor: " + numArrayMayor);
        
        scan.close();


    }

    public static int numPrimoMayor(int[] numPrimos) {

        int numPrimoMayor = 0;
        int acomula = 0;
        int cont = 0;


        while (cont < numPrimos.length) {

            for (int i = 0; i < numPrimos.length - 1; i++) {

                if (numPrimos[cont] > numPrimos[i + 1]) {
                    numPrimoMayor = numPrimos[cont];
//                    cont++;

                }
//
//

                if (numPrimoMayor > acomula) acomula = numPrimoMayor;
            }

            cont++;

        }
        return acomula;
    }

    public static int[] arrayNumPrimos(int[] numPrimos, int rangoNum1, int rangoNum2) {

        int numAleatorio;
        boolean primo;

        for (int i = 0; i < numPrimos.length; i++) {

            int contador = 2;
            primo = true;

            numAleatorio = (int) (Math.random() * rangoNum2 + rangoNum1);

            // Los tres primeros los obviamos
            if (numAleatorio == 1 || numAleatorio == 2 || numAleatorio == 3) {
                numPrimos[i] = numAleatorio;

            } else {
                // mientras primo sea verdadero y contador sea diferente del número aleatorio generado
                while ((primo) && (contador != numAleatorio)) {

                /* Si el resto de la división entre el número aleatorio y el número del contador es 0
                primo será false
                */
                    if (numAleatorio % contador == 0)
                        primo = false;

                    //Incrementamos el contador
                    contador++;

                }
            /*Si después de que el número aleatorio se haya dividido por todos los números incluido el mismo
            y primo sea true añadimos en el array el valor del número aleatorio*/
                if (primo)
                    numPrimos[i] = numAleatorio;

                    //Si no, haremos que se vuelva a recorrer esa posición del array
                else i--;
            }


        }
        //Devuelve el array con lo números primos
        return numPrimos;
    }

}
