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
            System.out.println("Valor de a[" + (i + 1) + "] = " + a[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < b.length; i++) {
            System.out.println("Valor de b[" + (i + 1) + "] = " + b[i]);
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

        //Si queremos que el nuevo arreglo lleve de a dos o tres elementos de los arreglos

        int aux2 = 0;
        for (int i = 0; i < a.length; i+=2) {
            for (int j = 0; j < 2; j++) {
                c[aux2++] = a[i + j];
            }
            for (int j = 0; j < 2; j++) {
                c[aux2++] = b[i + j];
            }
        }

        System.out.println("\n");

        for (int i = 0; i < c.length; i++) {
            System.out.println("Valor doble de c[" + (i + 1) + "] = " + c[i]);
        }
    }
}