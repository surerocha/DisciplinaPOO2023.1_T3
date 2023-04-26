package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		        int num, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;
                Scanner sc = new Scanner (System.in);
		        System.out.print("Digite um número positivo (ou um número negativo para sair): ");
		        num = sc.nextInt();

		        while (num >= 0) {
		            if (num <= 25) {
		                intervalo1++;
		            } else if (num <= 50) {
		                intervalo2++;
		            } else if (num <= 75) {
		                intervalo3++;
		            } else if (num <= 100) {
		                intervalo4++;
		            }
		            System.out.print("Digite um número positivo (ou um número negativo para sair): ");
		            num = sc.nextInt();
		        }

		        System.out.println("Quantidade de números nos intervalos:");
		        System.out.printf("(0-25): %d\n", intervalo1);
		        System.out.printf("{26-50}: %d\n", intervalo2);
		        System.out.printf("[51-75]: %d\n", intervalo3);
		        System.out.printf("[76-100]: %d\n", intervalo4);
		    }
	

}
