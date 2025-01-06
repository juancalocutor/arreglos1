import java.util.Scanner;

public class arreglos_6_mayor_y_menor {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 números: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        s.close();

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = (a[max] > a[i])? max: i;
        }

        System.out.println("Número máximo es: " + a[max]);

        int min = 0;
        for (int i = 0; i < a.length; i++) {
            min = (a[min] < a[i]? min: i);
        }

        System.out.println("Número Mínimo es: " + a[min]);
    }
}
