/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi_iterativo;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Fibonachi_iterativo {
    public static int fibonacciIterativo(int n) {
        int fibo = 0, a = 1, b, i = 1;
        do {
            b = fibo;
            fibo = a + fibo;
            a = b;
            i++;
        } while (i <= n);
        return fibo;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el tamaño para la serie fibonacci: ");
        int n = lector.nextInt();       
        System.out.println("La serie fibonachi es: "+fibonacciIterativo(n));
    }
    }
    

