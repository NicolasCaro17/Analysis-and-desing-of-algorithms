/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertir_iterativo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Invertir_iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int numero;
   int invertido = 0;
   int resto;
   Scanner lector = new Scanner (System.in);
        System.out.println("Digite el numero a invertir: ");
        numero = lector.nextInt();
        while(numero>0){
             resto = numero%10;
             invertido = invertido * 10 + resto;
            numero/=10;
        }
        System.out.println("El numero invertido es: "+ invertido);
   
    }

}
