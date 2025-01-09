import java.util.Scanner;

public class arreglos_12_tarea_1 {
    public static void main(String[] args) {
        // CREAOS EL ARREGLO INICIAL
        int[] numeros = new int[10];

        System.out.println(" ");

        System.out.println("INGRESE 10 NÚMEROS ENTEROS\n");

        // Llenado del arreglo
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + " : ");
            numeros[i] = consola.nextInt();
        }

        consola.close();

        System.out.println("\n============== ARREGLO ORIGINAL ===============\n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número [" + (i + 1) + "] : " + numeros[i]);
        }

        System.out.println(" ");
        System.out.println("============ ARREGLO POR PAREJAS ============\n");
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.println("Pareja " + (i + 1) + ": " + numeros[i] + " & " + (numeros[numeros.length - 1 - i]));
        }
        System.out.println("\n");
    }
}
