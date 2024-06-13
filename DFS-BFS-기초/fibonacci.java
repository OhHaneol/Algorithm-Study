import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] fibo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        fibo = new int[n + 1];
        fibonacci(n);
        for (int i = 1; i < fibo.length; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }
}
