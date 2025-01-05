public class arreglos_5_combinar_2_a_un_tercero {

    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 4;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Valor de a[" + i + "] = " + a[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < b.length; i++) {
            System.out.println("Valor de b[" + i + "] = " + b[i]);
        }

        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        System.out.println("\n");

        for (int i = 0; i < c.length; i++) {
            System.out.println("Valor de c[" + (i + 1) + "] = " + c[i]);
        }
    }
}