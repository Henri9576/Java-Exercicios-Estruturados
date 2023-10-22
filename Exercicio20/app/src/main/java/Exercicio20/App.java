/*
 A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;
 */
package Exercicio20;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int ano;
        float valor;
        float desconto;
        char confirmacao = 'Y';
        int total = 0;
        int total2000 = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        while(confirmacao == 'Y' || confirmacao == 'y'){
            System.out.println("Insira o ano do veículo: ");
            ano = leitor.nextInt();
            System.out.println("Insira o valor do veículo: ");
            valor = leitor.nextFloat();
        
            if(ano <= 2000){
                desconto = (valor * 12) / 100;
                valor = valor - desconto;
                total2000 = total2000 + 1;
            } else {
                desconto = (valor * 7) / 100;
                valor = valor - desconto;
            }
            
            System.out.println("Este veículo terá um desconto de " + desconto + 
            " reais. Totalizando " + valor + " reais.");
            
            System.out.println("Deseja continuar? (Y/N)");
            confirmacao = leitor.next().charAt(0);
            total = total + 1;
        }
        
        System.out.println("O total de carros até os anos 2000 checados foi de: " + total2000 + 
        ". E o total de todos os carros foi de " + total + ".");
    }
}
