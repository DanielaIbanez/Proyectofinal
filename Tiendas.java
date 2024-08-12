/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendas;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tiendas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in) ;
         double plata = 100000;
         for (int i=1 ; i<= 12; i++) {
         double ganancia = plata*0.01;
         plata = plata + ganancia;
             System.out.println("gano");
             System.out.println(ganancia);
             System.out.println("saldo");
             System.out.println(plata);
         }
        
        
    }
}
