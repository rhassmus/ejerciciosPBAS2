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
public class Punto64 {
    public void p64 () {
        int matriz [][]=new int [3] [3];
        int may ;
        may=0;
        matriz[0][0]=32;
        matriz[0][1]=56;
        matriz[0][2]=50;
        matriz[1][0]=49;
        matriz[1][1]=99;
        matriz[1][2]=12;
        matriz[2][0]=78;
        matriz[2][1]=57;
        matriz[2][2]=89;
        for (int i=0 ;i<=2;i++){
            for (int j=0;j<=2;j++)
              if (matriz[i][j]>may){
              may =matriz[i][j] ;
              }
        }
        System.out.println("el mayor es :"+may);
    }
}
