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
public class Punto28 {
    public void p28 () {
        int n ;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("escriba el dia de la semana del 1 al 7");
        n=entrada.nextInt() ;
        switch (n) {
           case 1: 
                System.out.println("lunes");
           break ;
           case 2: 
                System.out.println("martes");
            break ;
            case 3: 
                System.out.println("miercoles");
            break ;
            case 4: 
                System.out.println("jueves");
            break ;
            case 5: 
                System.out.println("viernes");
            break ;
            case 6: 
                System.out.println("sabado");
            break ;
            case 7: 
                System.out.println("domingo");
            break ;
            default :
                System.out.println("dia invalido ");
            break ;
        }
    }
}
