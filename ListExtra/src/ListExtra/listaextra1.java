package ListExtra;

import java.util.Scanner;

public class listaextra1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int a;
		int b;
		int c;
		
		System.out.print("O valor original de A = ");
		a=tec.nextInt();
		System.out.print("O valor original de B = ");
		b=tec.nextInt();
		System.out.println("****************************");

		c = a;
		a = b;
		b = c;
		System.out.println("O valor Trocado de A="+a);
		System.out.println("O valor Trocado de B="+b);
		
		
		
		
		
		
		
	}//main

}//class
