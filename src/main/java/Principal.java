
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qntd = 5;
        int vet[] = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite um numero: (" + i + "):");
            vet[i] = Integer.parseInt(leitor.nextLine());
        }
        for (int i = 0; i < qntd / 2; i++) {
            int aux = vet[i];
            vet[i] = vet[qntd - 1 - i];
            vet[qntd - 1 - i] = aux;
        }

        for (int i = 0; i < qntd; i++) {
            System.out.println("Vector (" + i + "):" + vet[i]);
        }
    }
}
