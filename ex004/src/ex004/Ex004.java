/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex004;

import java.util.Scanner;

/**
 *
 * @author jo
 */
public class Ex004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float salario, salarioPorDia;
        int diasTrabalhados;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o salario do funcionário: ");
        salario = scan.nextFloat();
        
        System.out.print("Digite quantos dias o funcionário trabalhou no mês: ");
        diasTrabalhados = scan.nextInt();
        
        salarioPorDia = (float) salario / diasTrabalhados;
        
        System.out.println("O funcionário recebe " + salarioPorDia + " RS por dia.");
    }
    
}
