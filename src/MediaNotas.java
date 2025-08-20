import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        // Lendo as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            soma = soma + notas[i];
        }

        // Calculando a média
        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);

        sc.close();
    }
}
