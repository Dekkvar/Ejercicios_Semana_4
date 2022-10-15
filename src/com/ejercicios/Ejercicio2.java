package com.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        System.out.println("Introduce una palabra:");
        str = input.nextLine();

        if (str.contains("b") | str.contains("B")) {
            System.out.println("La palabra " + str + " contiene la letra b");
        } else {
            System.out.println("La palabra " + str + " NO contiene la letra b");
        }
    }
}
