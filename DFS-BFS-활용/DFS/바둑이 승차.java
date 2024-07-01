import java.util.Scanner;

class Main {
    static int answer = Integer.MIN_VALUE, c, n;

    public static void DFS(int L, int weighSum, int[] weighs) {
        if (weighSum > c) return;
        if (L == n) {
            answer = Math.max(answer, weighSum);
        } else {
            DFS(L + 1, weighSum + weighs[L], weighs);
            DFS(L + 1, weighSum, weighs);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] weighs = new int[n];
        for (int i = 0; i < weighs.length; i++) {
            weighs[i] = sc.nextInt();
        }
        DFS(0, 0, weighs);
        System.out.println(answer);
    }
}
