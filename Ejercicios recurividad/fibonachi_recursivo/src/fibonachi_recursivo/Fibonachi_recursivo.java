/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi_recursivo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Fibonachi_recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Digite el numero: ");
        int a = lector.nextInt();
        System.out.println("El resultado de la serie fibonachi es : " + fibo(a));
    }

  static int fibo(int a) {
      int resultado = 0 ;
      if(a < 2 ){
          resultado = a ;

          }else{
              resultado = fibo(a-1)+fibo(a-2);
              
          }         
      return resultado;
    }
    
}
