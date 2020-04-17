/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscar_string_matriz_iterativo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Buscar_string_matriz_iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
        boolean opc = false;
        int f , c ;
        System.out.println("Digite el tamaño de la fila: ");
        f = lector.nextInt();
        System.out.println("Digite el tamaño de la columna ");
        c = lector.nextInt();
        String[][] a = new String[f][c];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                a[i][j] = lector.next();
            }
        }
        System.out.println("Digite el valor a buscar: ");
        String palbra = lector.next();
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(palbra.equalsIgnoreCase(a[i][j] )){
                    opc = true;
                }
             
            }
        }
         if(opc==true){
             System.out.println("El elemento buscado esta dentro de la matriz");
         }else{
             System.out.println("El elemento buscado no se encuentra dentro de la matriz");
         }
         
    }
    
}
