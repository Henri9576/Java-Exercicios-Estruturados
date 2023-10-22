/*
Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa 
vai aumentar sua folha de pagamento;
*/
package Exercicio28;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        String nome;
        int i = 0;
        int qtd;
        int salario;
        int salarioMin;
        float acrescimo;
        float salarioFinal;
        float salarioTotal = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos funcionários gostaria de atualizar?");
        qtd = leitor.nextInt();
        System.out.println("Insira o salário mínimo atual: ");
        salarioMin = leitor.nextInt();
        
        while(i < qtd){
            System.out.println("Insira o nome do funcionário: ");
            nome = leitor.next();
            System.out.println("Insira o salário atual do funcionário:");
            salario = leitor.nextInt();
            
            if(salario <= salarioMin * 3){
                acrescimo = (salario * 50) / 100;
                salarioFinal = salario + acrescimo;
            } else if(salario <= salarioMin * 10){
                acrescimo = (salario * 20) / 100;
                salarioFinal = salario + acrescimo;
            } else if(salario <= salarioMin * 20){
                acrescimo = (salario * 15) / 100;
                salarioFinal = salario + acrescimo;
            } else {
                acrescimo = (salario * 10) / 100;
                salarioFinal = salario + acrescimo;
            }
            System.out.println("Nome: " + nome);
            System.out.println("Salário mínimo: " + salarioMin);
            System.out.println("Salário antigo: " + salario);
            System.out.println("Acréscimo: " + acrescimo);
            System.out.println("Salário final: " + salarioFinal);
            
            salarioTotal = salarioTotal + acrescimo;
            i = i + 1;
        }
        System.out.println("A folha de pagamento irá aumentar por " + salarioTotal + " reais.");
    }
}
