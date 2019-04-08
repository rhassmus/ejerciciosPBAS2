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
public class Punto48 {
    public void p48 () {
        int c, n ;
        boolean pri=true ;
        c=2 ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite numero a mirar si es primo");
        n=entrada.nextInt();
        while(pri && c!=n ){
            if(n%c==0)
                pri=false;
            c=c+1;
            
      
        }
          if (pri)
                System.out.println("el numero es primo ");
            
            else
            
                System.out.println("el numero no es primo ");
    }
}
