package recursion;

public class RecursionPractice02 {
        public static void main(String[] args) {
            int result = productRecursively(4);
            System.out.println(result);
        }

        public static int productRecursively(int n) {
            if (n == 1) {
                return 1;
            }

            return n * productRecursively(n - 1);
        }
    }

