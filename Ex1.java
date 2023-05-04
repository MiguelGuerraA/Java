
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Ex1 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média aritmética das notas %.1f, %.1f e %.1f é: %.1f\n", nota1, nota2, nota3, media);
    }
}

