/**Este programa realiza el control de una caja fuerte.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio7 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
	
		int clave = 9933;
		boolean correcto = false;
		int intentos = 4;
		
		do {
			System.out.println("Introduce la combinacion de la caja fuerte (4 digitos):");
			int digitosTeclado = s.nextInt();
			
			if (digitosTeclado == clave) {
				correcto = true;
			} else {
				System.out.println("La clave es incorrecta");
			}
			
		intentos--;
			
		} while ((!correcto) && (intentos > 0));
		
		if (correcto) {
			System.out.println("La clave es correcta");
		} else {
			System.out.println("Has agotado los 4 intentos");
		}
		
	}
}
