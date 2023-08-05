package vetorAtividade1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int [] vetor = new int[10];
		int x,somanumero = 0;
		double media = 0;
		
		for (x=0;x<10;x++) {
			System.out.print("Insira o "+(x+1)+"° vetor: ");
			vetor[x] =  ler.nextInt();
		}
		System.out.print("\nElementos nos indices impares: ");
		for (x=1;x<10;x+=2) {
			System.out.print(vetor[x]+ " ");
		}
		System.out.print("\nElementos pares: ");
		for (x=0;x<10;x++) {
			if (vetor[x]%2==0) {
				System.out.print(vetor[x]+" ");
			}
		}
		for (x=0;x<10;x++) {
			somanumero +=vetor[x];
				
		}
		
		media = (double)somanumero/vetor.length;
		
		System.out.print("\nSoma: "+somanumero);
		System.out.printf("\nMédia: %.2f",media);
	}

}
