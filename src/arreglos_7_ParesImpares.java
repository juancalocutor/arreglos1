import java.util.Scanner;

public class arreglos_7_ParesImpares {
    public static void main(String[] args) {
        // Abrimos consola para crear el arreglo con la cantidad de números que indique
        // el ususario
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números desea ingresar? ");
        int largoArreglo = sc.nextInt();

        // Creamos el arreglo con el largo indicado
        int[] paresImpares = new int[largoArreglo];

        // Creamos los arreglos pares e impares y ls variables para llenarlos
        int[] pares, impares;
        int totalPares = 0, totalImpares = 0, contPares = 0, contImpares = 0;

        // Ciclo for para llenar el arreglo
        for (int i = 0; i < paresImpares.length; i++) {
            System.out.print("Indique el número " + (i + 1) + ": ");
            paresImpares[i] = sc.nextInt();
        }

        sc.close();

        // Ciclo for con ciclo if else para hallar pares e impares
        for (int i = 0; i < paresImpares.length; i++) {
            if (paresImpares[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        // Con los números hallados llenamos los arreglos pares e impares

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int k = 0;
        int m = 0;

        for (int i = 0; i < paresImpares.length; i++) {
            if (paresImpares[i] % 2 == 0) {
                pares[k++] = paresImpares[i];
                contPares++;
            } else {
                impares[m++] = paresImpares[i];
                contImpares++;
            }
        }

        System.out.println(" ");

        // se imprime
        System.out.println("Números pares: " + contPares);
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
            
        }

        System.out.println(" ");

        System.out.println("Números impares: " + contImpares);
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
            
        }
    }
}
