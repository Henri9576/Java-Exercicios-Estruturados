/*
A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel 
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
clientes;
*/
package Exercicio27;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        float valor;
        int combustivel;
        float desconto = 0;
        float total;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor do veículo: ");
        valor = leitor.nextInt();
        if(valor == 0){
            System.out.println("Valor inválido.");
            System.exit(0);
        }
        System.out.println("Insira o tipo de combustível do veículo "
                + "(Álcool: 1 | Gasolina: 2 | Diesel: 3):");
        combustivel = leitor.nextInt();
        
        switch(combustivel){
            case 1:
                desconto = (valor * 25) / 100;
                break;
            case 2:
                desconto = (valor * 21) / 100;
                break;
            case 3:
                desconto = (valor * 14) / 100;
                break;
            default:
                System.out.println("Combustível inválido.");
                System.exit(0);
        }
        total = desconto + valor;
        System.out.println("O veículo terá " + desconto + " reais de desconto, "
                + "tendo um valor total de " + total + " reais.");
    }
}
