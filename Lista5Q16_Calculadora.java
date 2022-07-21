package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q16_Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor de um numero inteiro:");
		int num1 = leia.nextInt();
		System.out.println("Informe mais um n�mero inteiro:");
		int num2 = leia.nextInt();
		
		System.out.println("Utilize do menu abaixo para escolher a opera��o:");
		System.out.println("+ para adi��o");
		System.out.println("- para subtra��o");
		System.out.println("* para multiplica��o");
		System.out.println("/ para divis�o");
		char opera = leia.next().charAt(0);
		
		if (opera != '+' && opera != '-' && opera != '*' && opera != '/') {
			System.out.println("Voc� escoleu uma opera��o inv�lida");
			System.out.println("Tente novamente:");
			System.out.println("+ para adi��o");
			System.out.println("- para subtra��o");
			System.out.println("* para multiplica��o");
			System.out.println("/ para divis�o");
			opera = leia.next().charAt(0);
		}
		
		float resul = 0;
		
		switch (opera) {
			case '+':
				resul = num1+num2;
				System.out.println("O resultado � " + String.format("%.2f", resul));
				break;
			case '-':
				resul = num1-num2;
				System.out.println("O resultado � " + String.format("%.2f", resul));
				break;
			case '*':
				resul = num1*num2;
				System.out.println("O resultado � " + String.format("%.2f", resul));
				break;
			case '/':
				resul = (float) num1/num2;
				System.out.println("O resultado � " + String.format("%.2f", resul));
				break;			
		}

		System.out.print((resul<0) ? "Este n�mero � NEGATIVO" : (resul>0) ? "Este n�mero � POSITIVO" : "Este n�mero � NEUTRO");
		
		
		if (resul%1!=0) {
			System.out.print(", mas N�O � um n�mero INTEIRO");
		} else if (resul==0) {
			System.out.print(" e neutro n�o � par nem �mpar");
		} else if (resul%2==0) {
			System.out.print(" e PAR");
		} else {
			System.out.println(" e IMPAR");
		}
			
		
		leia.close();

	}

}
