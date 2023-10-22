package Exercicio12;
/*O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
mesmo;*/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int custo;
        int impostos = 45;
        int resultadoImpostos;
        int distribuidor = 28;
        int resultadoFinal;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o custo de fábrica do automóvel:");
        custo = leitor.nextInt();
        
        resultadoImpostos = (custo * impostos) / 100;
        custo = custo + resultadoImpostos;
        
        resultadoFinal = (custo * distribuidor) / 100;
        resultadoFinal = custo + resultadoFinal;
        
        System.out.println("Supondo impostos de " + impostos
        + " e porcentual do distribuidor de " + distribuidor + ", o custo final"
        + " deste automóvel será de " + resultadoFinal + " reais.");
        
    }
}
