import java.util.Scanner;
public class Calculadora.java {
    
	public static void main(String[] args) {
	    double num1, num2;
	    double soma, subtracao, multiplicacao, divisao;
	    int opcao;
	    Scanner entrada = new Scanner (System.in);
	    
	        System.out.println ("Informe o primeiro número: ");
	        num1  = entrada.nextDouble ();
	        System.out.println ("Informe o segundo número: ");
	        num2  = entrada.nextDouble ();
	        
	        System.out.println("*****SELECIONE SUA AÇÃO*****");
	        System.out.println(" [1] - SOMAR");
	        System.out.println(" [2] - SUBTRAIR");
	        System.out.println(" [3] - MULTIPLICAR");
	        System.out.println(" [4] - DIVIDIR");
            System.out.println("-------------> DIGITE SUA OPÇÃO: ");
	        opcao  = entrada.nextInt();
	        
	        switch (opcao) {
	            case 1:
	                soma = num1 + num2;
	                System.out.println ("A soma é: "+soma);
	                break;

	            case 2:
	                subtracao = num1 - num2;
	                System.out.println ("A subtração é: "+subtracao);
	                break;
	                
	            case 3:
	                multiplicacao = num1 * num2;
	                System.out.println ("A multiplicação é: "+multiplicacao);
	                break;
	                
	            case 4:
	                divisao = num1 / num2;
	                System.out.println ("A divisão é: "+divisao);
	                break;
	                
	           default:
	                System.out.println ("NÚMERO DIGITADO NÃO CONFERE!");
	        }
	}
}