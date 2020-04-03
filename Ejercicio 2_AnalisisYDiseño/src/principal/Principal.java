/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Principal {
     public static void main(String args[]) {
         try{
             int a , b, x ;
            Scanner lector = new Scanner(System.in);
             System.out.println("Ingrese el primer digito: ");
             a=lector.nextInt();
             System.out.println("Ingrese el segundo digito: ");
             b=lector.nextInt();
             x=a+b;
             System.out.println("X"+" "+"="+" "+x);
             
         }catch(InputMismatchException ab){
             System.out.println("Presentation Error");
             
         }
     }
}
