/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

          int vector[],tamaño;
         System.out.println("ingresa el tamaño del vector: ");
         tamaño = Integer.parseInt(lector.next());
         vector= new int[tamaño];
         for (int i = 0; i <tamaño ; i++) {
             System.out.println("v ["+ i + "] = ");
             vector[i] = Integer.parseInt(lector.next());
         }
         System.out.println("el menor es :  " + vector(vector,tamaño-1));
      
    }
        static int vector(int vector[], int tamaño) {
        if (tamaño == 0) {
            return vector[0];

        } else {

            if (vector[tamaño] < vector(vector, tamaño - 1)) {
                return vector[tamaño];
            } else {
                return vector(vector, tamaño - 1);
            }
        }
    }

}


