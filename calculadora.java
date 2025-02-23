import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner jc = new Scanner(System.in);

        System.out.println("Operacion a realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
      
        System.out.print("Seleccione una operación (1/2/3/4): ");
        int operacion = jc.nextInt();
      
        System.out.print("Ingrese el primer número: ");
        int num1 = jc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = jc.nextInt();
    
        int resultado;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                // Verificar si el segundo número es cero para evitar la división por cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida. Por favor, elija una opción entre 1 y 4.");
        }

        jc.close();
    }
}
