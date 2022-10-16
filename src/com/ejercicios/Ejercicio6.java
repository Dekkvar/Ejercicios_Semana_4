package com.ejercicios;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        System.out.println("Introduce una número:");
        str = input.nextLine();
        int num = Integer.parseInt(str);

        int par = num % 2;

        if (par == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
    }
}
