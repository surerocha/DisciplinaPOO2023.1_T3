package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont, a, b, i;
		Scanner sc = new Scanner (System.in);
		for (cont=0; cont<=5; cont++) {
			System.out.println("Digite o número A: ");
			a=sc.nextInt();
			System.out.println("Digite o número B: ");
			b=sc.nextInt();
			for (i=a; i<=b; a++) {
				if (i%2==0) {
					System.out.println("i vale: "+i);
				}
				return;
			}
			return;
		}
		sc.close();
	}

}
