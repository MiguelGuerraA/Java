
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class ConversorTemperatura {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println ("digite a temperatura em Celsius");
 
   double temperaturaCelsius = input.nextDouble();
   
   double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
   
   System.out.printf ("A temperatura em Fahrenheit é: %.2f", temperaturaFahrenheit);
  }
}