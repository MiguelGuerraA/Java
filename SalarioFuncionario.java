
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class SalarioFuncionario {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite o salário atual do funcionário: R$ ");
    double salarioAtual = input.nextDouble();
    
    double aumento = 0.25 * salarioAtual;
    double novoSalario = salarioAtual + aumento;
    
    System.out.printf("O novo salário do funcionário é: R$ %.2f", novoSalario);
  }
}