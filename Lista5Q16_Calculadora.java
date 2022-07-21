package lista05_EstruturasDeSelecao;

import java.util.Scanner;

public class Lista5Q16_Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor de um numero inteiro:");
		int num1 = leia.nextInt();
		System.out.println("Informe mais um número inteiro:");
		int num2 = leia.nextInt();
		
		System.out.println("Utilize do menu abaixo para escolher a operação:");
		System.out.println("+ para adição");
		System.out.println("- para subtração");
		System.out.println("* para multiplicação");
		System.out.println("/ para divisão");
		char opera = leia.next().charAt(0);
		
		if (opera != '+' && opera != '-' && opera != '*' && opera != '/') {
			System.out.println("Você escoleu uma operação inválida");
			System.out.println("Tente novamente:");
			System.out.println("+ para adição");
			System.out.println("- para subtração");
			System.out.println("* para multiplicação");
			System.out.println("/ para divisão");
			opera = leia.next().charAt(0);
		}
		
		float resul = 0;
		
		switch (opera) {
			case '+':
				resul = num1+num2;
				System.out.println("O resultado é " + String.format("%.2f", resul));
				break;
			case '-':
				resul = num1-num2;
				System.out.println("O resultado é " + String.format("%.2f", resul));
				break;
			case '*':
				resul = num1*num2;
				System.out.println("O resultado é " + String.format("%.2f", resul));
				break;
			case '/':
				resul = (float) num1/num2;
				System.out.println("O resultado é " + String.format("%.2f", resul));
				break;			
		}

		System.out.print((resul<0) ? "Este número é NEGATIVO" : (resul>0) ? "Este número é POSITIVO" : "Este número é NEUTRO");
		
		
		if (resul%1!=0) {
			System.out.print(", mas NÃO É um número INTEIRO");
		} else if (resul==0) {
			System.out.print(" e neutro não é par nem ímpar");
		} else if (resul%2==0) {
			System.out.print(" e PAR");
		} else {
			System.out.println(" e IMPAR");
		}
			
		
		leia.close();

	}

}
