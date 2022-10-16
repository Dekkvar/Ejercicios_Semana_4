package com.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        System.out.println("Introduce una frase:");
        str = input.nextLine();
        int largo = str.length();

        if (largo % 2 == 0) {
            System.out.println("La frase mide " + largo + " caracteres, que es un número par.");
        } else {
            System.out.println("La frase mide " + largo + " caracteres, que es un número impar.");
        }
    }
}
