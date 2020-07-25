package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int base, height, area;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        base = keyboard.nextInt();

        System.out.print("Ingrese la altura del rectangulo: ");
        height = keyboard.nextInt();

        area = base * height;

        System.out.println("El area del rectangulo es: " + area);
    }
}
