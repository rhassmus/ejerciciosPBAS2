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
public class Punto44 {
    public void p44 () {
        int n , c , f;
        c=1;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("digite numero a calcular factorial ");
        n=entrada.nextInt() ;
        while (n!=0){
        c=c*n;
        n=n-1;
        
        }
         System.out.println("el factorial es = "+c);   
    }
}
