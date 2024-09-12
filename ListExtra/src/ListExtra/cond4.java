package ListExtra;

import java.util.Scanner;

public class cond4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int ano;
		System.out.println("ANO BIXESTO?");
		System.out.print("Digite o ano desejado: ");
		ano = tec.nextInt();
		
		if(ano % 4==0) {
			System.out.println(ano+" É um ano Bixesto");
		}else {
			System.out.println(ano+" Não é um ano Bixesto");
		}
		
		
		
		
		
		
		
	}

}
