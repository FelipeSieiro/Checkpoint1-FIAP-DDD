package com.fiap.ddd.checkpoint;

import java.util.Scanner;

public class CheckpointDDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fator1 = 0;
		int fator2 = 0;
		
		Scanner scanner = new Scanner(System.in);
			System.out.print("Insira o valor do Fator 1: ");
			fator1  = scanner.nextInt();
			System.out.print("Insira o valor do Fator 2: ");
			fator2  = scanner.nextInt();
		 int produtoMultiplicacao = fator1*fator2;
		
		System.out.println("Fator 1: "+ fator1);
		System.out.println("Fator 2: "+ fator2);	
		System.out.println("Resultado da Multiplicação: "+ produtoMultiplicacao);
		
		if (fator1 < 0 || fator2 < 0) {
		 System.out.println("Um dos fatores é menor que 0");
		}
		if (produtoMultiplicacao < 50){
			System.out.println("O produto é menor que 50");
		}else if (produtoMultiplicacao == 50) {
			System.out.println("O produto é igual a 50");
		}else {
			System.out.println("o produto é maior que 50");
		}
		
		System.out.println("----------Números de 1 Até" + " " + produtoMultiplicacao + " " + "o com While-----------");
		
		int i =1;
		while(i <= produtoMultiplicacao){
			System.out.println(i);
			i++;
		}
		System.out.println("----------Números de 1 Até" + " " + produtoMultiplicacao + " " + "o com For-----------");
		for(int x =1; x <= produtoMultiplicacao; x++){
			System.out.println(x);
		}
	}
}

