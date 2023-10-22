package Exercicio1;
// Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int n1;
        int n2;
        int soma;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        n1 = leitor.nextInt();
        System.out.println("Insira outro número:");
        n2 = leitor.nextInt();
        
        soma = n1 + n2;
        
        System.out.println("A soma dos números é: " + soma);
    }
}
