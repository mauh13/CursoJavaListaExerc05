package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q18_Vogais {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Por gentileza digite uma letra:");
		char letra = leia.next().charAt(0);
		letra = Character.toLowerCase(letra);
		
		if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
			System.out.println("Est� letra � uma VOGAL.");
		} else	{
			System.out.println("Est� letra � uma CONSOANTE.");
		}

		leia.close();
	}

}
