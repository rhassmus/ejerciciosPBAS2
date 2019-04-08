/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
/**
 *
 * @author Andres
 */
public class Punto24 {
    public void p24 () {
        float n ;
        Scanner entrada=new Scanner(System.in) ;
        System.out.println("digite un numero a comparar si es positivo o negativo ");
        n=entrada.nextFloat() ;
        if (n<0)
            System.out.println("el numero es negativo"); 
        else
            if (n>0)
                System.out.println("el numero es positivo");
            else
                System.out.println("el numero es 0");
    }
}
