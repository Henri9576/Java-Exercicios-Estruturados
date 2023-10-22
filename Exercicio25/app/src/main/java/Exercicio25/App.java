/*
  Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
maior, e uma mensagem que são diferentes;

 */
package Exercicio25;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n1;
        int n2;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        n1 = leitor.nextInt();
        System.out.println("Insira outro número: ");
        n2 = leitor.nextInt();
        
        if(n1 == n2){
            System.out.println("Os número são iguais");
        } else if(n1 > n2){
            System.out.println("Os números são diferentes e o número " + n1 + " é maior que " + n2 + ".");
        } else {
            System.out.println("Os números são diferentes e o número " + n2 + " é maior que " + n1 + ".");
        }
    }
}
