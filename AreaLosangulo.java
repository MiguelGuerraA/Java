
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class AreaLosangulo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
System.out.println("digite o valor da diagonal maior do losangulo");
double diagonalMaior = input.nextDouble();
System.out.println("digite o valor da diagonal menor do losangulo");
double diagonalMenor = input.nextDouble();

double area = (diagonalMaior * diagonalMenor) / 2;
System.out.printf("A área do losango é: %.2f", area);  }

}