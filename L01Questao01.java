package listaex01;

import java.util.Scanner;

public class L01Questao01 {


		public static void main(String[] args) {
			   @SuppressWarnings("resource")
			Scanner pegarnumero = new Scanner(System.in);
			           
			   int num1, num2 , soma, diferenca, produto, media;
			    System.out.println("Entre com o primeiro numero:");
			   num1 = pegarnumero.nextInt();
			        System.out.println("Entre com o segundo numero");
			   num2 = pegarnumero.nextInt();
			   soma = num1+num2;   
			   diferenca = num1 - num2;
			   produto= num1 * num2;
			   media = soma/2;
			   
			        System.out.println("Soma -" + soma);
			        System.out.println("Diferen�a -" + diferenca);
			        System.out.println("Produto -" + produto );
			        System.out.println("Media -" + media);
			   
			    }
			   
			           
			          
			}
