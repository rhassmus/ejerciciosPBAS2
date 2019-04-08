/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

public class Punto42 {
    public void p42 () {
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("Sume los numeros hasta el numero ingresado");
        int s,n;
        System.out.println("Ingrese el numero");
        n=entrada.nextInt();
        s=0;
        for (int i=1;i<=n;i++){
            s=s+i;
        }
        System.out.println("La suma es= " + s );
    }
}
