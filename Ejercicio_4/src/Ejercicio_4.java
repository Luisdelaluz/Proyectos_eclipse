import javax.swing.JOptionPane;

public class Ejercicio_4 {
	public static void main(String[]args) {
	  int numero, cont = 0;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      
      while(numero != 0){
          JOptionPane.showMessageDialog(null,"Ha ingresado el numero: "+numero);
          cont++;
          
          numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
      }
      JOptionPane.showMessageDialog(null,"Numero no válido. Ingresó un total de "+cont+" numeros.");
  }

	
	
}
