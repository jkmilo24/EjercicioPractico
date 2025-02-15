import java.util.Scanner;

public class conteoVocales {
    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner jk = new Scanner(System.in);

        // Solicitar al usuario que ingrese una palabra
        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = jk.nextLine().toLowerCase();

        // contadores para vocales y consonantes
        int vocales = 0;
        int consonantes = 0;

        // Recorrer cada letra de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Verificar si la letra es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
            // Verificar si la letra es una consonante
            else if ((letra >= 'a' && letra <= 'z')) {
                consonantes++;
            }
        }

        // Mostrar los resultados
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        jk.close();
    }
}