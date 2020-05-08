/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras_repetidas_recursivo;

import controlador.Controlador;
import controlador.Leer;
import java.io.IOException;

/**
 *
 * @author nico_
 */
public class Palabras_repetidas_recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Leer fichero = new Leer();
        Controlador contadores = new Controlador();
        String cadena = fichero.cargarPoema();
        System.out.println(cadena);
        contadores.contadorVocales(cadena, 0, 0);
        contadores.contadorConsonantes(cadena, 0, 0);
        contadores.contarEspacios(cadena, 0, 0);
        contadores.contarPalabras(cadena, 0);
    }
    
}
