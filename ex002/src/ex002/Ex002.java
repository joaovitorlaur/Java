/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex002;

import java.util.Scanner;

/**
 *
 * @author jo
 */
public class Ex002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int comprimento, largura;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = scan.nextInt();
        
        System.out.print("Digite a largura do terreno: ");
        largura = scan.nextInt();
        
        System.out.println("A area do terreno é de " + largura * comprimento + " m/2.");
    }
    
}
