/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_iterativa;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Calculadora_iterativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int opc = 1 ;
        do{
            System.out.println("Bienvenido digite los  numeros: ");
            System.out.println("Digite el primer numero: ");
            int a = lector.nextInt();
            System.out.println("Digite el segundo numero: ");
            int b = lector.nextInt();
            
            System.out.println("seleccione una opcion"+"\n"
                    + "1.sumar"+ "\n"
                    + "2.restar" +"\n"
                    + "3.multiplicar"+"\n"
                    + "4.dividir"+"\n"
                    + "5.potencia de los dos numeros"+"\n"
                    + "6.salir");
                    
            int opcion = lector.nextInt();
            switch(opcion){
                case 1 : System.out.println("El resultado es: "+ suma(a,b));
                    break;
                case 2 : System.out.println("El resultado es: "+restar(a,b));
                    break;
                case 3 : System.out.println("El resultado es: " + multiplicar(a,b));
                    break;
                case 4 : System.out.println("El resultado es: "+ dividir(a,b));
                    break;
                case 5 :
                    System.out.println("dijite el exponente:");
                    int expo = lector.nextInt();
                    System.out.println("El resultado del exponente "+ a +"es: " + potenciaA(a,expo));
                    System.out.println("El resultado del exponente "+ b +"es: " + potenciaB(b,expo));
                    break;
                case 6 : opc = 0 ;
            }
            
            
        }while(opc!=0);
    }

    private static int suma(int a, int b) {
       int resultado = a+b;
       return resultado;
    }

    private static int restar(int a, int b) {
         int resultado = a-b;
       return resultado;
    }

    private static int multiplicar(int a, int b) {
          int resultado = a*b;
       return resultado;
    }

    private static int dividir(int a, int b) {
         int resultado = a/b;
       return resultado;
    }

    private static int potenciaA(int a, int expo) {
        int resultado = 1 ;
        for (int i = 0; i < expo; i++) {
            resultado = resultado  * a ;
        }
        return resultado;
    }

    private static int potenciaB(int b, int expo) {
              int resultado = 1 ;
        for (int i = 0; i < expo; i++) {
            resultado = resultado * b ;
        }
        return resultado;
    }
    }
    

