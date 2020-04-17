/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_elementos_vector_iterativo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Suma_elementos_vector_iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a[] , suma = 0;
        System.out.println("Digite el tamaño del vector: ");
        int b = lector.nextInt();
        a= new int[b];
        for (int i = 0; i <b ; i++) {
             System.out.println("v ["+ i + "] = ");
             a[i] = Integer.parseInt(lector.next());
         }
        for (int i = 0; i < b; i++) {
            suma= suma + a[i];      
        }
        System.out.println("El resultado de la suma es: " + suma);
       
    }
    
}
