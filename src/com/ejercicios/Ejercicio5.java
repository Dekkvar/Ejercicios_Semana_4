package com.ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        System.out.println("Introduce una frase:");
        str = input.nextLine();

        if (str.contains("b") && str.contains("v")) {
            if (str.contains("p") && str.contains("u")) {
                System.out.println("La frase contiene una b y una v, y además contiene una p y una u.");
            } else if (str.contains("p")) {
                System.out.println("La frase contiene una b y una v, y además contiene una p, pero no contiene una u.");
            } else if (str.contains("u")) {
                System.out.println("La frase contiene una b y una v, y además no contiene una p, pero sí contiene una u.");
            } else {
                System.out.println("La frase contiene una b y una v, pero no contiene ni una p y ni una u.");
            }
        } else if (str.contains("b")) {
            if (str.contains("p")) {
                System.out.println("La frase contiene una b y una p");
            } else {
                System.out.println("La frase contiene una b, pero no contiene ni una p");
            }
        } else if (str.contains("v")) {
            if (str.contains("u")) {
                System.out.println("La frase contiene una v y una u");
            } else {
                System.out.println("La frase contiene una v, pero no contiene ni una u");
            }
        } else {
            System.out.println("La frase no contiene ni la letra b ni la letra v");
        }
    }
}
