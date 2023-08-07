package Atividade02;

import java.util.Scanner;

public class V2Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		float [][] arraynotas = new float [10][4];
		float[] media = new float [10];
		int x,y;
		double soma=0;
		
		for (x=0;x<10;x++) {
			for (y=0;y<4;y++) {
				System.out.printf("\nInsira a "+(y+1)+" nota do "+(x+1)+"° aluno: ");
				arraynotas [x][y] = leia.nextFloat();
			}
		}
		System.out.println("\nMatriz de notas:");
		for (x=0;x<10;x++) {
			for (y=0;y<4;y++) {
				System.out.print(arraynotas [x][y] + " | " );
			}
			System.out.println();
		}
		System.out.println("\nMédias de cada aluno:");
		for (x = 0; x < 10; x++) {
			soma = 0;
			
			for (y=0;y<4;y++) {
				soma += arraynotas[x][y];
			}
			media[x] = (float) (soma/4);
		}
		for (float m : media) {
            System.out.printf(" %.1f |",m);
		}
	}	
}