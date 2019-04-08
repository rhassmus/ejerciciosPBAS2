/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

public class Punto16 {
    public void p16 () {
        float co,ca ;
        double h ;
        Scanner entrada =new Scanner(System.in) ;
        System.out.println("para hallar la hipotenusa de un triangulo rectangulo digite");
        System.out.println("cateto opuesto :");
        co=entrada.nextFloat() ;
        System.out.println("cateto adyacente :");
        ca=entrada.nextFloat();
        h=Math.sqrt((co*co)+(ca*ca)) ;
        System.out.println("la hipotenusa es = "+ h );
    }
}
