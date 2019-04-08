
package ejercicios;

import java.util.Scanner;

public class Punto46 {
    public void p46 () {
        float x,s,m,n;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("Calcular la Media de una cantidad de numeros");
        System.out.println("Ingrese la totalidad de numeros a hallarle la media");
        x=entrada.nextFloat();
        System.out.println("______________________________________________________");
        s=0;
        for (int i=1;i<=x;i++){
            System.out.println("Ingrese el " + i + " numero");
            n=entrada.nextFloat();
            System.out.println("___________________________________");
            s=s+n;
        }
        m=s/x;
        System.out.println("La media de los numeros ingresados es=" + m);   
}
}
