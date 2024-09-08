package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {

        double imc = peso / (estatura * estatura);
        String condicionRiesgo;

        if (edad < 45) {
            if (imc < 22.0) {
                condicionRiesgo = "Bajo";
            } else {
                condicionRiesgo = "Medio";
            }
        } else {
            if (imc < 22.0) {
                condicionRiesgo = "Medio";
            } else {
                condicionRiesgo = "Alto";
            }
        }

        return "Su IMC es: " + String.format(imc) + " y su condición de riesgo es: " + condicionRiesgo;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();

        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}