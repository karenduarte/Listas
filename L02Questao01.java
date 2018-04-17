package listaex02;

import java.util.Scanner;

public class L02Questao01 {

	public static void main(String[] args) {
		 int num1;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o n�mero");
			num1 = sc.nextInt();
			
			if (num1%2 == 0){
				System.out.println("O numero � Par");
			}else{
				System.out.println("O numero � Impar");
			}
				
				if(num1 < 0){
				System.out.println("O numero � Negativo");
				}else{
				System.out.println("O numero � Positivo");
				}
	                        
	    }
	    
	

	}


