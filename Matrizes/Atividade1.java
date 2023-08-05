package Matriz;


import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int [][] array = new int [3][3];
		int L, C = 0, SomaP=0,SomaS=0;
		String Principa="",Secundario="";
		
		for (L=0;L<3;L++) {
			for (C=0;C<3;C++) {
				System.out.printf("Insira o valor da posição: [%d][%d]",L,C);
				array [L][C]= ler.nextInt();
				
				if(L==C) {
					Principa += array[L][C];
					SomaP += array[L][C];
				}
				if (L+C==2) {
					Secundario += array[L][C];
					SomaS += array[L][C];
				}
			}
			
		}
		 // Exibir a matriz completa
        System.out.println("\nMatriz:");
        for (L = 0; L < 3; L++) {
            for (C = 0; C < 3; C++) {
                System.out.print(array[L][C] + " ");
            }
            System.out.println();
        }// Quebra de linha após cada linha da matriz
		System.out.println("\nElementos da diagonal principal: "+Principa);
		System.out.println("\nElementos da diagonal Segundario: "+Secundario);
		System.out.println("\nSomatório dos elementos da diagonal principal: "+SomaP);
		System.out.println("\nSomatório dos elementos da diagonal Secundaria: "+SomaS);
		
		
	}

}
