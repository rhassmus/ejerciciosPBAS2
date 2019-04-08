/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Andres
 */
public class Punto72 {
    public void p72 () {
        int arreglo[]=new int [7];
           int c ;
           c=0;
           
           for (int i=3 ; i<=100 ;i++){
               int n=2 ;
           boolean pri = true ;
               while(pri && n!=i ){
            if(i%n==0){
                pri=false;
            }
            n=n+1;
               }
               if (pri){
               arreglo[c]=i ;
                   System.out.println(arreglo[c]+"es primo");
               }
           }   
    }
}
