
package ejercicios;

import java.util.Scanner;

public class Punto22 {
    public void p22  (){
        int a,b,r,re;
        Scanner entrada  = new Scanner(System.in) ;
        System.out.println("Se ejecutara una division entre dos numeros y");
        System.out.println("se mostrara el resultado como su residuo");
        System.out.println("________________________________________________");
        System.out.println("Ingrese el numero a dividir");
        a=entrada.nextInt() ;
        System.out.println("Ingrese el numero divisor");
        b=entrada.nextInt() ;
        r=a/b;
        re=a%b;
        System.out.println("______________________________");
        System.out.println("El resultado es= " + r);
        System.out.println("El residuo es = " + re);
    }
}
