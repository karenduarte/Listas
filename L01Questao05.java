package listaex01;

import java.util.Scanner;

public class L01Questao05 {

		 public static void main(String[] args) {
		 int numero ,exponecial , total =0;
		 @SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		        
		 System.out.println("Digite numero ");
		 numero = scan.nextInt();
		               
		 System.out.println("Digite o Exponecial ");
		                
		  exponecial = scan.nextInt();
		                
		  int numeroelevado = numero;
		               
		  for(int i =1 ; i!=exponecial;i++)
	 {
		   total = numeroelevado*exponecial; 
		   numeroelevado = total;

		               
	 }
		  System.out.println("O numero :  "+ numero + " , com o expoente "+ exponecial +" , o  total � : " +total );
		    }

		
	}


