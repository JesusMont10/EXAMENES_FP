
package examen2_25550690;

import java.util.Scanner;

public class Examen2_25550690 {
    
    public static void main(String[] args) {
      System.out.println("ELIGE UN NUMERO del 1 al 2");
      System.out.println("(1) PRIMO ");
      System.out.println("(2) NO PRIMO");
      Scanner input = new Scanner(System.in);
     int opc, opc2;
     opc2 = input.nextInt();
     System.out.println("ELIGE UN NUMERO ");
     opc = input.nextInt();
    
     if (opc2 == 1) {
     System.out.println("LOS NUMEROS PRIMOS DEL NUMERO QUE INGRESASTE");
     for (int i = 1; i < opc; i= i + 2){
     System.out.println("*"+ i +"*");
     }   }
    else if (opc2 == 2){
    System.out.println("LOS NUMERO NO PRIMOS DEL NUMERO QUE INGRESASTES");
    System.out.println("*1*");
        for (int j = 4; j < opc; j= j + 2){
     System.out.println("*"+ j +"*");
     }  }
    }
}
//JESUS MONTAÑEZ 25550690