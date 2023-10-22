package Exercicio2;
//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, 
//multiplicação e a divisão dos dois números lidos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int n1;
        int n2;
        int resultado;
        float resultadoDiv;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número:");
        n1 = leitor.nextInt();
        System.out.println("Insira outro número");
        n2 = leitor.nextInt();

        resultado = n1 + n2;
        System.out.println("O resultado da soma dos números é: " + resultado);
        resultado = n1 - n2;
        System.out.println("O resultado da subtração dos números é: " + resultado);
        resultado = n1 * n2;
        System.out.println("O resultado da multiplicação dos números é: " + resultado);
        if(n1 == 0 || n2 == 0){
            System.out.println("Impossível dividir por zero.");
        } else {
            resultadoDiv = n1 / n2;
            System.out.println("O resultado da divisão dos números é: " + resultado);
        }
    }
}
