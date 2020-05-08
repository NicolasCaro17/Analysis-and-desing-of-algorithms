/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Principal {
    public static void main(String[] args) {
      Scanner a = new Scanner(System.in);   
        String animal = a.next();
        String tipo=a.next();
        String comida = a.next();
        if(animal.equals("vertebrado")){
           
           if(tipo.equals("ave")){
               if(comida.equals("carnivoro")){
                   System.out.println("aguila");
               }else{
                   if(comida.equals("onivoro")){
                       System.out.println("pomba"); 
                   }
               }
           }else{
              if(tipo.equals("mamifero")){
                  if(comida.equals("onivoro")){
                      System.out.println("homem");
                  }else{
                      if(comida.equals("herbivoro")){
                          System.out.println("vaca");
                      }
                  }
              } 
           } 
            
        }else{
          if(animal.equals("invertebrado")){
              if(tipo.equals(animal)){
                  if(comida.equals(animal)){
                      
                  }else{
                      if(comida.equals(animal)){
                          
                      }
                  }
              }else{
                  if(tipo.equals("insecto")){
                      if(comida.equals("hematofago")){
                          System.out.println("pulga");
                      }else{
                          if(comida.equals("hervivoro")){
                              System.out.println("lagarta");
                          }
                      }
                  }
                  else{
                      if(tipo.equals("anelido")){
                          if(comida.equals("hematofago")){
                              System.out.println("sangessuga");
                          }else{
                              if(comida.equals("onivoro")){
                                  System.out.println("minhoca");
                              }
                          }
                                
                      }
                  }
              }
          }else{
              System.out.println("No existe animal");
          }  
        }
    }
   
}
