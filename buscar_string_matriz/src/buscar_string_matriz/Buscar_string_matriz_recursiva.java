/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscar_string_matriz;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Buscar_string_matriz_recursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
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
        System.out.println("Elemento a buscar: ");
        String b = lector.next();

        if(buscar(a, b, 2, 2, 0, 0)== true){
            System.out.println("El elemento buscado se encuentra en la matriz");
        }else{
            System.out.println("El elemento buscado no se encuentra en la matriz");
        }
            
    }
    public static boolean buscar(String[][] matriz, String buscar, int fila, int columna, int inicio1, int inicio2) {
        boolean validar = false;
        if (inicio1 <= fila-1 && inicio2 <= columna-1) {
            if (buscar.equalsIgnoreCase(matriz[inicio1][inicio2])) {
                inicio1 = fila;
                inicio2 = columna;
                validar = true;
            } else {
                if (validar == false) {
                    if (inicio2 < columna-1) {
                        inicio2++;
                        validar = buscar(matriz, buscar, fila, columna, inicio1, inicio2);
                    } else {
                        inicio1++;
                        inicio2 = 0;
                        validar = buscar(matriz, buscar, fila, columna, inicio1, inicio2);
                    }
                }
            }
        }
        return validar;
    }
    
}
