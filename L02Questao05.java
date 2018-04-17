package listaex02;

import java.util.Scanner;

public class L02Questao05 {

	public static void main(String[] args) {
		// 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe o 1� numero");
		int n1 = sc.nextInt();
		
		System.out.println("Informe o 2� numero");
		int n2 = sc.nextInt();
		
		System.out.println("Informe o 3� numero");
		int n3 = sc.nextInt();
		
		int opcao = 0;
		switch(opcao) {
		
		case 1:
			int media = (n1 + n2 +n3)/3;
			System.out.println("media" +media );
			  System.out.println("O resultado da m�dia � :");
			break;
			
			
			
			
		case 2:
			int soma = (n1 + n2 +n3);
			System.out.println("soma" +soma );
			break;
			
		case 3: 
			int multiplicacao = (n1 * n2 * n3);
			System.out.println("multiplica��o"+ multiplicacao);
			break;
			
		}			
			
		}

	}


