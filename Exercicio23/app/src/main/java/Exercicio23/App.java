/*
Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, 
menor que 25 ou igual a 40
*/
package Exercicio23;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        n = leitor.nextInt();
        
        if(n < 25){
            System.out.println("Número é menor que 25.");
        } else if(n == 40){
            System.out.println("Número é igual a 40.");
        } else if(n > 80){
            System.out.println("Número é maior que 80.");
        } else {
            System.out.println("Número não está em nenhum dos parâmetros.");
        }
    }
}
