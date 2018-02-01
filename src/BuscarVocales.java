import java.util.Scanner;

public class BuscarVocales {

	boolean tieneVocales1 (String cadena){
		boolean hayVocales = false;
		int i = 0;
		while (i < cadena.length()) {
			if ("AEIOUaeiou".contains(Character.toString(cadena.charAt(i)))){
				hayVocales = true;
				break;
			}
			i++;
		}
		return hayVocales;
	}
	
	boolean tieneVocales2 (String cadena){
		boolean hayVocales = false;
		int i = 0;
		while (i < cadena.length() && !hayVocales) {
			if ("AEIOUaeiou".contains(Character.toString(cadena.charAt(i))))
				hayVocales = true;
			i++;
		}

		return hayVocales;
	}
	
	public static void main(String[] args) {
		//Inicialización y Entrada
		System.out.print("Introduzca una cadena de texto: ");
		Scanner sc = new Scanner (System.in);
		String texto = sc.nextLine();
		BuscarVocales programa = new BuscarVocales();
		
		//Proceso y Salida
		if (programa.tieneVocales1(texto)) 
			System.out.println("Método 1: Tiene vocales");
		else
			System.out.println("Método 1: No tiene vocales");
		
		if (programa.tieneVocales2(texto)) 
			System.out.println("Método 2: Tiene vocales");
		else
			System.out.println("Método 2: No tiene vocales");
	}
}
