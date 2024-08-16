/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex003;

import java.util.Scanner;

/**
 *
 * @author jo
 */
public class Ex003 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float celsius, farenheit;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = scan.nextFloat();
        
        farenheit = (float) (((9.0 / 5.0) * celsius) + 32);
        
        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Farenheit: " + farenheit);
    }
    
}
