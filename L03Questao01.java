package lista03;

import java.util.Scanner;

public class L03Questao01 {

	public static void main(String[] args) {

		        @SuppressWarnings("resource")
				Scanner entrada = new Scanner (System.in);  
		       
		        //Declarando variaveis
		        int num[] = new int[15];  
		        int maior = num[0], menor = Integer.MAX_VALUE;   
		        
		        for(int i = 0; i < num.length; i++){  
		           
		        	System.out.print("Informe o " +(i+1)+"� valor: ");  
		            num[i] = entrada.nextInt();  
		            if(num[i] > maior){   
		                maior = num[i];  
		            }  
		        }  
				for (int n = 0; n < num.length; n++) {  
		            if(num[n] < menor){  
		                menor = num[n];  
		            }  
		        }  
		        System.out.println(" O Maior valor � = "+ maior);  
		        System.out.println("Menor valor � = "+ menor);  
		    }  
		}
