import java.util.Scanner;

public class ExercicioSeis {
        public static void main(String[] args) {
            int[][] nums = new int[20][1];
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < nums.length; i++) {
                System.out.print("Digite um número inteiro: ");
                nums[i][0] = scanner.nextInt();
                sum += nums[i][0];
            }
            System.out.println("A soma dos números é: " + sum);
        }
    }
