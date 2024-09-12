package ListExtra;

import java.util.Scanner;

public class listaextrarept {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in); 
			int n,cont;
			cont = 0;
			System.out.print("Digite o valor desejado: ");
			n = tec.nextInt();
			while(cont<=10) {
				
				System.out.println(n+" * "+cont+" = "+(cont*n));
				cont++;
			}
		
		
		
	}

}	
