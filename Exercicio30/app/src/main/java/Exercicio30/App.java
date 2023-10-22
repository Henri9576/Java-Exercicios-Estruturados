/*
Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
*/
package Exercicio30;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int i;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor:");
        n1 = leitor.nextInt();
        System.out.println("Insira o segundo valor:");
        n2 = leitor.nextInt();
        System.out.println("Insira o terceiro valor:");
        n3 = leitor.nextInt();
        
        if(n1 > n3){
            i = n1;
            n1 = n3;
            n3 = i;
        }
        if(n1 > n2){
            i = n1;
            n1 = n2;
            n2 = i;
        }
        if (n2 > n3){
            i = n2;
            n2 = n3;
            n3 = i;
        }
        
        System.out.println("Ordem crescente: " + n1 + n2 + n3);
    }
}
