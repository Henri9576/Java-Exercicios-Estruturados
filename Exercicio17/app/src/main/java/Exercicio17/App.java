package Exercicio17;
/*Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
(inclusive);*/
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n;
        int total = 0;
        int numeros;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos números gostaria de inserir?");
        numeros = leitor.nextInt();
        
        for(int i = 0; i <= numeros; i = i + 1){
            System.out.println("Insira um número: ");
            n = leitor.nextInt();
            if(n >= 10 && n <= 150){
                total = total + 1;
            }
        }
        
        System.out.println(total + " numeros estavam entre 10 e 150.");
    }
}
