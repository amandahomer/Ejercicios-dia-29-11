/**Este programa muestra los numeros del 320 al 160, de 20 en 20, hacia atrás.
*AmandaNR*/

public class Ejercicio6L {

	public static void main (String [] args) {
	
		int i = 320;
		
		do {
			System.out.println(i);
			i -= 20;
		} while (i >= 160);
	
	}
}
