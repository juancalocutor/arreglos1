import java.util.Scanner;

public class arreglos_9_buscarenarreglos {
    public static void main(String[] args) {
        System.out.println("\n======== BUSCAR EN UN ARREGLO DE NÚMEROS ========");
        // Solicitamos la cantidad de números a ingresar

        Scanner sc = new Scanner(System.in);
        System.out.print("\n¿Cuántos números va a ingresar? ");
        int cantidad = sc.nextInt();

        // Creamos el arreglo con la cantidad de números a ingresar
        int[] num = new int[cantidad];

        // Ciclo for para llenar el arreglo
        System.out.println("\nIngrese los números: ");
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " : ");
            num[i] = sc.nextInt();
        }

        // Cilos para buscar el número
        System.out.print("\nIngrese el valor que desea buscar: ");
        int buscar = sc.nextInt();

        //Variable contador. el ciclo se detiene si es igual al numero buscado
        int i = 0;

        for (; i < num.length && num[i] != buscar; i++) {
            // Ciclo for vacio itera hasta el total del largo del arreglo
        }

        if (i == num.length) {
            System.out.println("Número no encontrado");
        } else if (num[i] == buscar) {
            System.out.println("Encontrado en la posición: " + (i + 1));
        }

        System.out.println("\n======= ARREGLO DE STRING =======");
        //SE SOLICITA LA CANTIDAD DE NOMBRES
        System.out.print("\n¿Cuántos nombres va a ingresar? ");
        int cantidad2 = sc.nextInt();
        sc.nextLine();

        //CREAMOS EL ARREGLO CON LA CANTIDAD DE NOMBRES
        String[] nombres = new String[cantidad2];

        System.out.println(" ");

        //Ciclo para solicitar nombres
        for (int j = 0; j < nombres.length; j++) {
            System.out.print("Nombre " + (j + 1) + " : ");
            nombres[j] = sc.nextLine();
        }

        //CICLO PARA BUSCAR NOMBRE
        System.out.print("\nIngrese el nombre que desea buscar: ");
        String buscar2 = sc.nextLine();

        //Variable contador
        int j = 0;

        for (; j < nombres.length && !nombres[j].equalsIgnoreCase(buscar2); j++) {
        }

        if (j == nombres.length) {
            System.out.println("Nombre no encontrado ");
        } else if (nombres[j].equalsIgnoreCase(buscar2)) {
            System.out.println("Nombre encontrado en la posición " + (j + 1));
        }

        sc.close(); 

    }
}
