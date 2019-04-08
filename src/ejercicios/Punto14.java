/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;


public class Punto14 {
    public void p14 (){
        float a,b,c;
        double r,r1,r2;
        Scanner entrada=new Scanner(System.in) ;
        System.out.println("Para Evaluar la expresion ( -b + raiz cuadrada(b^2 -4*a*c)/(2*a)) ");
        System.out.println("Digite el valor de a");
        a=entrada.nextFloat();
        System.out.println("Digite el valor de b ");
        b=entrada.nextFloat();
        System.out.println("Digite el valor de c ");
        c=entrada.nextFloat() ;
        r=((b*b)-4*a*c);
        r1=Math.sqrt(r);
        r2=((-1*(b))+r1)/(2*a);
        System.out.println("_________________________________");
        System.out.println("La respuesta es= " + r2);
    }
    
}
