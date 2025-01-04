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
    }

}
