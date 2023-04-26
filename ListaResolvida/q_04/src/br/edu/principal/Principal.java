
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	int cont;
	int a;
	int b;
	int i;
	
	Scanner sc = new Scanner(System.in);
	for (cont = 1; cont <= 5; cont++) {
		System.out.println("Insira o primeiro número aqui: ");
		a = sc.nextInt();
		System.out.println("Insira o segundo número aqui: ");
		b = sc.nextInt();
		
		for (i = a; i <= b; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}

	}

}
