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
        System.out.println("Digite el valor: ");
        int a = lector.nextInt();
        int b[] = new int[a];
        int c = 0;
        for (int i = 0; i < a; i++) {
            b[i] = lector.nextInt();
        }
        if (a > 2) {
            for (int i = 2; i < a; i++) {
                if ((b[i - 2] > b[i - 1] && b[i - 1] < b[i]) || (b[i - 2] < b[i - 1] && b[i - 1] > b[i])) {
                    c = 1;
                } else {
                    c = 0;
                    break;
                }
            }
        } else {
            if (b[0] != b[1]) {
                c = 1;
            }
        }
        System.out.println("La respuesta es: " + c);
    }
}
