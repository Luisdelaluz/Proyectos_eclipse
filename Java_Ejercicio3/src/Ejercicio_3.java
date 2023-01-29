// Pide dos números por teclado, los suma y muestra el resultado

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Ejercicio_3 {
	public static void main (String[] args){
	
	/*float numero1, numero2, resultado;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("introduzca 1 numero: ");
		numero1 = entrada.nextFloat();
		System.out.println("Introduzca un segundo numero: ");
			
		numero2 = entrada.nextFloat();	
		
		resultado = numero1 + numero2;
		
		
		System.out.println( "La suma de los numeros es: "+ Math.round(resultado));
	*/
		
		double numero1,numero2, suma;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("introduzca un numero: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("introduzca otro numero: "));
		
		suma = numero1+numero2;
		
		JOptionPane.showMessageDialog(null, "La suma de los numeros es: "+ suma);
		
		
		
		
	
		
		
		
	}
	

}
