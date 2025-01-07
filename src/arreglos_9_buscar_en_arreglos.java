import java.util.Scanner;

public class arreglos_9_buscar_en_arreglos {
    public static void main(String[] args) {
        // PRIMERO ARREGLO DE ENTEROS
        System.out.println("======= ARREGLO DE ENTEROS =======\n");
        // ABRIMOS CONSOLA
        Scanner consola = new Scanner(System.in);
        System.out.print("¿Cuántos números va a ingresar? ");
        int cantidad = consola.nextInt();
        // CREAMOS EL ARREGLO CON LA CANTIDAD
        int[] numeros = new int[cantidad];
        // CICLO PARA PEDIR NÚMEROS
        System.out.println("\nIngrese los números: \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " : ");
            numeros[i] = consola.nextInt();
        }
        // CICLO PARA BUSCAR POSICIÓN DEL NÚMERO
        // Abrimos consola
        System.out.print("Indique el número que desea buscar: ");
        int buscar = consola.nextInt();
        consola.close(); // CERRAMOS CONSOLA
        int i = 0; // VARIABLE CONTADOR
        for (; i < numeros.length && numeros[i] != buscar; i++) {} // SE ITERA i HASTA EL LARGO DEL ARREGLO Y DIFERENTE AL NÚMERO QUE SE BUSCA
        if (i == numeros.length) { // SI i RECORRE EL ARREGLO Y ES DIFERENTE AL NÚMERO QUE SE BUSCA SE DA NO ENCONTRADO
            System.out.println("Número no encontrado");
        } else if (numeros[i] == buscar) { // SI i RECORRE EL ARREGLO Y RESULTA UN IGUAL AL NÚMERO QUE SE BUSCA ARROJA ENCONTRADO Y SE IMPRIME LA POSICIÓN
            System.out.println("Número encontrado en la posición " + (i + 1));
        }

    }
}
