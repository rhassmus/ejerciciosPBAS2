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
public class Punto32 {
    public void p32 () {
        int hor ,min , seg ;
       Scanner entrada = new Scanner(System.in) ;
       System.out.println("digite hora , min y segundo");
       System.out.println("hora: ");
       hor=entrada.nextInt();
       System.out.println("minutos");
       min=entrada.nextInt();
       System.out.println("segundos");
       seg=entrada.nextInt();
       if (hor<=23 && min<=59 && seg<=59) {
        seg=seg+1 ;
        if (seg==60 ){
            seg=0;
            min=min+1 ;}
        if (min==60) {
            min=0;
            hor=hor+1 ;
        }
        if(hor==24){
        hor=0;
        }
        System.out.println("la hora es : "+hor+":"+min+":"+seg);
       }
       else
            System.out.println("la hora ingresada es invalida");
    }
}
