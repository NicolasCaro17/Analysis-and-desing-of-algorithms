/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nico_
 */
public class Leer {
       public String cargarPoema() throws FileNotFoundException, IOException {
        String poema = "";
        FileReader file = new FileReader("D:\\patrones\\palabras_repetidas_recursivo\\Poema.txt");
        BufferedReader buffer = new BufferedReader(file);
        boolean validacion = true;
        String aux = "";
        while (validacion) {
            aux = buffer.readLine();
            if (aux == null) {
                validacion = false;
            } else {
                poema = poema + " " + aux;
            }
        }
        return poema;
    }
}


