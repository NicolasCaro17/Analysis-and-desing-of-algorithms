/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo_recursivo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Palindromo_recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese palabra: ");
        String a = lector.next();

        if(palindromo(a)){
            System.out.println("La palabra es palidroma");
        }else{
            System.out.println("La palabra no es palindroma");
        }
 
    }
      public static boolean palindromo(String a) {
        if (a.length() <= 1) {
            return true;
        } else {
            if (a.charAt(0) == a.charAt(a.length() - 1)) {
                return palindromo(a.substring(1, a.length() - 1));
            } else {
                return false;
            }
        }
      }
}
