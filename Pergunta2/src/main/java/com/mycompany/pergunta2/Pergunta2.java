/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta2;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Pergunta2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int idade,ano = 365,meses = 30,dias;
        
        
        System.out.println("Digite sua idade:");
          idade = sc.nextInt();
          
         dias = idade*ano+meses;
         
        System.out.println("Voce tem isso de dias:"+dias); 
         
       
        
    }
}
