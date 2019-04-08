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
public class Punto20 {
    public void p20 () {
        double m,p ;
        Scanner entrada  = new Scanner(System.in) ;
        System.out.println("digite el numero de metros a convertir a pies ");
        m=entrada.nextFloat() ;
        p=m*(3.2808) ;
        System.out.println("los "+ m + " metros equivalen a "+p+" pies");
    }
}
