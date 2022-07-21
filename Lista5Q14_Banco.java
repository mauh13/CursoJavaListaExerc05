package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q14_Banco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Favor informar o saldo m�dio do �ltimo ano:");
		float saldo = leia.nextFloat();
		
		if (saldo<=200) {
			System.out.println("N�o h� cr�dito dispon�vel.");
		} else if (saldo>200 && saldo<=400) {
			System.out.println("Voc� tem um cr�dito de R$ " + String.format("%.2f",saldo*0.2));
		} else if (saldo>400 && saldo<=600) {
			System.out.println("Voc� tem um cr�dito de R$ " + String.format("%.2f",saldo*0.3));
		} else if (saldo>600) {
			System.out.println("Voc� tem um cr�dito de R$ " + String.format("%.2f",saldo*0.4));
		}

		leia.close();

	}

}
