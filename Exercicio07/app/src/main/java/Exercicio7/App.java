package Exercicio7;

import java.util.Scanner;

/*Leia uma temperatura em graus Celsius e apresentá-la convertida em graus 
Fahrenheit. A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em 
Fahrenheit e C a temperatura em Celsius; */

public class App {

    public static void main(String[] args) {
        int f;
        int c;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira uma temperatura em Celsius: ");
        c = leitor.nextInt();
        
        f = (9 * c + 160) / 5;
        
        System.out.println("A conversão desta temperatura em Fahrenheit é: " + f);
        
    }
}
