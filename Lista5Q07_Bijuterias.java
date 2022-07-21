package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q07_Bijuterias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor da compra (R$):");
		float valor = leia.nextInt();
		System.out.println("Pagamento em dinheiro (d) ou cheque (c)?");
		char pagamento = leia.next().charAt(0);

		if (valor >= 100 && (pagamento=='d' || pagamento=='D')) {//se usar dois op. lógicos 'agrupar' eles
			System.out.println("Valor com desconto R$ " + String.format("%.2f",(valor-(valor*0.1))));
		} else {
			System.out.println("Valor a ser pago R$ " + String.format("%.2f",valor));
		}
		
		

		leia.close();
		

	}

}
