import java.util.Arrays;
import java.util.Scanner;

public class Algoritmos {
    
    // Verifica se um número é primo
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Soma um conjunto de números
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Máximo divisor comum (MDC)
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Quicksort para ordenação
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Contagem de valores inteiros em um conjunto de dados
    public static int countInRange(int[] data, int N) {
        int count = 0;
        for (int num : data) {
            if (num >= data[0] && num <= N) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Teste das funções
        System.out.println("Digite um número para verificar se é primo:");
        int num = scanner.nextInt();
        System.out.println("É primo? " + isPrime(num));

        System.out.println("Digite um número para calcular o Fibonacci:");
        int fibNum = scanner.nextInt();
        System.out.println("Fibonacci(" + fibNum + ") = " + fibonacci(fibNum));

        System.out.println("Digite dois números para calcular o MDC:");
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println("MDC = " + gcd(a, b));
        
        scanner.close();
    }
}
