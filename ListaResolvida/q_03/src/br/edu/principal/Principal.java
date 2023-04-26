package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		System.out.print("Digite a quantidade de números que serão lidos: ");
		   int  n = sc.nextInt();
			  
				   for (i = 1; i <= n; i++) {
				   System.out.print("Digite um número inteiro e positivo: ");
				   int num = sc.nextInt();
				   int fat = 1;
					
					if (num<0) {
					System.out.println("Por favor, digite um número inteiro e positivo.");}
					
					else {
						
						for (j = 1; j <= num; j++) {
						 fat *= j; }
					 
						System.out.println("Valor lido: " + num);
					 System.out.println("Fatorial desse valor: " + fat);
				 
					   }
				}
		}
		
	}
	
	
