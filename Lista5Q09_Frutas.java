package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q09_Frutas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o fruto (laranja, limão ou morango):");
		String fruta = leia.nextLine();
		System.out.println("Imforme o valor da unidade:");
		float valor = leia.nextFloat();
		
		switch (fruta) {
		case "laranja":
			System.out.println("Uma caixa de laranja custa R$ " + String.format("%.2f", (valor*60)));
			break;
		case "limão":
			System.out.println("Uma caixa de limão custa R$ " + String.format("%.2f", (valor*80)));
			break;
		case "morango":
			System.out.println("Uma caixa de morango custa R$ " + String.format("%.2f", (valor*20)));
			break;
		default: 
			System.out.println("Esta fruta não esta cadastrada");
			System.out.println("Favor informar quantas frutas cabem numa caixa");
			int quant = leia.nextInt();
			System.out.println("Uma caixa de " + fruta + " custa R$ " + String.format("%.2f", (valor*quant)));
		}
	

	leia.close();

	}

}
