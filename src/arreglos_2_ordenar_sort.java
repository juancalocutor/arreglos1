import java.util.Arrays;

public class arreglos_2_ordenar_sort {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "CocaCola con Pan";
        productos[1] = "CocaCola con Roscón";
        productos[2] = "CocaCola con Empanada";
        productos[3] = "CocaCola con Chorizo";
        productos[4] = "CocaCola con Arepa";
        productos[5] = "CocaCola con Papa";
        productos[6] = "CocaCola con Hojaldra";

        System.out.println("\nSe imprime sin ordenar uno por uno");

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println(productos[3]);
        System.out.println(productos[4]);
        System.out.println(productos[5]);
        System.out.println(productos[6]);

        System.out.println("\nSe imprime sin ordenar con ciclo for");

        for (int i = 0; i < total; i++) {
            System.out.println("Productos[" + (i + 1) +"] = " + productos[i]);
        }

        Arrays.sort(productos);

        System.out.println("\nSe imprime ordenado");

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println(productos[3]);
        System.out.println(productos[4]);
        System.out.println(productos[5]);
        System.out.println(productos[6]);

        System.out.println("\nSe imprime ordenado con ciclo foreach");

        for (String string : productos) {
            System.out.println("Productos = " + string);
        }

        System.out.println("\nSe imprime con ciclo while");

        int i = 0;

        while (i < total) {
            System.out.println("Producto " + (i+1) + " = " + productos[i]);
            i++;
        }

        System.out.println("\nSe imprime con el ciclo do while");

        int j = 0;

        do {
            System.out.println("Producto " + (j+1) + " = " + productos[j]);
            j++;
        } while (j < total);
      
    }
}
