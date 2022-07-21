package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q08_Combustivel {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha o tipo de combust�vel (g) gasolina, (e) etanol, (d) diesel:");
		char combust = leia.next().charAt(0);
		
		System.out.println("Quantos litros deseja abastecer:");
		float litros = leia.nextFloat();
		
		if (combust == 'g' || combust == 'G') {
			System.out.println("Total a pagar pela gasolina � R$ " + String.format("%.2f",(litros*2.53f)));
		} else if (combust == 'e' || combust == 'E') {
			System.out.println("Total a pagar pelo etanol � R$ " + String.format("%.2f",(litros*2.09f)));
			if (litros >= 30)
			System.out.println("Voc� ganhou uma troca de �leo");
		} else if (combust == 'd' || combust == 'D') {
			System.out.println("Total a pagar pelo diesel � R$ " + String.format("%.2f",(litros*1.92f)));
		}
		
		
		
		leia.close();

	}

}
