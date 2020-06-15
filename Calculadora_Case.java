/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
public class Calculadora_Case {
    public static void main(String[] args){
  Scanner eStr = new Scanner(System.in);
        Scanner eNum = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número:");
        double x = eNum.nextDouble();
        System.out.print("Digite a operação matemática:");
        String s = eStr.nextLine();
        System.out.print("Digite o segundo número:");
        double y = eNum.nextDouble();
        
        char op = s.charAt(0);
        
        switch (op){
            case '+': System.out.println("Valor = " +(x+y));
                break;
            case '-': System.out.println("Valor = " +(x-y));
                break;
            case '*': System.out.println("Valor = " +(x*y));
                break;
            case '/': System.out.println("Valor = " +(x/y));
                break;
            default: System.out.println("Operador Inválido!" +op);
        }
    }
}
