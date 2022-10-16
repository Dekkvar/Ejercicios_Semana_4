package com.ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        System.out.println("Seleccione una de las siguientes figuras: \n- Triángulo \n- Rectángulo \n- Pentágono \n- Hexágono");
        str = input.nextLine();

        String base = "";
        String altura = "";
        float area = 0;
        int baseInt = 0;
        int alturaInt= 0;

        switch (str.toLowerCase()) {
            case "triangulo":
            case "triángulo":
                System.out.println("Introduce la base del triángulo:");
                base = input.nextLine();
                System.out.println("Introduce la altura del triángulo:");
                altura = input.nextLine();
                baseInt = Integer.parseInt(base);
                alturaInt = Integer.parseInt((altura));
                area = (baseInt * alturaInt)/2;
                System.out.println("El área de tu triángulo es " + area);
                break;
            case "rectangulo":
            case "rectángulo":
                System.out.println("Introduce la base del rectángulo:");
                base = input.nextLine();
                System.out.println("Introduce la altura del rectángulo:");
                altura = input.nextLine();
                baseInt = Integer.parseInt(base);
                alturaInt = Integer.parseInt((altura));
                area = baseInt * alturaInt;
                System.out.println("El área de tu triángulo es " + area);
                break;
            case "pentágono":
            case "pentagono":
                System.out.println("Introduce el lado del pentágono:");
                base = input.nextLine();
                System.out.println("Introduce la apotema del pentágono:");
                altura = input.nextLine();
                baseInt = Integer.parseInt(base);
                alturaInt = Integer.parseInt((altura));
                area = ((baseInt * 5) * alturaInt)/2;
                System.out.println("El área de tu pentágono es " + area);
                break;
            case "hexágono":
            case "hexagono":
                System.out.println("Introduce el lado del hexágono:");
                base = input.nextLine();
                System.out.println("Introduce la apotema del hexágono:");
                altura = input.nextLine();
                baseInt = Integer.parseInt(base);
                alturaInt = Integer.parseInt((altura));
                area = ((baseInt * 6) * alturaInt)/2;
                System.out.println("El área de tu hexágono es " + area);
                break;
            default:
                System.out.println("Eso no es una figura seleccionable.");
        }
    }
}
