package ListExtra;

import java.util.Scanner;

public class rept8 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int id,maior=0;
		
		System.out.println("Digite a idade das pesoas:");
		
		for(int x = 0; x <5; x++ ) {
			System.out.print(x+"º idade: ");
			id=tec.nextInt();
			if(id>=18) {
				maior++;
				}//if
		}//for
	
		System.out.println("Maiores de 18: "+maior+ " pessoas");

		
		
		
		
		
	}

}
