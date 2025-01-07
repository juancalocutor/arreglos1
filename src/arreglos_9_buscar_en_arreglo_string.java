import java.util.Scanner;

public class arreglos_9_buscar_en_arreglo_string {
    public static void main(String[] args) {

        System.out.println("\n======= ARREGLO DE STRING =======");
        // ABRIMOS CONSOLA
        Scanner consola = new Scanner(System.in);
        // SOLICITAMOS CANTIDAD DE NOMBRES
        System.out.print("\n¿Cuántos nombres va a ingresar? ");
        int cant = consola.nextInt();
        consola.nextLine(); // DEBE PONERSE SIEMPRE QUE DE UN ENTERO SE PASE A UN STRING
        // CREAMOS EL ARREGLO CON LA CANTIDAD DE NOMBRES
        String[] nombres = new String[cant];
        // CICLO FOR PARA PEDIR LOS NOMBRES
        System.out.println();
        System.out.println("Indique los nombres: \n");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            nombres[i] = consola.nextLine();
        }
        // CICLOS PARA BUSQUEDA
        // VARIABLE CONTADOR
        int i = 0;
        // CICLO FOR PARA BUSQUEDA
        System.out.print("\nIndique el nombre que desea buscar: ");
        String buscar = consola.nextLine();
        consola.close();
        for (; i < nombres.length && !nombres[i].equalsIgnoreCase(buscar); i++) {
        }
        if (i == nombres.length) {
            System.out.println("\nNombre no encontrado");
        } else if (nombres[i].equalsIgnoreCase(buscar)) {
            System.out.println("\nNombre encontrado en la posición " + (i + 1));
        }
    }
}
