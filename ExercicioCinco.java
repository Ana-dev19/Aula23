public class ExercicioCinco {
        public static void main(String[] args) {
            for (int i = 100; i <= 150; i++) {
                int num = i;
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
