package ListExtra;

import java.util.Scanner;

public class listaExtra2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		
		System.out.print("Digite um valor: ");
		n1=tec.nextInt();
		System.out.print("Digite um valor: ");
		n2=tec.nextInt();
		System.out.print("Digite um valor: ");
		n3=tec.nextInt();
		System.out.print("Digite um valor: ");
		n4=tec.nextInt();
		System.out.println(" ");
		
				
		double quad1 = Math.pow(n1, 2);
		double quad2 =Math.pow(n2, 2);
		double quad3 = Math.pow(n3, 2);
		double quad4 = Math.pow(n4, 2);
		
		System.out.println("O quadrado de "+ n1 +" é:"+quad1);	
		System.out.println("O quadrado de "+ n2 +" é:"+quad2);	
		System.out.println("O quadrado de "+ n3 +" é:"+quad3);	
		System.out.println("O quadrado de "+ n4 +" é:"+quad4);	

					
	}

}
