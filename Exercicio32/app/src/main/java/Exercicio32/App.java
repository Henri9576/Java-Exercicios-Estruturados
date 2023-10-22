package Exercicio32;

import java.util.Scanner;

/*Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
outros dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele; 
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
*/

public class App {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int soma1;
        int soma2;
        int soma3;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor:");
        num1 = leitor.nextInt();
        System.out.println("Insira o segundo valor:");
        num2 = leitor.nextInt();
        System.out.println("Insira o terceiro valor:");
        num3 = leitor.nextInt();
        
        soma1 = num1 + num2;
        soma2 = num2 + num3;
        soma3 = num3 + num1;
        
        if(soma1 >= num3 && soma2 >= num1 && soma3 >= num3){
            if(num1 == num2 && num2 == num3 && num3 == num1){
                System.out.println("Equilátero");
            } else if(num1 == num2 || num2 == num3 || num3 == num1){
                System.out.println("Isóscele");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }

    }
}
