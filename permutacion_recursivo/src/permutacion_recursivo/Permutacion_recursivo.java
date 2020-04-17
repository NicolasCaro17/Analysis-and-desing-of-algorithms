/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutacion_recursivo;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Permutacion_recursivo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner lector =  new Scanner(System.in);
        LinkedList<String> a = new LinkedList<String>();
        String palabra;

        System.out.println("Digite el tamaño del cadena: ");
        int tamano = lector.nextInt();

        System.out.print("Digite los Valores: ");
        for (int i = 0; i < tamano; i++) {
            palabra = lector.next();
            a.add(palabra);
        }
        permutacion("", a);
    }
      static void permutacion(String a, LinkedList<String> c) {
        if (c.size() == 1) {
            System.out.println(a + c.get(0));
        }
        for (int i = 0; i < c.size(); i++) {
            String b = c.remove(i);
            permutacion(a + b, c);
            c.add(i, b);
        }
    }
    }
    

