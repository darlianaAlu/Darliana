import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores: ");
        int tamanho = input.nextInt();

        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorSoma = new int[tamanho];
        int vaiUm = 0;

        System.out.println("Digite os elementos do primeiro vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = input.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = input.nextInt();
        }

        for (int i = tamanho-2; i < tamanho; i--) {
            vetorSoma[i + 1] = vetor1[i] + vetor2[i] + vaiUm;
            if (vetorSoma[i + 1] > 9) {
                vetorSoma[i + 1] = vetorSoma[i + 1] % 10;
                vaiUm = 1;
            } else {
                vaiUm = 0;
            }
        }

        vetorSoma[0] = vaiUm;

        System.out.println("A soma dos elementos correspondentes dos vetores é: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorSoma[i] + " ");
        }
        input.close();
    }
}
