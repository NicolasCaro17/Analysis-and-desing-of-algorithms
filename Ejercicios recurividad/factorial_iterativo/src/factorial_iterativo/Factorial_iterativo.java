/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_iterativo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Factorial_iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        System.out.println("Digite el numero: ");
        int a = lector.nextInt();
        factorial(a);
    }

    public static void factorial(int a) {
        int contador = 1;
        if(a==0 || a == 1){
            a = 1 ;
            System.out.println("El factorial del numero digitado es: "+ a);
        }else{
            for (int i = 1; i <= a; i++) {
                contador = contador * i ;
            }
            System.out.println("El factorial del numero digitado es: " + contador);
        }
    }
    
}
