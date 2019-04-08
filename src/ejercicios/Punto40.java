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
public class Punto40 {
    public void p40 () {
         String r;
        boolean v =false ;
        Scanner entrada = new Scanner(System.in) ;
       while(v==false){
           System.out.println("¿Desea continuar S/N?");
           r=entrada.next() ;
           if (r!="n")
               v=true ;
           else 
               v=false ;         
        }
    }
}
