import java.util.Scanner;

// Pide 2 números y muestra cual es el mayor, el menor, o si son iguales



public class Ejercicio_2 {

	public static void  main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
	int numero1, numero2;
	
	System.out.println("Introduzca un numero: ");
	
	numero1 = entrada.nextInt();
	System.out.println("introduzca otro numero: ");
	numero2 = entrada.nextInt();
		
	if (numero1<numero2) {
		System.out.println("El numero: "+numero2+ " es mayor");
		
	}
	else if (numero1>numero2){
		System.out.println("El Numero "+numero1+ " es mayor");
		
		
		}
	else {
	System.out.println("Los numeros son iguales");
	
		}
	
	}
}
