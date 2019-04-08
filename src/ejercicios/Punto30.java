
package ejercicios;

import java.util.Scanner;

public class Punto30 {
    public void p30 (){
        float a,b,c;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("Ingrese el primer numero a comparar");
        a=entrada.nextFloat();
        System.out.println("Ingrese el segundo numero a comparar");
        b=entrada.nextFloat();
        c=0;
        if(a>b)
            System.out.println("Se intercambian Valores, Entonces  a=" + b +" y b=" + a);
        else
            System.out.println("Se dejan igual los numeros, Entonces a=" + a +" y b=" + b );
    }
}
