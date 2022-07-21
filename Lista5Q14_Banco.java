package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q14_Banco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Favor informar o saldo médio do último ano:");
		float saldo = leia.nextFloat();
		
		if (saldo<=200) {
			System.out.println("Não há crédito disponível.");
		} else if (saldo>200 && saldo<=400) {
			System.out.println("Você tem um crédito de R$ " + String.format("%.2f",saldo*0.2));
		} else if (saldo>400 && saldo<=600) {
			System.out.println("Você tem um crédito de R$ " + String.format("%.2f",saldo*0.3));
		} else if (saldo>600) {
			System.out.println("Você tem um crédito de R$ " + String.format("%.2f",saldo*0.4));
		}

		leia.close();

	}

}
