import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        double[] alturas = {1.6, 1.7, 1.8, 1.9, 2.0, 1.5, 1.4, 1.3, 1.2, 1.1};
        String[] sexos = {"feminino", "masculino", "masculino", "feminino", "masculino", "feminino", "feminino", "masculino", "feminino", "masculino"};

        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];
        double somaAlturasHomens = 0;
        int numMulheres = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (sexos[i].equals("masculino")) {
                somaAlturasHomens += alturas[i];
            } else {
                numMulheres++;
            }
        }

        double mediaAlturasHomens = somaAlturasHomens / (alturas.length - numMulheres);

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturasHomens);
        System.out.println("Número de mulheres: " + numMulheres);



    }
}











