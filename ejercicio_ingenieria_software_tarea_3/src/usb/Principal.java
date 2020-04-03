/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author nico_
 */
public class Principal {
       private static int convertir(String a) {
        return Integer.parseInt(a);
    }
    private static String vencedor(int podermarcos, int poderleonardo) {
        if (podermarcos > poderleonardo) {
            return "Marcos";
        }
        if (podermarcos < poderleonardo) {
            return "Leonardo";
        }
        return "Empate";

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Digite Los valores: ");
  InputStreamReader inp = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(inp);
        String numero;
        String[] cartas;
        String[] cartasEscogidas;
        int[][] matrizmarcos;
        int[][] matrizleonardo;
        String[] carta2;
        String[] carta1;
        while ((numero = br.readLine()) != null) {
            cartas = br.readLine().split(" ");
            matrizmarcos = new int[Integer.parseInt(numero)][Integer.parseInt(cartas[0])];
            matrizleonardo = new int[Integer.parseInt(numero)][Integer.parseInt(cartas[1])];

            for (int i = 0; i < matrizmarcos[0].length; i++) {
                carta1 = br.readLine().split(" ");
                for (int j = 0; j < matrizmarcos.length; j++) {
                    matrizmarcos[j][i] = convertir(carta1[j]);
                }
            }
            for (int i = 0; i < matrizleonardo[0].length; i++) {
                carta2 = br.readLine().split(" ");
                for (int j = 0; j < matrizleonardo.length; j++) {
                    matrizleonardo[j][i] = convertir(carta2[j]);
                }
            }
            cartasEscogidas = br.readLine().split(" ");
            int a = convertir(cartasEscogidas[0]) - 1;
            int b = convertir(cartasEscogidas[1]) - 1;
            String atributoesc = br.readLine();
            int podermarcos = matrizmarcos[convertir(atributoesc) - 1][a];
            int poderleonardo = matrizleonardo[convertir(atributoesc) - 1][b];
            System.out.println(vencedor(podermarcos, poderleonardo));
            break;
        }
    }
}
