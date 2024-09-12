package modulos;

public class porcedimento {

	public static void imprimir(int x, String nm) {

		System.out.println("Favor preencher os dados:");
		System.out.println("Nome:" + nm);
		System.out.println("Endereço:");
		System.out.println("Telefone:");
		System.out.println("Idade:" + x);

	}

	public static void main(String[] args) {

		imprimir(18, "Thiago");
		System.out.println("OUTRO TEXTO");
		imprimir(147, "Moises");

	}

}
