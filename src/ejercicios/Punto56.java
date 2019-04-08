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
public class Punto56 {
    public void p56 () {
         int n ;
       int numeros[] =new int [5] ;
       int copia[]= new int [5] ;
        Scanner entrada =new Scanner(System.in);
        System.out.println("elija el numero a iniciar arreglo ");
        n=entrada.nextInt();
        for (int i=0;i<=4;i++) {
            numeros[i]=n;
            copia[i]=numeros [i];
            n=n+1;
        }
        System.out.println(numeros[2]);
    }
}
