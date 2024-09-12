package randon;

import java.util.Random;
import java.util.Scanner;

public class desafio {

	public static int LerNr() {
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite um número de 0 á 10 :");
		return tec.nextInt();
		
	}// TEC

	public static String Ler() {
		Scanner tec = new Scanner(System.in);
		System.out.print("Escolha  PAR ou IMPAR ? :");
		return tec.next().toUpperCase();
	}// TEC

	public static int Ale() {
		Random aleatorio = new Random();
		System.out.print("Maquina: ");
		int ale = aleatorio.nextInt(11);
		System.out.println(ale);
		return ale;
	}//RANDOM

	public static String Result(int Jnum, int Mnum, String escolha) {
		String Win;
		int p1 = Jnum, c1 = Mnum, SomaR;
		SomaR = p1 + c1;

		if (SomaR % 2 == 0) {
			Win = "PAR";
		} else {
			Win = "IMPAR";
		}
		return Win;
	}//Result

	public static void main(String[] args) {
		int P1num, M1num;
		String Vencedor, ImPar;
		System.out.println("// PAR OU IMPAR  //");
		
		P1num = LerNr();
		ImPar = Ler();
		System.out.println("///////////////////////////");
		
		M1num = Ale();
		System.out.println("///////////////////////////");
		
		Vencedor = Result(P1num, M1num, ImPar);
		if (ImPar.equals(Vencedor)) {
			System.out.println("Parabéns Você Venceu!!");
		} else {
			System.out.println("Maquina Venceu!!");
			System.out.println(" Você Perdeu!!");
		}

		
		
	}//MAIN
}
