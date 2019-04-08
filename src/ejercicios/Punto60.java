/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Andres
 */
public class Punto60 {
    public void p60 () {
        int num[] =new int[7];
   int may ;
   may=0;
   num[0]=23;
   num[1]=45;
   num[2]=68; 
   num[3]=99;
   num[4]=10;
   num[5]=15;
   num[6]=4;
   for (int i =1;i<=6;i++){
       if (num[i]>may) {
       may =num[i] ;}
       }
        System.out.println("el mayor es :"+may);
    }
}
