
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
  public class Tabuada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pede ao usuário para inserir um número
    System.out.print("Informe um número: ");
    int numero = sc.nextInt();

    // Calcula e exibe a tabuada de multiplicação
    for (int i = 0; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);
    }

    sc.close();
  }
}

