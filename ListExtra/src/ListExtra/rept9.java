package ListExtra;

import java.util.Scanner;

public class rept9 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		int soma=0,n;
		double media=0;
		System.out.print("Digite um valor para ser somado: ");
		n=tec.nextInt();
		
		for(int i = 0; i<=n;i++) {	
			soma+=i;
			System.out.println(soma);
			
		}
		media = soma/n;
		System.out.println("A soma de total é: "+soma);
		System.out.println("A media dos numeros somados é:"+media);
	}
	
	
	
	

}
