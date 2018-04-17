package listaex01;

import java.util.Scanner;

public class L01Questao02 {

	public L01Questao02() {
		// TODO Auto-generated constructor stub
	}

	
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
	       float f;
	       System.out.println("Entre com a temperatura graus Celsius");
	       float c = entrada.nextInt();
	       
	      
	      
	       f = (9 * c + 160)/5;
	       
	        System.out.println("O valor da temperatura �: " +  f );

	}

}
