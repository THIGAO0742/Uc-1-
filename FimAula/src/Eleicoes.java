import java.util.Scanner;

public class Eleicoes {
	public static Scanner tec = new Scanner(System.in);

	public static int TelaMenu() {
		System.out.println("---------- Votação Síndico ----------");
		System.out.println("1 - Zé ");
		System.out.println("2 - Maria ");
		System.out.println("3 - João ");
		System.out.println("4 - Voto Nulo ");
		System.out.println("5 - Voto em Branco ");
		System.out.println("0 - ENCERRAR VOTAÇÃO ");
		System.out.println(" ");
		System.out.print("VOTO: ");
		return tec.nextInt();
	}
	
	public static void Voto() {
		System.out.println(" ");
		System.out.println("Voto Realizado");
		System.out.println(" ");
	}
	public static void Result(int z, int m, int j, int votNull, int votBranc, int votos) {
		int voto=votos, votNu=votNull ,votBranco= votBranc, zE=z, mA=m, jO=j;
		
		System.out.println("Votos Encerrados");
		System.out.println("Resultado da Eleição");			
		System.out.println("Total de votos : "+voto);
		System.out.println("1- Zé : "+zE);
		System.out.println("2- Maria : "+mA);
		System.out.println("3- João :  "+jO);
		System.out.println("4- Voto Nulo : "+votNu);
		System.out.println("5- Voto em branco :"+votBranco);
		
		if(zE>jO || zE>mA) {
			System.out.println("Vencedor da eleição: Zé, Com "+zE+" Votos.");
		}else if(zE<jO || jO>mA) {
			System.out.println("Vencedor da eleição: João, Com "+jO+" Votos.");	
		}else if(zE<mA || jO<mA) {
			System.out.println("Vencedor da eleição: Maria, Com "+mA+" Votos.");	
		}else if(zE==mA || mA==jO) {
			System.out.println("Empate 2º Turno");	
		}//if
		System.out.println(" ");
		
	}
		
	public static int turno2() {
		System.out.println("---------- Votação Síndico 2° Turno ----------");
		System.out.println("1 -  ");
		System.out.println("2 -  ");
		System.out.println("4 - Voto Nulo ");
		System.out.println("5 - Voto em Branco ");
		System.out.println("0 - ENCERRAR VOTAÇÃO ");
		System.out.println(" ");
		System.out.print("VOTO: ");
		return tec.nextInt();
	}
	


	public static void main(String[] args) {
		int opcoes=7, tTalVot=0, votNul=0, votBran=0, ze=0, maria=0, joao=0; 
		
		while (opcoes != 0) {
			opcoes = TelaMenu();
			
			switch (opcoes) {
			case 1:
				Voto();
				 ze++;
				 tTalVot++;
				break;
			case 2:
				Voto();
				maria++;
				tTalVot++;
				break;
			case 3:
				Voto();
				tTalVot++;
				joao++;
				break;
			case 4:
				Voto();
				tTalVot++;
				votNul++;
				break;
			case 5:
				Voto();
				votBran++;
				tTalVot++;
				break;
			case 0:
				System.out.println("Votações encerradas");
				Result(ze, maria, joao, votNul, votBran, tTalVot);
				break;
	
			default:
				System.out.println(" ");
				System.out.println("##### Opção invalida ####");
				System.out.println("##### Voltando ao Menu de Votação ####");
				System.out.println(" ");
				break;
			}// case
		} // while
		
//2 turno abaixo
		
		if(joao==ze) {
		opcoes=7;
		joao = 0;
		ze=0;
		
		while (opcoes != 0) {
			opcoes = turno2();
			
			switch (opcoes) {
			case 1:
				Voto();
				 ze++;
				 tTalVot++;
				break;
			case 2:
				Voto();
				 joao++;
				 tTalVot++;
				break;
			case 3:
				Voto();
				 votNul++;
				 tTalVot++;
				break;
			case 4:
				Voto();
				 votBran++;
				 tTalVot++;
				break;
			case 0:
				System.out.println("Votos Encerrados");
				System.out.println("Resultado do 2º Turno da Eleição");			
				System.out.println("Total de votos : "+tTalVot);
				System.out.println("1- Zé : "+ze);
				System.out.println("2- joao : "+joao);
				System.out.println("3- Voto Nulo: "+votNul);
				System.out.println("4- Voto em branco :"+votBran);
				if (ze>joao) {
					System.out.println("Vencedor da 2º eleição: Zé, Com "+ze+" Votos.");

				}else { 
					System.out.println("Vencedor da 2º eleição: Zé, Com "+joao+" Votos.");

				}
				break;
			default:
				break;
			}
		}//while
		
		}else if(joao==maria){
			
			opcoes=7;
			joao = 0;
			maria=0;
			
			while (opcoes != 0) {
				opcoes = turno2();
				switch (opcoes) {
				case 1:
					Voto();
					 maria++;
					 tTalVot++;
					break;
				case 2:
					Voto();
					 joao++;
					 tTalVot++;
					break;
				case 3:
					Voto();
					 votNul++;
					 tTalVot++;
					break;
				case 4:
					Voto();
					 votBran++;
					 tTalVot++;
					break;
				case 0:
					System.out.println("Votos Encerrados");
					System.out.println("Resultado do 2º Turno da Eleição");			
					System.out.println("Total de votos : "+tTalVot);
					System.out.println("1- maria : "+maria);
					System.out.println("2- joao : "+joao);
					System.out.println("3- Voto Nulo: "+votNul);
					System.out.println("4- Voto em branco :"+votBran);
					break;
				default:
					break;
				}
			}//while
			
		}else if ( ze==maria){
			
			opcoes=7;
			maria = 0;
			ze=0;
			
			while (opcoes != 0) {
				opcoes = turno2();
				switch (opcoes) {
				case 1:
					Voto();
					 ze++;
					 tTalVot++;
					break;
				case 2:
					Voto();
					 maria++;
					 tTalVot++;
					break;
				case 3:
					Voto();
					 votNul++;
					 tTalVot++;
					break;
				case 4:
					Voto();
					 votBran++;
					 tTalVot++;
					break;
				case 0:
					System.out.println("Votos Encerrados");
					System.out.println("Resultado do 2º Turno da Eleição");			
					System.out.println("Total de votos : "+tTalVot);
					System.out.println("1- Zé : "+ze);
					System.out.println("2- maria : "+joao);
					System.out.println("3- Voto Nulo: "+votNul);
					System.out.println("4- Voto em branco :"+votBran);
					break;
				default:
					break;
				}
			}//while
		
		}//if

		
		
		
		
	}

}
