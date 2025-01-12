import java.text.DecimalFormat;
import java.util.Scanner;

public class arreglos_13_tarea_3_nuevo {
    public static void main(String[] args) {
        // CONTAR ENTEROS POSITIVOS Y NEGATIVOS Y CEROS, SUMAR Y PROMEDIAR
        // ABRIMOS CONSOLA
        Scanner consola = new Scanner(System.in);

        System.out.print("\n¿Cuántos números va a ingresar? ");
        int cantd = consola.nextInt();

        // Creamos el arreglo principal
        int[] numeros = new int[cantd];
        // Creamos variables
        int totalPositivos = 0, totalNegativos = 0, sumaPos = 0, sumaNeg = 0, totalCeros = 0, j = 0, k = 0;
        // Creamos arrreglos positivo y negativo
        int[] numPos, numNeg;

        // Llenamos el arreglo
        System.out.println(" ");
        System.out.println("Ingrese números enteros positivos o negativos o cero\n");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = consola.nextInt();
        }

        consola.close();

        // Ciclo para contar números

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                totalNegativos++;
            } else if (numeros[i] > 0) {
                totalPositivos++;
            } else {
                totalCeros++;
            }
        }

        numPos = new int[totalPositivos];
        numNeg = new int[totalNegativos];

        // LLENAMOS ARREGLOS POS Y NEG

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                numPos[j++] = numeros[i];
            } else if (numeros[i] < 0) {
                numNeg[k++] = numeros[i];
            }
        }

        // Promedios
        DecimalFormat df = new DecimalFormat("#.00");

        // Se imprime la cantidad de positivos o negativos o ceros

        if (totalPositivos == 0) {
            System.out.println("\nNo hay números positivos");
        } else {
            System.out.println("\nLos números positivos son " + totalPositivos + ": ");
        }

        for (int i = 0; i < numPos.length; i++) {
            System.out.print(numPos[i] + "  ");
            sumaPos += numPos[i];
        }

        float promedioPositivo = (float) sumaPos / totalPositivos;

        if (sumaPos == 0) {
            System.out.println("No hay números positivos para sumar");
            System.out.println("No se puede obtener un promedio de números positivos");
        } else {
            System.out.println("La suma de los positivos es: " + sumaPos);
            System.out.println("El promedio de números positivos es: " + df.format(promedioPositivo));
        }

        if (totalNegativos == 0) {
            System.out.println("\nNo hay números negativos");
        } else {
            System.out.println("\nLos números negativos son " + totalNegativos + ": ");
        }

        for (int i = 0; i < numNeg.length; i++) {
            System.out.print(numNeg[i] + "  ");
            sumaNeg += numNeg[i];
        }

        float promedioNegativo = (float) sumaNeg / totalNegativos;

        if (sumaNeg == 0) {
            System.out.println("No hay números negativos para sumar");
            System.out.println("No se puede obtener un promedio de números negativos");
        } else {
            System.out.println("La suma de los negativos es: " + sumaNeg);
            System.out.println("El promedio de números negativos es: " + df.format(promedioNegativo));
        }

        if (totalCeros == 0) {
            System.out.println("\nNo hay ceros");
        } else {
            System.out.println("\nLos ceros son : " + totalCeros);
        }

    }
}
