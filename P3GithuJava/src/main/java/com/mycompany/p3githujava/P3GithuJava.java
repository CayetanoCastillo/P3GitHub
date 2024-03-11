/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3githujava;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class P3GithuJava {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1.Suma");
        System.out.println("Ingrese el 1 numero");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el 2 numero");
        int num2 = entrada.nextInt();
        int resultado;
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es : " + resultado);
        
        System.out.println("1.Resta");
        System.out.println("Ingrese el 1 numero");
        int num3 = entrada.nextInt();
        System.out.println("Ingrese el 2 numero");
        int num4 = entrada.nextInt();
        int resultado2;
        resultado2 = num3 - num4;
        System.out.println("El resultado de la resta es : " + resultado2);
    }
}
