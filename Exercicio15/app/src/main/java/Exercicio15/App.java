package Exercicio15;
//Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n1;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        n1 = leitor.nextInt();
        
        if(n1 >= 100 && n1 <= 200){
            System.out.println("O número está no intervalo.");
        } else {
            System.out.println("O número não está no intervalo.");
        }
    }
}
