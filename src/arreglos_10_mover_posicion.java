import java.util.Scanner;

public class arreglos_10_mover_posicion {
    public static void main(String[] args) {
        // INICIAMOS SCANNER Y DECLARAMOS EL ARREGLO
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números: ");
        int cant = consola.nextInt();

        int[] numeros = new int[cant];
        // VARIABLE PARA RESPALDAR EL ÚLTIMO NÚMERO DEL ARREGLO
        int ultimo;

        System.out.println("\n");

        // SOLICITAMOS LOS NÚMEROS CON UN FORI
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + " : ");
            numeros[i] = consola.nextInt();
        }

        consola.close();

        System.out.println("\nArreglo inicial: \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Arreglo: " + numeros[i]);
        }

        ultimo = numeros[numeros.length - 1];
        // CICLO PARA VOLVER A ITERAR EL ARREGLO CON EL NUEVO ORDEN
        for (int i = (numeros.length - 2); i >= 0; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[0] = ultimo;

        System.out.println("\nArreglo modificado: \n");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Arreglo: " + numeros[i]);
        }
    }
}
