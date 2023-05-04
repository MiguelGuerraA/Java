
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class ConversorDolarReal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite a cotação do dólar em reais: ");
    double cotacao = input.nextDouble();
    
    System.out.println("Digite o valor em dólares que você possui: ");
    double valorDolar = input.nextDouble();
    
    double valorReal = valorDolar * cotacao;
    
    System.out.printf("O valor em reais é: R$ %.2f", valorReal);
  }
}
