
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {

        if (Character.isDigit(caracter)) {
            return "El carácter ingresado es un número.";
        }

        else if (Character.isLetter(caracter)) {

            if (Character.isUpperCase(caracter)) {
                return "El carácter ingresado es una letra mayúscula.";
            } else {
                return "El carácter ingresado es una letra minúscula.";
            }
        }

        else {
            return "El carácter ingresado no es una letra ni un número.";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}