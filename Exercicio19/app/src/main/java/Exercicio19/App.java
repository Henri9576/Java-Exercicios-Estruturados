/*
Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;
 */
package Exercicio19;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        char genero;
        String nome;
        int qtd; //quantidade
        int m = 0; //masculino
        int f = 0; //feminino
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantas pessoas gostaria de inserir?");
        qtd = leitor.nextInt();
        for(int i = 0;i < qtd;i = i + 1){
            System.out.println("Insira o nome:");
            nome = leitor.next();
            
            System.out.println("Insira o gênero (M/F):");
            genero = leitor.next().charAt(0);
            
            System.out.println("Nome: " + nome +  " | Sexo: " + genero);
            
            if(genero == 'M' || genero == 'm'){
                m = m + 1;
            } else {
                f = f + 1;
            }
        }
        System.out.println("Foram inseridos um total de " + m + " homens e " + f + " mulheres.");
    }
}
