package lista03;


public class L03Questao03 {

	public static void main(String[] args) {
		int x =1 ;
		int soma = 0;
		
		for (int i = 1; i<=99; i+=2){
			System.out.println(i+ "/" + x);
			x++;
			soma = soma+(i/x);
			
			
			
		}
		System.out.println(" A Soma dos numeros � : " +soma);
		

	}

}
