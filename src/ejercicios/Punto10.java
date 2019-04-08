package ejercicios;

import java.util.Scanner;

public class Punto10 {
    public void p10 (){
        float x,t,v;
        Scanner entrada=new Scanner(System.in) ;
        System.out.println("Para Calcular la velocidad de un proyectil");
        System.out.println("debe introducir la distancia recorrida en km");
        System.out.println("y el tiempo en Minutos");
        System.out.println("________________________");
        System.out.println("Introduzca la distancia (kilometros):");
        x = entrada.nextFloat ();
        System.out.println("Introduzca el tiempo (minutos) :");
        t = entrada.nextFloat ();
        v = x/t;
        v=v*1000;
        v=v/60;
        System.out.println("________________________");
        System.out.println("La velocidad del proyectil es de =  " + v + " m/s");
    }
}
