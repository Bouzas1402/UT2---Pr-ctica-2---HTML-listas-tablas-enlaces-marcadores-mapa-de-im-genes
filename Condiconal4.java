package Sesion04;

import java.util.Scanner;

public class Condiconal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Importo el escanner y lo uso para pedir dos numero enteros en esta caso int*/
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Que operacion quiere realizar"); //Imprimo la instruccion para el usuario, le pregunto que
        var operacion = sc.next();   //operacion quiere realizar y le doi una salida para que meta la operacion que quiere realizar
        switch (operacion) {   //uso var porque me permite usar varios valores. Con switch voy repasando todos los valores posibles
            case "-":                // con los que quiero interactuar y le doy una instruccion por cada valor que quiero usar
                System.out.println("La resta da:" + (num1 - num2)); //
                break;
            case "+":
                System.out.println("La suma da:" + (num1 + num2));
                break;
                case "*":
                    System.out.println("La multiplación da:" + (num1 * num2));
                    break;
            case "/":
                System.out.println("La division da:" + (num1 / num2));
                        break;
            default:
                System.out.println("opreacion incorrecta");
            break;
        }
        }
    }
