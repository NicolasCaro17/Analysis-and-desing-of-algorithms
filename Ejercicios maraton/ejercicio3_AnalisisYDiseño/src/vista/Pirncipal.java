/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nico_
 */
public class Pirncipal {
    public static void main(String[] args) {
        try {
            DecimalFormat df = new DecimalFormat("#.00");
            Scanner lector = new Scanner(System.in);
            System.out.println("Digite el salario");
            double salario = lector.nextFloat();
            if (salario >= 0 && salario <= 400.00) {
                double operacion = salario * 0.15;
                double salarioN = salario + operacion;

                System.out.println("Nuevo Salario:" + df.format(salarioN));
                System.out.println("Dinero Ganado: " + df.format(operacion));
                System.out.println("En Porcentaje: " + "15%");

            } else {
                if (salario > 400.01 && salario < 800.00) {
                    double operacion = salario * 0.12;
                    double salarioN = salario + operacion;

                    System.out.println("Nuevo Salario:" + df.format(salarioN));
                    System.out.println("Dinero Ganado: " + df.format(operacion));
                    System.out.println("En Porcentaje: " + "12%");
                } else {
                    if (salario >= 800.01 && salario <= 1200) {
                        double operacion = salario * 0.1;
                        double salarioN = salario + operacion;

                        System.out.println("Nuevo Salario:" + df.format(salarioN));
                        System.out.println("Dinero Ganado: " + df.format(operacion));
                        System.out.println("En Porcentaje: " + "10%");
                    } else {
                        if (salario >= 1200.01 && salario <= 2000) {
                            double operacion = salario * 0.07;
                            double salarioN = salario + operacion;

                            System.out.println("Nuevo Salario:" + df.format(salarioN));
                            System.out.println("Dinero Ganado: " + df.format(operacion));
                            System.out.println("En Porcentaje: " + "7%");
                        } else {
                            if (salario > 2000) {
                                double operacion = salario * 0.04;
                                double salarioN = salario + operacion;

                                System.out.println("Nuevo Salario:" + df.format(salarioN));
                                System.out.println("Dinero Ganado: " + df.format(operacion));
                                System.out.println("En Porcentaje: " + "4%");
                            }
                        }
                    }
                }
            }
        } catch (InputMismatchException ab) {
            System.out.println("Digite caracteres validos");
        }

                
    }
}
