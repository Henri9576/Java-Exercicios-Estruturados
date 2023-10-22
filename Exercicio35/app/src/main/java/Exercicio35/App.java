package Exercicio35;

import java.util.Scanner;

/*Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de 
luz segue a tabela abaixo: 
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.
*/

public class App {

    public static void main(String[] args) {
        int energia;
        int tipo_local;
        double total;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o total gasto de energia deste mês em KW: ");
        energia = leitor.nextInt();
        
        System.out.println("Insira o tipo do local: ");
        System.out.println("1 - Residência.");
        System.out.println("2 - Comércio.");
        System.out.println("3 - Indústria.");
        tipo_local = leitor.nextInt();
        
        switch (tipo_local){
            case 1: 
                total = energia * 0.60;
                System.out.println("Total do valor da conta de luz: " + total);
                break;
            case 2:
                total = energia * 0.48;
                System.out.println("Total do valor da conta de luz: " + total);
                break;
            case 3:
                total = energia * 1.29;
                System.out.println("Total do valor da conta de luz: " + total);
                break;
            default:
                System.out.println("Local inválido.");
        }
    }
}
