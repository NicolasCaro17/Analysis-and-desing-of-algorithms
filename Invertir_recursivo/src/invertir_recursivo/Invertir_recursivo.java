/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertir_recursivo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Invertir_recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el numero a invertir: ");
        int a = lector.nextInt();
        int cifras = String.valueOf(a).length();
        System.out.println("El numero invertido es : " + invertir(a,cifras));
    }

     static int invertir(int a, int pos) {
         int resultado = 0 ;
     if(a<10){
         resultado = a ;
     }else{
         resultado = a%10 *(int)Math.pow(10, pos) + invertir(a/10, pos-1);
     }
     return resultado;
    }
    
}
