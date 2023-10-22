package Exercicio4;

import java.util.Scanner;

/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o 
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, 
o salário fixo e salário no final do mês;
*/

public class App {


    public static void main(String[] args) {
        String nome;
        int salario;
        int totalVendas;
        int comissao;
        int salarioTotal;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o nome do funcionário: ");
        nome = leitor.nextLine();
        System.out.println("Insira o salário fixo do funcionário: ");
        salario = leitor.nextInt();
        System.out.println("Insira o total de vendas do funcionário neste mês: ");
        totalVendas = leitor.nextInt();
        
        comissao = (totalVendas * 15) / 100;
        salarioTotal = salario + comissao;
        
        System.out.println("O funcionário " + nome + " com sálario fixo de " + 
        salario + " teve um total de vendas equivalente á " + totalVendas + 
        ". Portanto, terá uma comissão de " + comissao + " com salário total de " 
        + salarioTotal + ".");
    }
}
