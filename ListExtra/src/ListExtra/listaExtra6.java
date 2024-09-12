package ListExtra;

import java.util.Scanner;

public class listaExtra6 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double n1,n2,n3,n4,media;
		String aluno;
		System.out.print("Nome do aluno: ");
		aluno=tec.next();
		System.out.print("1° Un:: ");
		n1 =tec.nextDouble();
		System.out.println("2° Un: ");
		n2 = tec.nextDouble();
		System.out.println("3° Un: ");
		n3 =tec.nextDouble();
		System.out.println("4° Un: ");
		n4 =tec.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Aluno: "+aluno);
		System.out.println("1ª Nota: "+n1);
		System.out.println("2º Nota: "+n2);
		System.out.println("3ª Nota: "+n3);
		System.out.println("4ª Nota: "+n4);
		System.out.println("Media das notas : "+media);

	}

}
