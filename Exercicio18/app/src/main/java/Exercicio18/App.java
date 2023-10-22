/*
Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package Exercicio18;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int idade;
        int n;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o número de idades que gostaria de checar: ");
        n = leitor.nextInt();
        
        for(int i = 0; i <= n; i = i + 1){
            System.out.println("Insira a idade: ");
            idade = leitor.nextInt();
            if(idade <= 18){
                System.out.println("Menor de idade.");
            } else {
                System.out.println("Maior de idade.");
            }
        }
    }
}
