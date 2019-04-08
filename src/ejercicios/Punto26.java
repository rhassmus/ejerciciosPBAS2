
package ejercicios;

import java.util.Scanner;

public class Punto26 {
    public  void p26 () {
        float n,n1;
        Scanner entrada=new Scanner(System.in) ;
        System.out.println("Ingrese un numero para verificar si es par o impar");
        n=entrada.nextFloat() ;
        n1=n%2;
        if (n1>0)
            System.out.println("El numero ingresado es Impar");
        else 
            System.out.println("El numero ingresado es par");
    }
}
