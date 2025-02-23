import java.util.Scanner;

public class InvertirTexto {
    public static void main(String[] args) {
        Scanner jk = new Scanner (System.in);

        System.out.print("ingresar el texto a invertir:");
        String texto = jk.nextLine();

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);

        jk.close();

    }
}
