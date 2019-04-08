/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

public class Punto8 {
    public void p8 () {
        int bas,alt,are ;
       Scanner entrada=new Scanner(System.in);
        System.out.println("digite la base del triangulo :");
      bas=entrada.nextInt();
        System.out.println("digite la altura del triangulo :");
        alt=entrada.nextInt();
       are=(bas*alt)/2 ;
         System.out.println("el area del triangulo es = "+are);
    }
    
}
