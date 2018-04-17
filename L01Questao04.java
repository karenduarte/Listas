package listaex01;

import java.util.Scanner;

public class L01Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int valorX;
		 int valorY;
		 int varAB;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println( "Informe o valor da primeira vari�vel");
		 valorX = scan.nextInt();
		
		 System.out.println( "Informe o valor da segunda vari�vel");
		 valorY = scan.nextInt();
		 
		 
		varAB = valorX;
		
		valorX = valorY;
		
		valorY = varAB;
		 
		 
		 System.out.println( "O resultado do valor de X � : " + valorX);
		 System.out.println ("O resultado de valor de Y � : " + valorY);
		 scan.close();
		 
	}

}
