import java.util.Scanner;

/**Metodo para lectura desde consola
@param string leido desde consola
@return un mensaje en pantalla con saludo
@author Beni
@version 1.0
*/
public class Bienvenido3{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		String nombreCompleto = sc.nextLine();
		sc.close();
		System.out.printf("Hola bienvenido %s%n", nombreCompleto);
	}
}