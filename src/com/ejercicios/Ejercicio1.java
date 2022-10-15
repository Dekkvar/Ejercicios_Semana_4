package com.ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        System.out.println("Introduce un número:");
        str = input.nextLine();
        int num = Integer.parseInt(str);

        if (num < 10) {
            System.out.println("El número es MENOR que 10");
        } else if (num > 10) {
            System.out.println("El número es MAYOR que 10");
        } else {
            System.out.println("El número es 10");
        }
    }
}
