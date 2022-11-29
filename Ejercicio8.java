/**Este programa muestra la tabla de multiplicar de un numero introducido 
*por teclado.
*AmandaNR*/

public class Ejercicio8 {

	public static void main (String [] args) {
	
		System.out.print("Introduce un numero para mostrar su tabla de multiplicar: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero +" x "+ i +" = "+ numero * i);
		}
		
	}
}
