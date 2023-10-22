package Exercicio33;
import java.util.Scanner;
/* A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
*/
public class App {

    public static void main(String[] args) {
        String nome;
        int nivel;
        int hora;
        float salario;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o nome do professor(a):");
        nome = leitor.nextLine();
        System.out.println("Insira o nível do professor(a):");
        nivel = leitor.nextInt();
        System.out.println("Insira quantas horas este professor(a) trabalhou:");
        hora = leitor.nextInt();
        
        switch(nivel){
            case 1:
                salario = hora * 12;
                System.out.println("O professor(a) " + nome + " trabalhou " + hora + " horas, portanto, irá receber " + salario + " reais de pagamento");
                break;
            case 2:
                salario = hora * 17;
                System.out.println("O professor(a) " + nome + " trabalhou " + hora + " horas, portanto, irá receber " + salario + " reais de pagamento");
                break;
            case 3:
                salario = hora * 25;
                System.out.println("O professor(a) " + nome + " trabalhou " + hora + " horas, portanto, irá receber " + salario + " reais de pagamento");
                break;
            default:
                System.out.println("Nível inválido");
        }
    }
}
