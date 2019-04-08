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
public class Punto88 {
    public void p88 () {
        int num1 , num2 , res;
        Scanner entrada = new Scanner(System.in);
        System.out.println("escriba el numero a potenciar ");
        num1=entrada.nextInt();
        System.out.println("escriba potencia ");
        num2= entrada.nextInt();
        res = potencia(num1,num2);
        System.out.println("la potencia es :"+res);
        
 
    }
    public static int potencia (int a , int b){
        int r ;
        r=a;
        for (int i=1;i<b;i++){
        r=r*a;
        }
        return r ;
    }
}
