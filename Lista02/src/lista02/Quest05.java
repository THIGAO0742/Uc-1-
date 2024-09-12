package lista02;

public class Quest05 {

	public static void main(String[] args) {
		
		final double VELMAX = 80; 

		final double MULTA = 5; 

		double vel,multaPagar,velAcima; 

		multaPagar = 0; 

		velAcima = 0; 

		vel = 82; 

		if(vel <= VELMAX) { 

		System.out.println("Velocide Permitida"); 

		}else { 

		velAcima = vel - VELMAX; 

		multaPagar = MULTA * velAcima; 

		System.out.println("Velocidade Acima da via, Multa a PAGAR: R$"+multaPagar); 

		} 
		
		
	}

}
