import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Programa que suma 2 numeros dados");
        // defino las variables
        int firstNumber;
        int secondNumber;
        int result;

        // habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        // leo los datos del usuario
        System.out.print("Ingrese el primer numero para el calculo: ");
        firstNumber = keyboard.nextInt();

        System.out.print("Ingrese el segundo numero para el calculo: ");
        secondNumber = keyboard.nextInt();

        // realizo el proceso y lo guardo en la variable result
        result = firstNumber + secondNumber;

        // muestro el resultado por pantalla
        System.out.println("El resultado es: " + result);
    }
}
