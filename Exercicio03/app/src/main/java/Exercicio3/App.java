package Exercicio3;
// Escreva um algoritmo para determinar o consumo médio de um automóvel sendo 
//fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float distanciaPercorrida;
        float combustivelGasto;
        float consumoMedio;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a distância percorrida do automóvel: ");
        distanciaPercorrida = leitor.nextFloat();
        System.out.println("Insira o total de combustível gasto");
        combustivelGasto = leitor.nextFloat();
        
        consumoMedio = distanciaPercorrida / combustivelGasto;
        
        System.out.println("O consumo médio do automóvel é: " + consumoMedio);
        
        
        
    }
}
