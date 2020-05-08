/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_recursivo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Factorial_recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Digite el numero: ");
        int a = lector.nextInt();
        System.out.println("el resultado del numero factorial es: "+factorial(a));
    }

    static int  factorial(int a) {
       int resultado = 0 ;
        if(a==0 || a == 1){
            a = 1 ;
           resultado = 1 ;
        }else{
          resultado = a * factorial(a-1);  
        }
        return resultado;
    }
    
}
