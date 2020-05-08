/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_menor_iterativo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Busqueda_menor_iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int aux ;
          int vector[],tamaño;
         System.out.println("ingresa el tamaño del vector: ");
         tamaño = Integer.parseInt(lector.next());
         vector= new int[tamaño];
         for (int i = 0; i <tamaño ; i++) {
             System.out.println("v ["+ i + "] = ");
             vector[i] = Integer.parseInt(lector.next());          
    }
            for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
            }
      System.out.println("El numero menor es: "+ vector[0]);
}
}
