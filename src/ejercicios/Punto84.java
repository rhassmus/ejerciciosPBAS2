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
public class Punto84 {
    public void p84 () {
        String cad1 ;
    String cad2 ;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("escriba cadenas a comparar");
        cad1=entrada.next();
        cad2=entrada.next() ;
        if (cad1==cad2) {
        System.out.println("son iguales ");}
        else {
        System.out.println("no son iguales ");}
    }
}
