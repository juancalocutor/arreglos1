import java.util.Scanner;

public class arreglos_11_eliminar_elemento {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("\n¿Cuántos números desea ingresar? ");
        int cantidad = consola.nextInt();
        System.out.println(" ");

        int[] numeros = new int[cantidad];
        int[] numeros2 = new int[cantidad - 1];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + " : ");
            numeros[i] = consola.nextInt();
        }
        System.out.println(" ");

        System.out.print("Indique la posición del número que desea eliminar del 1 al " + cantidad + " : ");
        int posicion = consola.nextInt();
        consola.close();
        System.out.println(" ");

        int pos = posicion - 1;

        for (int i = pos; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        // para imprimir el resultado se puede iterar menos el último elemento para que no quede repetido
        for (int i = 0; i < numeros.length - 1; i++) {
            System.out.println((i + 1) + " => " + numeros[i]);
        }

        // O se puede copiar el arreglo en uno nuevo con menos elementos
        System.arraycopy(numeros, 0, numeros2, 0, numeros2.length);
        System.out.println(" ");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println((i + 1) + " => " + numeros2[i]);
        }
        System.out.println(" ");
    }
}
