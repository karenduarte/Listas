package listaex02;

import javax.swing.JOptionPane;

public class L02Questao03 {
	public static void main(String[] args) {
	int nota1;
	int nota2 ;
	int nota3 ;
	int media;

	//Informando as notas 
	
	nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota"));
	nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota"));
	nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira nota")); 
	media = (nota1 + nota2 + nota3)/ 3;
	
	JOptionPane.showMessageDialog(null, "O Total da m�dia �: " + media);
	   

}
}
