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
public class Punto76 {
    public void p76 () {
        String original ;
        String blancos ;
        Scanner entrada =new Scanner(System.in);
        System.out.println("escriba la cadena de caracteres");
       original=entrada.next();
       blancos=original ;
           blancos=blancos.replace(" ","") ;
           System.out.println(blancos);
    }
}
