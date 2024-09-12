package lista02;

public class Quest08 {

	public static void main(String[] args) {

		double dogao,doguinho,paovo,hamb,refri,val; 
		dogao = 5.5; 
		doguinho = 3; 
		paovo = 3.3; 
		hamb = 5.6; 
		refri = 4.5; 
		val = 0; 
		
		int quant,cod; 
		cod =104;  
		quant = 2; 

		
		if(cod == 100 ) {
			val = doguinho * quant; 
			System.out.println("Doguingo valor un: R$"+doguinho); 
			System.out.println("Valor do pedido: R$"+val); 
		}else if(cod == 101) {
			val = dogao * quant; 
			System.out.println("Dogão valor un: R$"+dogao); 
			System.out.println("Valor do pedido: R$"+val); 
		}else if(cod == 102) {
			val = paovo * quant; 
			System.out.println("Pão com ovo valor un: R$"+paovo); 
			System.out.println("Valor do pedido: R$"+val); 
		}else if(cod == 103) {
			val = hamb * quant; 
			System.out.println("Hamburguer valor un: R$"+hamb); 
			System.out.println("Valor do pedido: R$"+val);  
		}else if(cod == 104) {
			val = refri * quant; 
			System.out.println("Refrigerante valor un: R$"+refri); 
			System.out.println("Valor do pedido: R$"+val);  
		}else {
			System.out.println("CODIGO INVALIDO");
		}
		
		
		
		
		
		
		/*
		double dogao,doguinho,paovo,hamb,refri,val; 
		dogao = 5.5; 
		doguinho = 3; 
		paovo = 3.3; 
		hamb = 5.6; 
		refri = 4.5; 
		val = 0; 
		
		int quant,cod; 
		cod =104; 
		quant = 2; 

		switch (cod) { 
		case 100: 
		val = doguinho * quant; 
		System.out.println("Doguingo valor un: R$"+doguinho); 
		System.out.println("Valor do pedido: R$"+val); 
			break; 
		case 101: 
		val = dogao * quant; 
		System.out.println("Dogão valor un: R$"+dogao); 
		System.out.println("Valor do pedido: R$"+val); 
			break; 
		case 102: 
		val = paovo * quant; 
		System.out.println("Pão com ovo valor un: R$"+paovo); 
		System.out.println("Valor do pedido: R$"+val); 
			break; 
		case 103: 
		val = hamb * quant; 
		System.out.println("Hamburguer valor un: R$"+hamb); 
		System.out.println("Valor do pedido: R$"+val);  
			break; 
		case 104: 
		val = refri * quant; 
		System.out.println("Refrigerante valor un: R$"+refri); 
		System.out.println("Valor do pedido: R$"+val);  
			break; 
		default: 
		break; 
		} */
		
		
		
		
		
	}

}
