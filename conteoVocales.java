import java.util.Scanner;

public class conteoVocales {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = jk.nextLine().toLowerCase();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
            else if ((letra >= 'a' && letra <= 'z')) {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        jk.close();
    }
}
