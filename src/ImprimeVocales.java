import java.util.Scanner;

public class ImprimeVocales {


	void imprimeVocales1 (String cadena){
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if (!"AEIOUaeiou".contains(Character.toString(letra)))
				continue;
			System.out.print(letra);
		}
		System.out.println("");
	}
	
	void imprimeVocales2 (String cadena){
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if ("AEIOUaeiou".contains(Character.toString(letra)))
				System.out.print(letra);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		//Inicialización y Entrada
		System.out.print("Introduzca una cadena de texto: ");
		Scanner sc = new Scanner (System.in);
		String texto = sc.nextLine();
		ImprimeVocales programa = new ImprimeVocales();
		
		//Proceso y Salida
		System.out.println("Vocales por el Método 1: ");
		programa.imprimeVocales1 (texto);
		System.out.println("Vocales por el Método 2: ");
		programa.imprimeVocales2 (texto);
	}
}
