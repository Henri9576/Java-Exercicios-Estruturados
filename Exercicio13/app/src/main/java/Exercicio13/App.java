package Exercicio13;
//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int n;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro: ");
        n = leitor.nextInt();
        
        if(n > 10){
            System.out.println("O número é maior que 10.");
        } else {
            System.out.println("O número não é maior que 10;");
        }
        
    }
}
