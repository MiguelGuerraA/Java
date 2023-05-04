
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class SalarioMinimo {
    
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println ("Digite o valor do salário mínimo;");
  double salarioMinimo = input.nextDouble();

  System.out.println ("Digite o valor do salário do funcionario");
  double salariofuncionario = input.nextDouble();

  double qtdSalariosMinimos = salariofuncionario / salarioMinimo;
  System.out.printf("O funcionario recebe %.2f salários mínimos", qtdSalariosMinimos);
  }
}

