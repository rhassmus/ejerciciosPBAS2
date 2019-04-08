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
public class Punto12 {
    public void p12 () {
        float a,b,c,res ;
        Scanner entrada=new Scanner(System.in) ;
        System.out.println("para evaluar la exprecion : (a+7*c)/(b+2-a)+2*b ");
        System.out.println("digite el valor de a");
        a=entrada.nextFloat() ;
        System.out.println("digite el valor de b ");
        b=entrada.nextFloat();
        System.out.println("escriba el valor de c ");
        c=entrada.nextFloat() ;
        res =(a+7*c)/(b+2-a)+2*b;
        System.out.println("la respuesta es : "+ res);
    }
}
