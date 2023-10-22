package Exercicio11;

/*  Faça um algoritmo que receba o preço de custo de um produto e mostre o valor 
de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um 
percentual informado pelo usuário; */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int custo;
        int porcentagem;
        float acrescimo;
        float venda;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor de custo do produto: ");
        custo = leitor.nextInt();
        System.out.println("Informe a % de acréscimo da venda do produto: ");
        porcentagem = leitor.nextInt();
        
        acrescimo = (custo * porcentagem) / 100;
        venda = acrescimo + custo;
        
        System.out.println("O valor de venda do produto será de " + venda + " reais.");
        
    }
}
