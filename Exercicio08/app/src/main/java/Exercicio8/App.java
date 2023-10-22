package Exercicio8;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int dolar;
        float cotacao;
        float real;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de dólares para converter: ");
        dolar = leitor.nextInt();
        System.out.println("Insira a cotacao do dólar no momento: ");
        cotacao = leitor.nextFloat();
        
        real = dolar * cotacao;
        System.out.println(dolar + " dólares é igual á " + real + " reais.");
        
    }
}
