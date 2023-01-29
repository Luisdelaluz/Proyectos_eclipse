import javax.swing.JOptionPane;

// PEDIR NUMEROS HASTA QUE SE TECLEE UN CERO (0) MOSTRAR LA SUMA DE TODOS LOS NUMEROS INTRODUCIDOS
public class Ejercicio_5 {

	public static void main(String[]args) {

		 int numero,suma=0;
	        do {
	            numero=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
	            suma+=numero;
	        } while (numero!=0);
	        
	        System.out.println("el resultado de la suma es: " + suma);
	        
	    }
		
		
	}
	
	
