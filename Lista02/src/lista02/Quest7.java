package lista02;

public class Quest7 {

	public static void main(String[] args) {
		
		final double REPROVADO = 4.9;
		final double RECUMAX = 6.9;
		final double RECUMIN = 5;

		final double APROVADO = 7;
		double nota1,nota2,media;
		nota1 = 9.9;
		nota2 = 6.8;
		media = (nota1+nota2)/2;
		
		if(media<=REPROVADO ) {
			System.out.println("Aluno Reprovado");
		}else if(media == RECUMIN || media <= RECUMAX){
			System.out.println("Aluno em Recuperação");
		}else if(media >=APROVADO) {
			System.out.println("Aluno Aprovado");
		}
			
	
				
		
		
	}

}
