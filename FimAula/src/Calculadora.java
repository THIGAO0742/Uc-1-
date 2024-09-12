import java.util.Scanner;

public class Calculadora {
	public static Scanner tec = new Scanner(System.in);
	
	public static int TelaMenu() {
		
		System.out.println("---------- MENU ----------");
		System.out.println("1 - SOMAR ");
		System.out.println("2 - SUBTRAIR ");
		System.out.println("3 - MULTIPLICAR ");
		System.out.println("4 - DIVIDIR ");
		System.out.println("5 - EXPONENCIAÇÃO ");
		System.out.println("6 - FATORIAL ");
		System.out.println("7 - SAIR ");
		System.out.println(" ");
		System.out.print("OPÇÃO: ");
		
		return tec.nextInt();
	}//menu
	
	public static void Soma() {
		
		double n1,n2,resultado;
		System.out.println(" ");
		System.out.println("---------- SOMA ----------");
		System.out.println(" ");
		System.out.print("Digite o 1° valor da soma:  ");
		n1=tec.nextInt();
		System.out.print("Digite o 2° valor da soma:  ");
		n2=tec.nextInt();
		resultado = n1+n2;
		System.out.print("O resultado da soma:  "+n1+" + "+n2+" = "+resultado);
		System.out.println(" ");
			
	}//SOMA
	
	public static void Sub() {
		double n1,n2,resultado;

		System.out.println("---------- SUBTRAÇÃO ----------");
		System.out.println(" ");
		System.out.print("Digite o 1° valor da subtração:  ");
		n1=tec.nextInt();
		System.out.print("Digite o 2° valor da subtração:  ");
		n2=tec.nextInt();
		resultado = n1-n2;
		System.out.print("O resultado da subtração:  "+n1+" - "+n2+" = "+resultado);
		System.out.println(" ");
	
	}//SUB
	
	public static void Mult() {
		
		double n1,n2,resultado;
		System.out.println(" ");
		System.out.println("---------- MULTIPLICAÇÃO ----------");
		System.out.println(" ");
		System.out.print("Digite o 1° valor da multiplicação:  ");
		n1=tec.nextInt();
		System.out.print("Digite o 2° valor da multiplicação:  ");
		n2=tec.nextInt();
		resultado = n1*n2;
		System.out.print("O resultado da multiplicação:  "+n1+" * "+n2+" = "+resultado);
		System.out.println(" ");
		
	}//MULT
	
	public static void Div() {
		
		double n1,n2,resultado;
		System.out.println(" ");
		System.out.println("---------- DIVISÃO ----------");
		System.out.println(" ");
		System.out.print("Digite o 1° valor da divisão:  ");
		n1=tec.nextInt();
		System.out.print("Digite o 2° valor da divisão:  ");
		n2=tec.nextInt();
		resultado = n1/n2;
		System.out.print("O resultado da divisão:  "+n1+" / "+n2+" = "+resultado);
		System.out.println(" ");
		
	}//DIV
	
	public static void Expo() {
		
		double n1,n2,resultado;
		System.out.println(" ");
		System.out.println("---------- EXPONENCIAÇÃO ----------");
		System.out.println(" ");
		System.out.print("Digite o valor da exponenciação:  ");
		n1=tec.nextInt();
		System.out.print("Digite o expoente da operação:  ");
		n2=tec.nextInt();
		resultado = Math.pow(n1,n2);
		System.out.print("O resultado da exponenciação:  "+n1+" ^ "+n2+" = "+resultado);
		System.out.println(" ");
		
	}//EXPO	
	public static void Fat() {
		
		int n1,resultado=1;
		System.out.println(" ");
		System.out.println("---------- FATORIAL ----------");
		System.out.println(" ");
		System.out.print("Digite o valor que deseja fatorar !:  ");
		n1=tec.nextInt();
		System.out.print(n1+"! = ");
		
		while (n1>=1) {
			resultado = resultado*n1;
			System.err.print(" * "+n1);
			n1--;

		}
		System.out.print(" = "+resultado);
		System.out.println(" ");
		System.out.println("O resultado da fatoração:  " + n1 + "!  =  "+resultado);
		System.out.println(" ");
		
	}//FAT	
	
	public static void Sair() {
		
		System.out.println(" ");
		System.out.println("--------- Sair ---------");
		System.out.println(" ");
		System.out.println(" Saindo...");
		System.out.println(" ");
		
	}//Sair
	
	public static void main(String[] args) {

		int opcoes = 0;

		while (opcoes != 7) {
			opcoes = TelaMenu();

			switch (opcoes) {
			case 1:
				Soma();
				break;
				
			case 2:
				Sub();
				break;
				
			case 3:
				Mult();
				break;
				
			case 4:
				Div();
				break;
				
			case 5:
				Expo();
				break;
				
			case 6:
				Fat();
				break;
			case 7:
				Sair();
				break;
				
			default:
				System.out.println(" ");
				System.out.println("-*-*-*-*-*- Opção invalida -*-*-*-*-*-");
				System.out.println("-*-*-*-*-*- Voltando ao Menu -*-*-*-*-*-");
				System.out.println(" ");
				break;
			}// case
		} // while
		
		System.out.println("*-*-* FIM DO PROGRAMA *-*-*");
		
	}//MAIN
}
