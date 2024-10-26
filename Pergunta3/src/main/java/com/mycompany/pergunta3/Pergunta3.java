/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta3;

import java.util.Scanner;

/**
 *
 * @author f.oliveira
 */

public class Pergunta3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int expresso = 1,capuccino = 2, leite = 3, total;
        
        
       
        
        
        System.out.println("Escolha opção de cafe: 1 - café expresso; 2 - café capuccino; 3 - leite com café; ");
           int numero = sc.nextInt();
       
           
        if(numero == expresso){
           System.out.println("café expresso");
        }
        else if(numero == capuccino){
            System.out.println("café capuccino");
        }
         else if(numero == leite){
            System.out.println("leite com café");
        }
         else{
            System.out.println("Opção invalida!");
         }
        
         while(numero > 0){
           System.out.println("Deseja mais algum cafe?");
         }

       
        
    }
}
