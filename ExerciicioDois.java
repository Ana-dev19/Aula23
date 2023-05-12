import java.util.Scanner;

public class ExerciicioDois {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o número de funcionários: ");
            int numFuncionarios = input.nextInt();

            double somaSalarios = 0;

            for (int i = 1; i <= numFuncionarios; i++) {
                System.out.print("Digite o salário do funcionário " + i + ": ");
                double salario = input.nextDouble();
                somaSalarios += salario;
            }

            double mediaSalarios = somaSalarios / numFuncionarios;

            System.out.println("Média salarial: " + mediaSalarios);
        }
    }
