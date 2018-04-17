package listaex02;

import java.util.Scanner;

public class L02Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int lado1;
        int lado2;
        int lado3; 
        
        @SuppressWarnings("resource")
		Scanner triangulo = new Scanner(System.in);
        
        System.out.println(" Digite o Lado 1 do triangulo");
        lado1 = triangulo.nextInt();
        
         System.out.println(" Digite o Lado 2 do triangulo");
         lado2 = triangulo.nextInt();
         
         System.out.println(" Digite o Lado 3 do triangulo");
         lado3 = triangulo.nextInt();
         
         if ( (lado1 + lado2 > 3) || (lado2 + lado3 > lado1) && (lado3 + lado1 > 2) ){
       	  System.out.println("Refere-se ao triangulo");
             
       
   }
         //Comparando se � um triangulo
          if (lado1 == lado2 && lado1 == lado3){
       	   System.out.println("Os tres lados s�o iguais. � um triangulo Equil�tero");
          }else if (lado1 == lado2 || lado1 == lado3){
       	   System.out.println("Os dois lados s�o iguais. � um triangulo Isosceles ");
          }else
       	   System.out.println("Tr�s lados diferentes.");
          
          }
         
        
        
        
        
        
   
   


	}


