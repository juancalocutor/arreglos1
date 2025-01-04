public class arreglos_4_burbuja_mejorado {
    public static void main(String[] args) {

        String[] menusCocaCola = { "CocaCola con Pan", "CocaCola con Roscón", "CocaCola con Empanada",
                "CocaCola con Chorizo", "CocaCola con Arepa", "CocaCola con Papa", "CocaCola con Hojaldra",
                "CocaCola con Pandebono", "CocaCola con Pandearroz"};

        int largo = menusCocaCola.length;
        int contador = 0;

        for (int i = 0; i < largo; i++) {
            System.out.println("Menu [" + (i + 1) + "] = " + menusCocaCola[i]);
        }

        for (int i = 0; i < largo - 1; i++) {
            for (int j = 0; j < largo - 1 - i; j++) {
                if (menusCocaCola[j + 1].compareTo(menusCocaCola[j]) < 0) {
                    String auxiliar = menusCocaCola[j];
                    menusCocaCola[j] = menusCocaCola[j + 1];
                    menusCocaCola[j + 1] = auxiliar;
                }

                contador++;
            }
        }

        System.out.println(contador);

        for (int i = 0; i < largo; i++) {
            System.out.println("Menu [" + (i + 1) + "] " + " = " + menusCocaCola[i]);
        }

        //Para comparar números int primitivo se hace un unboxing a integer.

        int[] numeros = {345, 876, 98, -56, 687, -369, 875, 125};

        int totalNum = numeros.length;
        int contador2 = 0;

        for (int i = 0; i < totalNum - 1; i++) {
            for (int j = 0; j < totalNum - 1 - i; j++) {
                if (((Integer) numeros[j + 1]).compareTo(numeros[j]) < 0) {
                    int aux = numeros[j];
                    numeros[j] = numeros [j + 1];
                    numeros[j + 1] = aux;
                }

                contador2++;
            }
        }

        System.out.println(contador2);

        for (int j = 0; j < totalNum; j++) {
            System.out.println("Número[" + (j + 1) + "] = " + numeros[j]);
        }

        //Para ordenar burbuja una instancia Integer

        Integer[] num2 = {54, -98, 98, 12, -96, -456, 324, 76, 657};
        int contador3 = 0;

        for (int i = 0; i < num2.length - 1; i++) {
            for (int j = 0; j < num2.length -1 -i; j++) {
                if(num2[j + 1].compareTo(num2[j]) < 0) {
                    Integer aux2 = num2[j];
                    num2[j] = num2[j + 1];
                    num2[j + 1] = aux2;
                }
                contador3++;
            }
        }

        System.out.println(contador3);

        for (int i = 0; i < num2.length; i++) {
            System.out.println("Num2[" + (i + 1) + "] = " + num2[i]);
        }
    }

}
