
package ejercicios;



public class Punto50 {
    public void p50 () {
        System.out.println("Media de los numeros pares e impares de 1 a 200");
        int sp,si;
        float mp,mi;
        sp=0;
        si=0;
        for (int i=1;i<=200;i++){
            if(i%2==0){
                sp=sp+i;
            }
            else{
                si=si+i;
            }
        }
        mp=sp/100;
        mi=si/100;
        System.out.println("Para los Pares su sumatoria es= " + sp + " y su media es= " + mp );
        System.out.println("Para los Impares su sumatoria es= " + si + " y su media es= " + mi );
    }
}
