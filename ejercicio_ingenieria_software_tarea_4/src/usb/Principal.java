/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Principal {

    public static void main(String[] args) {
        List<String> camino = new ArrayList<>();
        Scanner lector = new Scanner(System.in);
        String a;
        boolean bandera = true;
        do {
            a = lector.next();
            if (a.contains("(") || a.contains(")")) {
                if (!camino.isEmpty()) {
                    for (int i = 0; i < camino.size(); i++) {
                        if (a.equals(camino.get(i))) {
                            bandera = true;
                            break;
                        }
                    }
                } else {
                    camino.add(a);
                }
                if (!bandera) {
                    camino.add(a);
                }
            } else {
                break;
            }
            bandera = false;
        } while (!a.contains("(") || !a.contains(")"));
        System.out.println(camino.size());
    }
}
