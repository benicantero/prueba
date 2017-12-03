// Declara 2 variables numéricas (con el valor que desees) he indica cual es mayor de los dos.
//Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

public class Practica1{                              
	public static void main (String [] args){       
		int valor1 = 50;
		int valor2 = 20;
		if (valor1 == valor2){
			System.out.println("Valores introducidos: " + valor1 + " y " + valor2);
			System.out.println("Los valores introducidos son iguales");
		}
		if (valor1 < valor2){
			System.out.println("Valores introducidos: " + valor1 + " y " + valor2);
			System.out.println( valor1 + " es menor que " + valor2); 
		} else {
			System.out.println("Valores introducidos: " + valor1 + " y " + valor2);
			System.out.println( valor1 + " es mayor que " + valor2);
		}
	}
}