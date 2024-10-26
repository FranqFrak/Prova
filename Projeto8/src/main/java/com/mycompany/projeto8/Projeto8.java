/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto8;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Projeto8 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
        int numero,tabuada;
        
        System.out.println("Digite um numero");
          numero = sc.nextInt();
          
         for(int i=0; i<11; i++){
           tabuada = i * numero;
           System.out.println(tabuada);
         } 
          
    }
}
