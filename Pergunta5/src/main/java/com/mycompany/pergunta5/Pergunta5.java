/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta5;

/**
 *
 * @author f.oliveira
 */
import java.util.Scanner;
public class Pergunta5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int senha;
       int senhaCerta = 9999;
       int igual = 1234;
       
        System.out.println("Digite sua senha?");
          senha = sc.nextInt();
          
         if(senha == senhaCerta){
            System.out.println("Acessor Permitido");
         } 
         else if(senha == igual){
            System.out.println("Usuario invalido");
         }
         else{
            System.out.println("Senha Incorreta");
         }
    
    }
}
