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
        int numero = lector.nextInt();
        String[] a = new String[numero];
        for (int i = 0; i < a.length; i++) {
            a[i] = lector.next();
        }
        lector.nextLine();
         int cantidad_b = lector.nextInt();
        for (int j = 0; j < cantidad_b; j++) {
            String txt = lector.next();
            int cantidad = 0;
            int tamano = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i].contains(txt)) {
                    cantidad++;
                    int aux = a[i].length();
                    if (aux > tamano) {
                        tamano = aux;
                    }
                }
            }
            if (cantidad > 0) {
                System.out.println(cantidad + " " + tamano);
            } else {
                System.out.println("-1");
            }
        }
    }

}

