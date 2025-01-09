import java.util.Scanner;

public class arreglos_12_tarea_1 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        // CREAOS EL ARREGLO INICIAL
        System.out.print("\n¿Cuántos números va a ingresar? ");
        int cantidad = consola.nextInt();
        int[] numeros = new int[cantidad];

        System.out.println(" ");

        System.out.println("INGRESE " + cantidad + " NÚMEROS ENTEROS\n");

        // Llenado del arreglo

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
        // SE IMPRIME EL NÚMERO MAYOR
        System.out.println("==================== SE IMPRIME EL NÚMERO MAYOR ================\n");
        int max = 0;
        int min = 0;

        for (int i = 0; i < numeros.length; i++) {
            max = (numeros[max] > numeros[i]) ? max : i;
            min = (numeros[min] < numeros[i]) ? min : i;
        }
        System.out.println("\nEl número mayor es: " + numeros[max] + " y el menor es: " + numeros[min]);
        System.out.println("\n");
    }
}
