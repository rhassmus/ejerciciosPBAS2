
package ejercicios;


public class Punto54 {
    public void p54 () {
        
        System.out.println("Arreglo lleno de los numeros pares 1 a 100");
        int numeros[] =new int [50] ;
        
        for (int i=1;i<=100;i++) {
            
            if(i%2==0){
                numeros[i-1]=i;
            }
        }
        System.out.println(numeros[50]);
    }
}
