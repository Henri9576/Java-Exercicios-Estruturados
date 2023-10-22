/*
Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais;
*/
package Exercicio21;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int n;
        String nome;
        char sexo;
        int idade;
        char saude;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantas pessoas gostaria de checar?");
        n = leitor.nextInt();
        
        for(int i = 0;i < n;i = i + 1){
            System.out.println("Insira o nome: ");
            nome = leitor.next();
            
            System.out.println("Insira a idade:");
            idade = leitor.nextInt();
            
            System.out.println("Insira o genêro (M/F):");
            sexo = leitor.next().charAt(0);
            
            System.out.println("Tem algum problema de saúde? (Y/N)");
            saude = leitor.next().charAt(0);
            
            if(idade < 18){
                System.out.println("Não está apto para o serviço militar.");
            } else if(saude == 'Y' || saude == 'y'){
                System.out.println("Não está apto para o serviço militar.");
            } else {
                System.out.println(nome + " está apto para o serviço militar.");
            }
        }
    }
}
