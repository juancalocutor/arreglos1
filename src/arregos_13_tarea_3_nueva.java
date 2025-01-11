import java.util.Scanner;

public class arregos_13_tarea_3_nueva {
    public static void main(String[] args) {
        // ABRIMOS CONSOLA
        Scanner consola = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("¿Cuántos números va a ingresar? ");
        int cantidad = consola.nextInt();

        // CREAMOS EL ARREGLO Y LAS VARIABLES
        int toPos = 0, toNeg = 0, toCer = 0, k = 0, m = 0, contPos = 0, contNeg = 0;
        int[] numeros = new int[cantidad];
        int[] totalPos, totalNeg;

        // LLENAMOS EL ARREGLO
        System.out.println(" ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = consola.nextInt();
        }

        consola.close();

        // CICLO PARA CONTAR NÚMEROS

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                toPos++;
            } else if (numeros[i] < 0) {
                toNeg++;
            } else {
                toCer++;
            }
        }

        // CON LOS NÚMEROS HALLADOS LLENAMOS LOS ARREGLOS POSITIVOS Y NEGATIVOS
        totalPos = new int[toPos];
        totalNeg = new int[toNeg];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                totalPos[k++] = numeros[i];
                contPos++;
            } else if (numeros[i] < 0) {
                totalNeg[m++] = numeros[i];
                contNeg++;
            }
        }

        // SE IMPRIME

        float sumPos = 0, sumNeg = 0;

        System.out.println("\n");
        System.out.println("Números positivos: " + contPos);
        System.out.println(" ");
        for (int i = 0; i < totalPos.length; i++) {
            System.out.print(totalPos[i] + "   ");
            sumPos += totalPos[i];
        }

        float proPos = (sumPos / contPos);

        System.out.println("Promedio números positivos: " + proPos);

        System.out.println("\n");
        System.out.println("Números negativos: " + contNeg);
        for (int i = 0; i < totalNeg.length; i++) {
            System.out.print(totalNeg[i] + "   ");
            sumNeg += totalNeg[i];
        }

        float proNeg = (sumNeg / contNeg);

        System.out.println("Promedio números negativos: " + proNeg);

        System.out.println("\n");
        System.out.println("Total ceros: " + toCer);
        System.out.println(" ");
    }
}
