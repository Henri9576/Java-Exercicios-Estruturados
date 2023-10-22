package Exercicio16;
/*Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
Recuperação (media entre 5.1 a 6.9);*/
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        String nome;
        int np1;
        int np2;
        int np3;
        float media;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o nome do aluno: ");
        nome = leitor.nextLine();
        System.out.println("Insira a nota da NP1: ");
        np1 = leitor.nextInt();
        System.out.println("Insira a nota da NP2: ");
        np2 = leitor.nextInt();
        System.out.println("Insira a nota da NP3: ");
        np3 = leitor.nextInt();
        
        media = (np1 + np2 + np3) / 3;
        
        if(media >= 7){
            System.out.println("Aluno " + nome + " aprovado.");
        } else if(media >= 5.1 && media <= 6.9){
            System.out.println("Aluno " + nome + " está de recuperação.");
        } else {
            System.out.println("Aluno " + nome + " reprovado.");
        }
       
    }
}
