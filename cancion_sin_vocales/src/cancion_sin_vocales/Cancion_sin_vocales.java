/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancion_sin_vocales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author nico_
 */
public class Cancion_sin_vocales {
    public static String muestraContenido() throws FileNotFoundException, IOException {
        String cancion = "";
        FileReader archivo = new FileReader("D:\\patrones\\cancion_sin_vocales\\Cancion.txt");
        BufferedReader buffer = new BufferedReader(archivo);
        boolean validacion = true;
        String aux = "";
        while (validacion) {
            aux = buffer.readLine();
            if (aux == null) {
                validacion = false;
            } else {
                cancion = cancion + "\n" + aux;
            }
        }
        return cancion;
    }

    public static void eliminarVocal(String cadena, int i) throws IOException {      
        FileWriter fw = new FileWriter("D:\\patrones\\cancion_sin_vocales\\Cancion.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter ow = new PrintWriter(bw);
       
        if (i < cadena.length()) { //Condición base.
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'||
                cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U') {
                String f; //Variable que recepciona la nueva cadena generada.
               f = cadena.substring(0, i) + "" + cadena.substring(i + 1, cadena.length());
                eliminarVocal(f, i);
            } else {
                eliminarVocal(cadena, i + 1);
            }
        } else {
            System.out.println(cadena);
            bw.write(cadena);
            bw.close();// siempre es importante cerrar las cosas
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Confesion - Pipe Bueno");
        String a = muestraContenido();// String a el archivo plano 
        System.out.println(a);//lo muestro
        System.out.println("-------------------------");
        eliminarVocal(a, 0);        
    }
}    

    

