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
public class Punto52 {
    public void p52 () {
        float n,c ;
    c=0;
        Scanner entrada = new Scanner(System.in) ;
    for (int i =1 ;i<=10 ;i++){
        System.out.println("digite numeros a sumar (solo los negativos se sumaran )");
        n=entrada.nextFloat();
        if (n<0)
            c=c+n ;
        
    }
        
    System.out.println("la suma es : "+c);
    }
}
