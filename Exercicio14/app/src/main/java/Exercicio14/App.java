package Exercicio14;
//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n1;
        int n2;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro.");
        n1 = leitor.nextInt();
        System.out.println("Insira outro número inteiro.");
        n2 = leitor.nextInt();
        
        if(n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        } else {
            System.out.println(n2 + " é maior que " + n1);
        }
    }
}
