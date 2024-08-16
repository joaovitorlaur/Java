/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex001;

import java.util.Scanner;

/**
 *
 * @author jo
 */
public class Ex001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        num = scan.nextInt();
        
        System.out.println("O numero " + num + " ao quadrado eh " + num * num);
    }
    
}
