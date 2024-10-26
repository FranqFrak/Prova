/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta4;

/**
 *
 * @author f.oliveira
 */
import javax.swing.*;
public class Pergunta4 {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
         
        int antecessor = 1,sucessor = 1;
        
        antecessor = numero - antecessor;
        sucessor = numero + sucessor;
        
        JOptionPane.showMessageDialog(null,"O antecessor do " +numero+ " é "+antecessor);
        JOptionPane.showMessageDialog(null,"O sucessor do " +numero+ " é "+sucessor);
        
    
    }
}
