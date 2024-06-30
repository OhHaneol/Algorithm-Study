import java.util.Scanner;

class Main {
    static int n;
    static int total = 0;
    static String answer = "NO";

    public static void DFS(int L, int sum, int[] arr) {
        if (L == n) {
            if (sum * 2 == total) {
                answer = "YES";
                return;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
