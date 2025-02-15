import java.util.Scanner;

public class InvertirTexto {
    public static void main(String[] args) {
        Scanner jk = new Scanner (System.in);

        // aca se solicita al usuario ingresar el texto de cadena

        System.out.print("ingresar el texto a invertir:");
        String texto = jk.nextLine();

        // variable para almacenar el texto a invertir
        String textoInvertido = "";

        // Recorrer la cadena desde el final hasta el principio y agregar cada letra a la nueva cadena
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);

        jk.close();

    }
}