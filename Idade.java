
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Idade {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite o ano de nascimento: ");
    int anoNascimento = input.nextInt();
    
    System.out.print("Digite o ano atual: ");
    int anoAtual = input.nextInt();
    
    int idadeAtual = anoAtual - anoNascimento;
    int idade2050 = 2050 - anoNascimento;
    
    System.out.println("Idade no ano atual: " + idadeAtual);
    System.out.println("Idade em 2050: " + idade2050);
  }
}

