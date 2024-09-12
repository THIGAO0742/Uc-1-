package ListExtra;

import java.util.Scanner;

public class cond8 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		final double LMTPESO = 50;
		final double MULTA = 12;
		
		double pesoPesca,pesoExdente,multaPgar;
		pesoExdente = 0;
		multaPgar = 0;
		System.out.print("Peso pescado:");
		pesoPesca = tec.nextDouble();
		
		if(pesoPesca > LMTPESO ) {
			pesoExdente = pesoPesca - LMTPESO;
			multaPgar = pesoExdente * MULTA;
			System.out.println("peso da pessca passou do limite permetido!!");
			System.out.println("Valor da Multa "+multaPgar);
		}else {
			System.out.println("Peso da pesca dentro do limite");

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
