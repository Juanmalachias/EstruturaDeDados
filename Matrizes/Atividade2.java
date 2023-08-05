package Matriz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        float[][] array = new float[10][4];
        float[] vetor = new float[10];
        int x, y = 0;

        for (x = 0; x < 10; x++) {
            for (y = 0; y < 4; y++) {
                System.out.printf("\nInsira a nota do " + (x + 1) + "° aluno no bimestre " + (y + 1) + ": ");
                array[x][y] = leia.nextFloat();
            }
        }

        System.out.println("\nMatriz: ");
        for (x = 0; x < 10; x++) {
            for (y = 0; y < 4; y++) {
                System.out.print(array[x][y] + " | ");
            }
            System.out.println();
        }

        // Chamando o método calcularMedias() para calcular as médias dos alunos
        vetor = calcularMedias(array);

        System.out.println("\nMédias de cada aluno:");
        DecimalFormat df = new DecimalFormat("#.#"); // Definindo o formato com uma casa decimal
        for (x = 0; x < 10; x++) {
            System.out.print(df.format(vetor[x]) + " | ");
        }

    }

    // Método para calcular as médias dos alunos
    public static float[] calcularMedias(float[][] matriz) {
        float[] medias = new float[10];
        for (int i = 0; i < 10; i++) {
            float somaNotas = 0;
            for (int j = 0; j < 4; j++) {
                somaNotas += matriz[i][j];
            }
            medias[i] = somaNotas / 4;
        }
        return medias;
    }
}
