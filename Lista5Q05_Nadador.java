package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q05_Nadador {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Por gentileza digite a idade do nadador:");
		int idade = leia.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("Classificação: Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Classificação: Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Classificação: Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Classificação: Juvenil B");				
		} else {
			System.out.println("Classificação: Adulto");
		}
		
		leia.close();
	}

}
