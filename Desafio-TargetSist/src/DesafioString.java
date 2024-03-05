import java.util.Scanner;

public class DesafioString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String texto;
		String fraseInversa = "";
		
		System.out.println("Digite a frase para reverte-la: ");
		texto = scan.next();
		for(int i = texto.length() - 1; i >= 0; i--) {
		
			fraseInversa = fraseInversa + Character.toString(texto.charAt(i));
		}
		System.out.println(fraseInversa);
	}
}
