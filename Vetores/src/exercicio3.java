import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		int[] idade = new int[5];
		String[] nome = new String[5];
		int maior18 = 0;
		
		for(int x = 0; x < idade.length;x++ ) {
			
			System.out.print("Digite seu nome: ");
			nome[x]= tec.next();
			System.out.print("Digite sua Idade: ");
			idade[x]= tec.nextInt();
		}//for nome/ idade
		System.out.println("***************************");
		System.out.println("Quantidade de pessoas Maiores de 18: "+maior18);
		for(int  x = 0; x< idade.length;x++ ) {
			if (idade[x]>18) {
				System.out.println("Nome: "+nome[x]+" Idade: "+idade[x]);
				maior18++;
			}//if 			
		}//for impressao idade/nome >=18
		
		System.out.println("***************************");

	
		
		
		
		
		
		
	}

}
