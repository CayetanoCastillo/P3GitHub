/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Nuevafuncionalidad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("3.Multiplicacion");
        System.out.println("Ingrese el 1 numero");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el 2 numero");
        int num2 = entrada.nextInt();
        int resultado;
        resultado = num1 * num2;
        System.out.println( "El resultado de la multiplicacion es : " + resultado);

        System.out.println("4.Division");
        System.out.println("Ingrese el 1 numero");
        int num3 = entrada.nextInt();
        System.out.println("Ingrese el 2 numero");
        int num4 = entrada.nextInt();
        int resultado2;
        resultado2 = num3 / num4;
        System.out.println("El resultado de la division es : " + resultado2);
    }

}
