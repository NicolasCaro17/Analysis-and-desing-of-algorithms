/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
//Internship
public class Principal {
    public static void main(String[] args) {
        System.out.println("Digite los valores: ");
        Scanner lector = new Scanner(System.in);
        DecimalFormat e = new DecimalFormat("0.0000");
        int a;
        while (lector.hasNext()) {
            a = lector.nextInt();
            double b = 0;
            double c = 0;
            for (int i = 1; i <= a; i++) {
                int N, C;
                N = lector.nextInt();
                C = lector.nextInt();
                b = b + (N * C);
                c = c + C;
            }
            c = c * 100;
            double x = b / c;
            System.out.println(e.format(x));
            break;
        }

    }
}
