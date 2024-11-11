import java.util.Arrays;
import java.util.Collections;

public class arreglos_3_ordenar_inverso{
    public static void main(String[] args) {
        String[] productos = new String[7];

        int total = productos.length;
        int total2 = productos.length;

        productos[0] = "CocaCola con Pan";
        productos[1] = "CocaCola con Roscón";
        productos[2] = "CocaCola con Empanada";
        productos[3] = "CocaCola con Chorizo";
        productos[4] = "CocaCola con Arepa";
        productos[5] = "CocaCola con Papa";
        productos[6] = "CocaCola con Hojaldra";

        System.out.println("\nSe imprime uno a uno");

        for (int i = 0; i < total; i++) {
            System.out.println("Producto " + (i+1) + " = " + productos[i]);
        }

        Arrays.sort(productos);

        System.out.println("\nSe imprime ordenado");

        for (int i = 0; i < total; i++) {
            System.out.println("Producto [" + (i + 1) + "] = " + productos[i]);
        }

        System.out.println("\nSe imprime ordenado inverso");

        for (int i = total-1; i >= 0; i--) {
            System.out.println("Producto " + (i + 1) + " = " + productos[i]);
        }

        System.out.println("\nSe imprime ordenado inverso mismo número");

        for (int i = 0; i < total2; i++) {
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
            total2--;
        }

        for (int i = 0; i < total; i++) {
            System.out.println("Producto [" + (i + 1) + "] = " + productos[i]);
        }

        // Otra forma de hacer reversa con el mismo número es con la API de JAVA
        // En el ejemplo siguiente se reordena en ascendente porque an el anterior ya se hizo en reversa

        Collections.reverse(Arrays.asList(productos));

        for (int i = 0; i < total; i++) {
            System.out.println("Producto [" + (i + 1) + "] = " + productos[i]);
        }

    }
}
