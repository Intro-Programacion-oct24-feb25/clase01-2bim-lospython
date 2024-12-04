/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US); 
       int numero = 1; 
       int limite;
       int limite1; 
       int contador = 1;
       int resultado; 
       String cadenaFinal = ""; 
       
       System.out .println("Ingrese las tablas que desea");
       limite = entrada.nextInt(); 
       System.out .println("Ingrese el limite de tablas que desea");
       limite1 = entrada.nextInt(); 


       while (numero <= limite){
           while (contador <= limite1){
               resultado = numero * contador ;  
              cadenaFinal = String.format("%s%d * %d = %d\n", cadenaFinal,
                      numero,contador,resultado); 
           }
           contador = 1 ;
           numero = numero + 1 ; 
       }
           
       
    }

}
