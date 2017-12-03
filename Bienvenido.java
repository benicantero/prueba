
import java.util.Scanner;
public class Bienvenido{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println( "Introduce tu nombre");
		String nombre = sc.nextLine();
		sc.close();
		System.out.printf("Bienvenido %s",nombre);
	}
}