import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int n;
		
		System.out.println("Digite um numero na sequência de Fibonacci: ");
		n = scan.nextInt();
		
		while(n > num3) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
		if (n == 0) {
			System.out.println("O número 0 pertence a sequência de Fibonacci! \nO próximo numero é 1 ");
		}else if (n == num3) {
			System.out.println("O número " + n + " Faz parte da sequência de Fibonacci! \nO próximo número é : " + (num1 + n));
		}else {
			System.out.println("O número digitado não faz parte da sequência de Fibonacci!");
		}
	}
}
