package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q10_Troco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Favor informar o valor da compra R$:");
		int compra = leia.nextInt();
		System.out.println("Informe o valor do pagamento R$:");
		int pagamento = leia.nextInt();
		
		if (pagamento >= compra) {
			int troco = pagamento - compra;
			int cen = troco/100;
			int dez = (troco%100)/10;
			int uni = ((troco%100)%10);
			System.out.println("O valor do troco é de R$ " + troco);
			System.out.println("Será composto por " + cen + " nota(s) de R$ 100.00, " + dez + " nota(s) de R$ 10.00 e " + uni + " nota(s) de R$ 1.00");
		} else {
			System.out.println("PAGAMENTO NEGADO");
	}
		

		leia.close();
	}

}
