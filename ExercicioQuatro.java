import java.util.Scanner;

public class ExercicioQuatro {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");

            int num = scanner.nextInt();
            String numStr = Integer.toString(num);

            for (int i = numStr.length() - 1; i >= 0; i--) {
                System.out.print(numStr.charAt(i));
            }
        }
    }
