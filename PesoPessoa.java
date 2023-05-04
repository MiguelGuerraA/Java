
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class PesoPessoa {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        // calcula o peso com aumento de 15%
        double pesoAumentado = peso + (peso * 0.15);
        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + pesoAumentado);

        // calcula o peso com redução de 20%
        double pesoReduzido = peso - (peso * 0.20);
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + pesoReduzido);
        
        scanner.close();
    }
}
