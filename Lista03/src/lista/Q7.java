package lista;

public class Q7 {

	public static void main(String[] args) {
		int soma = 0, x = 1;
		while (x <= 500) {
			System.out.println(x);
			soma = x + soma;
			x += 2;
		}
		System.out.println("A soma de todos os números é: " + soma);
	}

}
