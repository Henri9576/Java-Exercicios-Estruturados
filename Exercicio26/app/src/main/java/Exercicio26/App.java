/*
Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
 */
package Exercicio26;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        n = leitor.nextInt();
        
        switch(n){
            case 1:
                System.out.println("Um está dentro dos parâmetros.");
                break;
            case 2:
                System.out.println("Dois está dentro dos parâmetros.");
                break;
            case 3:
                System.out.println("Três está dentro dos parâmetros.");
                break;
            case 4:
                System.out.println("Quatro está dentro dos parâmetros.");
                break;
            case 5:
                System.out.println("Cinco está dentro dos parâmetros.");
                break;
            default:
                System.out.println("Número fora dos parâmetros.");
                break;
        }
    }
}
