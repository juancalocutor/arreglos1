import java.util.Arrays;
import java.util.Scanner;

public class arreglos_10_mover_posicion_3 {
    public static void main(String[] args) {
        // ABRIMOS CONSOLA Y DECLARAMOS VARIABLES
        Scanner consola = new Scanner(System.in);
        // SOLICITAMOS LA CANTIDAD DE NÚMEROS
        System.out.print("\n¿Cuántos números va a ingresar? ");
        int cantidad = consola.nextInt();
        // DECLARAMOS EL ARREGLO CON UNA CASILLA ADICIONAL
        int[] numeros = new int[cantidad + 1];
        int elemento, posicion;
        // CICLO FOR PARA LLENAR EL ARREGLO
        System.out.print("\n");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + " : ");
            numeros[i] = consola.nextInt();
        } // ARREGLO LLENO
        
        // solicitar nuevo número e iniciar iteración con while
        System.out.print("\n¿Cuál es el nuevo número? ");
        elemento = consola.nextInt();

        consola.close();
        // CICLO WHILE PARA ENCONTRAR LA POSICIÓN
        posicion = 0;
        while (posicion < numeros.length && elemento > numeros[posicion]) {
            posicion++;
        }

        for (int i = (numeros.length - 2); i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[posicion] = elemento;

        Arrays.sort(numeros);

        System.out.println("\nEl arreglo ordenado es: \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + " : " + numeros[i]);
        }
    }
}
