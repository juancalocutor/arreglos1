public class arreglos_1 {
    public static void main(String[] args) {
        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = 36;
        numeros[2] = Integer.valueOf("7");
        numeros[3] = 41;
        // numeros[4] = 5;

        System.out.print("\nSe imprime con la referencia\n");

        System.out.println("[0] = " + numeros[0]);
        System.out.println("[1] = " + numeros[1]);
        System.out.println("[2] = " + numeros[2]);
        System.out.println("[3] = " + numeros[3]);
        System.out.println("\n");

        System.out.print("Se imprime con una variable\n");

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[numeros.length - 2];
        int l = numeros[3];
        // int m = numeros[4];

        System.out.println("i es = " + i);
        System.out.println("j es = " + j);
        System.out.println("k es = " + k);
        System.out.println("l es = " + l);
    }
}
