import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int n;
		
		System.out.println("Digite um numero na sequ�ncia de Fibonacci: ");
		n = scan.nextInt();
		
		while(n > num3) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
		if (n == 0) {
			System.out.println("O n�mero 0 pertence a sequ�ncia de Fibonacci! \nO pr�ximo numero � 1 ");
		}else if (n == num3) {
			System.out.println("O n�mero " + n + " Faz parte da sequ�ncia de Fibonacci! \nO pr�ximo n�mero � : " + (num1 + n));
		}else {
			System.out.println("O n�mero digitado n�o faz parte da sequ�ncia de Fibonacci!");
		}
	}
}
