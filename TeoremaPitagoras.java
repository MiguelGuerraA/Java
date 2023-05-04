
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
 public class TeoremaPitagoras {
   
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.println(" Digite o valor do primeiro cateto");
    double cateto1 = scanner.nextDouble();
    
    System.out.println(" Digite o valor do segundo cateto");
    double cateto2 = scanner.nextDouble();

    double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
}