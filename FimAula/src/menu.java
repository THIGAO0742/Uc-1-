import java.util.Scanner;

public class menu {
	public static Scanner tec = new Scanner(System.in);

	public static int TelaMenu() {
		System.out.println("######### MENU #########");
		System.out.println("1 - EXEBIR OI ");
		System.out.println("2 - PERGUNTAR SEU NOME ");
		System.out.println("3 - CONTINUAR NO MENU");
		System.out.println("4 - SAIR ");
		System.out.println(" ");
		System.out.print("OPÇÃO: ");
		return tec.nextInt();
	}

	public static void ExebirOi() {
		System.out.println(" ");
		System.out.println("###### Exebir Oi ######");
		System.out.println(" ");
		System.out.println("######################");      
		System.out.println("##                  ##");
		System.out.println("##             **   ##");
		System.out.println("##   ||||||||  ||   ##");
		System.out.println("##   ||    ||  ||   ##");
		System.out.println("##   ||    ||  ||   ##");
		System.out.println("##   ||    ||  ||   ##");
		System.out.println("##   ||||||||  ||   ##");
		System.out.println("##                  ##");
		System.out.println("##                  ##");
		System.out.println("######################");
		System.out.println(" ");
		System.out.println(" ");
	}

	public static void PergNome() {
		String nome;

		System.out.println(" ");
		System.out.println("###### Perguntar seu Nome ######");
		System.out.println(" ");
		System.out.print("Qual seu nome? ");
		nome = tec.next();
		System.out.println("MEU NOME É: " + nome);
	}

	public static void continuarMenu() {
		System.out.println(" ");
		System.out.println("###### Continuar Menu ######");
		System.out.println(" ");
	}

	public static void Sair() {
		System.out.println(" ");
		System.out.println("###### Sair ######");
		System.out.println(" ");
		System.out.println(" Saindo...");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		int opcoes = 0;

		while (opcoes != 4) {
			opcoes = TelaMenu();

			switch (opcoes) {
			case 1:
				ExebirOi();
				break;
			case 2:
				PergNome();

				break;
			case 3:
				continuarMenu();
				break;
			case 4:
				Sair();
				break;
			default:
				System.out.println(" ");
				System.out.println("##### Opção invalida ####");
				System.out.println("##### Voltando ao Menu ####");
				System.out.println(" ");
				break;
			}// case
		} // while
		System.out.println("FIM PROGRAMA");

	}//main
}
