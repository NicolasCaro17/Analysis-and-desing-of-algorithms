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
        System.out.println("Digite el primer valor: ");
        int a = lector.nextInt();
        System.out.println("Digite el segundo valor: ");
        int b = lector.nextInt();
        int q, r;
        if (a >= 0) {
            q = a / b;
            r = a % b;
        } else {
            int x = 0, y = 0;
            if (b < 0) {
                x = b * -1;
            } else {
                x = b;
            }
            for (r = 0; r < x; r++) {
                y = a - r;
                if (y % b == 0) {
                    break;
                }
            }
            q = y / b;
        }
        System.out.println("La respuesta es: "+q + " " + r);
    }
}

