package Exercicio6;

import java.util.Scanner;

/* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de 
forma que a variável A passe a possuir o valor da variável B e a variável B passe 
a possuir o valor da variável A. Apresentar os valores trocados; */

public class App {

    public static void main(String[] args) {
        int a;
        int b;
        int a2;
        int b2;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira o valor da variável A: ");
        a = leitor.nextInt();
        System.out.println("Insira o valor da variável b: ");
        b = leitor.nextInt();
        
        a2 = a;
        b2 = b;
        a = b2;
        b = a2;
        
        System.out.println("O valor da variável A agora é: " + a);
        System.out.println("O valor da variável B agora é: " + b);
    }
}
