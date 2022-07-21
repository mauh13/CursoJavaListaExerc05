package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q08_Combustivel {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha o tipo de combustível (g) gasolina, (e) etanol, (d) diesel:");
		char combust = leia.next().charAt(0);
		
		System.out.println("Quantos litros deseja abastecer:");
		float litros = leia.nextFloat();
		
		if (combust == 'g' || combust == 'G') {
			System.out.println("Total a pagar pela gasolina é R$ " + String.format("%.2f",(litros*2.53f)));
		} else if (combust == 'e' || combust == 'E') {
			System.out.println("Total a pagar pelo etanol é R$ " + String.format("%.2f",(litros*2.09f)));
			if (litros >= 30)
			System.out.println("Você ganhou uma troca de óleo");
		} else if (combust == 'd' || combust == 'D') {
			System.out.println("Total a pagar pelo diesel é R$ " + String.format("%.2f",(litros*1.92f)));
		}
		
		
		
		leia.close();

	}

}
