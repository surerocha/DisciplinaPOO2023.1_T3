package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		double idade, soma=0, qtd=0, media;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a idade desejada (ou '0' para sair): ");
		idade = sc.nextDouble();
		
	while (idade > 0) {
		soma = soma + idade;
		qtd ++;
		System.out.println("Digite a idade desejada: ");
		idade = sc.nextDouble();}
   
	media=soma/qtd;
     System.out.println("A média das idades desse grupo de indivíduos é: " + media);
	}

}
