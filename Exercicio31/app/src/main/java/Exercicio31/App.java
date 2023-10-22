package Exercicio31;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       float a;
       float b;
       char c;
       float resultado;
       
       Scanner leitor = new Scanner(System.in);
       
       System.out.println("Insira um número real:");
       a = leitor.nextFloat();
       System.out.println("Insira outro número real:");
       b = leitor.nextFloat();
       System.out.println("Insira um operador aritmético:");
       c = leitor.next().charAt(0);
       
       switch(c){
            case '+':
               resultado = a + b;
               System.out.println("Resultado: " + resultado);
               break;
            case '-':
               resultado = a - b;
               System.out.println("Resultado: " + resultado);
               break;
            case '*':
               resultado = a * b;
               System.out.println("Resultado: " + resultado);
               break;
            case '/':
               if(a == 0 || b == 0){
                   System.out.println("Impossível dividir por zero.");
               } else {
                   resultado = a / b;
                   System.out.println("Resultado: " + resultado);
                   break;
               }
            default:
                System.out.println("Operador inválido.");
               
       }
    }
}
