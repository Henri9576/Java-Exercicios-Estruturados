package Exercicio5;

import java.util.Scanner;
/* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
que ele obteve no semestre. No finalinformar o nome do aluno e a sua média 
(aritmética); */
public class App {

    public static void main(String[] args) {
        int np1;
        int np2;
        int np3;
        int media;
        String nome;
        
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
        
        System.out.println("O aluno " + nome + " teve uma média de " + media + " no semestre.");
    }
}
