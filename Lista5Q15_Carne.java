package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q15_Carne {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha o tipo de carne:");
		System.out.println("f = Filé duplo");
		System.out.println("a = Alcatra");
		System.out.println("p = Picanha");
		char carne = leia.next().charAt(0);
		
		System.out.println("Quantos quilos deseja comprar?");
		float quilos = leia.nextFloat();
		
		System.out.println("Qual forma de pagamento?");
		System.out.println("1 = Cartão");
		System.out.println("2 = Dinheiro");
		int pagto = leia.nextInt();
		
		float valor = 0;
				
		if (carne=='f'||carne=='F') {
			if (quilos <= 5) {
				valor = quilos*4.9f;
				System.out.println("4.90 * " + quilos + " = " + String.format("%.2f", valor));
			} else {
				valor = quilos*5.8f;
				System.out.println("5.80 * " + quilos + " = " + String.format("%.2f", valor));
			}
		} else if (carne=='a'||carne=='A') {
			if (quilos <= 5) {
				valor = quilos*5.9f;
				System.out.println("5.90 * " + quilos + " = " + String.format("%.2f", valor));
			} else {
				valor = quilos*6.8f;
				System.out.println("6.80 * " + quilos + " = " + String.format("%.2f", valor));
			}
		} else if (carne=='p'||carne=='P') {
			if (quilos <= 5) {
				valor = quilos*6.9f;
				System.out.println("6.90 * " + quilos + " = " + String.format("%.2f", valor));
			} else {
				valor = quilos*7.8f;
				System.out.println("7.80 * " + quilos + " = " + String.format("%.2f", valor));
			}
		}
		System.out.println("O valor da compra é de R$ " + String.format("%.2f", valor));
		if (pagto==1) {
			float desconto = valor*0.05f;
			System.out.println("Desconto de R$ " + String.format("%.2f", desconto));
			System.out.printf("Valor tortal a pagar R$ %.2f ", (valor-desconto));
		} else {
			System.out.println("Valor tortal a pagar R$ " + String.format("%.2f",valor));
		}

		leia.close();

	}

}
