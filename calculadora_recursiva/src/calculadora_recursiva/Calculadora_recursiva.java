/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_recursiva;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Calculadora_recursiva {

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

     static int suma(int a, int b) {
        if(a== 0){
            return b ;
        }else{
            if(b==0){
                return a;
            }else{
                return 1+suma(a,b-1);
            }
        }
    }

    static int restar(int a, int b) {
       if(a== 0){
            return -b ;
        }else{
            if(b==0){
                return a;
            }else{
            if(a>b){
               return 1+restar(a,b+1); 
            }else{ 
                if(b>a){
                    return -1 + restar(a+1,b);
            } 
            }
            }
            return 0 ;
    }
    }

     static int multiplicar(int a, int b) {
        if(a==0|| b == 0){
            return 0;
        }else{
            if(a==1){
                return b ;
            }else{
                if(b==1){
                    return a ;
            }else{
                    return a+multiplicar(a,b-1);
                }
        }
    }
     }

    static int dividir(int a, int b) {
       if(b>a){
           return 0;
       }else{
           return 1 + dividir(a-b, b);
       }
    }

     static int potenciaA(int a, int expo) {
       if(expo == 0){
           return 1 ;         
       }else{
           if(expo==1){
               return a ;
           }else{
              return a * potenciaA(a,expo-1);
           }
       }
    }
     static int potenciaB(int b, int expo) {
       if(expo == 0){
           return 1 ;
           
       }else{
           if(expo==1){
               return b ;
           }else{
               return b * potenciaB(b,expo-1); 
           }
       }
    }
    
}
