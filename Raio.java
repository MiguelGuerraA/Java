
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Raio {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = input.nextDouble();

        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * raio * raio;
        double volume = (3.0/4.0) * Math.PI * raio * raio * raio;

        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
    }
}
