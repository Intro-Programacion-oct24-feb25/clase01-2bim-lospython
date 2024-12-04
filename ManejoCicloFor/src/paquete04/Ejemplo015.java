/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete01.*;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        int factor_1 = 1;
        int factor_2 = 1;
        int limite;
        int limite_tabla;
        
        System.out.println("Ingrese el numero de tablas");
        limite = entrada.nextInt();
        System.out.println("Ingrese el limite de las tablas");
        limite_tabla = entrada.nextInt();
        
        while (factor_1 <= limite){
            while (factor_2 <= limite_tabla){
                System.out.println();
            }
            
        }
        
        }
        
        
    }
    

