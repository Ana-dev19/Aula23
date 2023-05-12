import java.util.Scanner;

public class ExercicioTres {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int num = input.nextInt();
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println(num + " é múltiplo de 5 e 7.");
            } else {
                System.out.println(num + " não é múltiplo de 5 e 7.");
            }
        }
    }
