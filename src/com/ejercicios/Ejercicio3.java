package com.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        System.out.println("Seleccione un producto escribiendolo a continuación: \n- Leche \n- Cacao \n- Avellanas \n- Azucar");
        str = input.nextLine();

        switch (str.toLowerCase()) {
            case "leche":
                System.out.println("El precio de la leche es de 2.00€");
                break;
            case "cacao":
                System.out.println("El precio del cacao es de 1.00€");
                break;
            case "avellanas":
                System.out.println("El precio de las avellanas es de 1.50€");
                break;
            case "azucar":
                System.out.println("El precio del azucar es de 0.50€");
                break;
            default:
                System.out.println("Ese no es un producto de la lista");
        }
    }
}
