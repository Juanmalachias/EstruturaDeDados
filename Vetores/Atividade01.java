package vetorAtividade1;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int x,numero,lugar=11 ;
	int [] vetor = new int[10];
		
	Scanner ler = new Scanner (System.in);
	
	for (x=0;x<10;x++) {
		System.out.print("Insira o "+(x+1)+"° vetor: ");
		vetor[x] = ler.nextInt();
	}
	
	System.out.print("\n\nInsira o numero que deseja encontrar: ");
	numero = ler.nextInt();
	System.out.println("\nVetor = "+Arrays.toString(vetor));
	for(x=0;x<10;x++) {
		if (vetor[x] == numero) {
			lugar=x;
			break;
		}
	}
	if(lugar == 11) {
		System.out.println("O número "+numero+ " não foi encontrado!");
		}
	else {
		
		System.out.print("\nO número "+numero+" está localizado na posição:" +lugar); 
		}

	}

}
