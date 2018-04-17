package listaex01;
import java.util.Scanner;

public class L01Questao03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	 double PI = 3.14;
	 double altura = 0;
	 double volume;
	 double raio = 0;
		        
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a altura ");
		       
		altura = sc.nextInt();
		System.out.println("Digite o raio ");       
		   raio = sc.nextInt();
		             
		        
		   volume = PI * (raio*raio)*altura;
		   System.out.println(" Raio " + raio);
		       volume = sc.nextInt();
		       
	
		       
		       
		   

	}

}
