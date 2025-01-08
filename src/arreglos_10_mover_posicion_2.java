import java.util.Scanner;

public class arreglos_10_mover_posicion_2 {
    public static void main(String[] args) {
        // INICIAMOS SCANNER Y VARIABLES
        Scanner consola = new Scanner(System.in);
        System.out.print("\n¿Cuantos números va a ingresar? ");
        int cantidad = consola.nextInt();
        System.out.println(" ");

        int[] numeros = new int[cantidad + 1];

        // VARIABLES DE RECUPERACIÓN
        int elemento, posicion;

        // LLENAMOS EL ARREGLO
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + " : ");
            numeros[i] = consola.nextInt();
        }

        System.out.print("\nIngrese el nuevo número: ");
        elemento = consola.nextInt();

        System.out.print("\nIngrese la posición de 1 a " + cantidad + " : ");
        posicion = consola.nextInt();

        consola.close();

        for (int i = (numeros.length - 2); i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[posicion - 1] = elemento;

        System.out.println("\nEl arreglo: ");
        System.out.println(" ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + (i + 1) + " : " + numeros[i]);
        }
    }
}
