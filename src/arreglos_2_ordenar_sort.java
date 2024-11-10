import java.util.Arrays;

public class arreglos_2_ordenar_sort {
    public static void main(String[] args) {
        String[] productos = new String[7];

        productos[0] = "CocaCola con Pan";
        productos[1] = "CocaCola con Roscón";
        productos[2] = "CocaCola con Empanada";
        productos[3] = "CocaCola con Chorizo";
        productos[4] = "CocaCola con Arepa";
        productos[5] = "CocaCola con Papa";
        productos[6] = "CocaCola con Hojaldra";

        System.out.println("\nSe imprime sin ordenar");

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println(productos[3]);
        System.out.println(productos[4]);
        System.out.println(productos[5]);
        System.out.println(productos[6]);

        Arrays.sort(productos);

        System.out.println("\nSe imprime ordenado");

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println(productos[3]);
        System.out.println(productos[4]);
        System.out.println(productos[5]);
        System.out.println(productos[6]);



        
    }
}
