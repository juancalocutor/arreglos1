import java.util.Scanner;

public class arreglos_10_mover_posicion_2 {
    public static void main(String[] args) {
        // INICIAMOS SCANNER Y VARIABLES
        Scanner consola = new Scanner(System.in);
        System.out.print("\n¿Cuantos números va a ingresar? \n");
        int cantidad = consola.nextInt();

        int[] numeros = new int[cantidad + 1];

        // VARIABLES DE RECUPERACIÓN
        int elemento, posicion;

        // LLENAMOS EL ARREGLO
        for (int i = 0; i < numeros.length - 1; i++) {
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

        numeros[posicion] = elemento;

        System.out.println("El arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
