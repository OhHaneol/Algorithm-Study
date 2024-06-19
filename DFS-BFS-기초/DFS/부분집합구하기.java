public class Main {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String str = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) str += i + " ";
            }
            if (str.length() > 0) System.out.println(str);
        } else {
            ch[L] = 1;      // 사용하는 경우
            DFS(L + 1);
            ch[L] = 0;      // 사용하지 않는 경우
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        n = 3;
        ch = new int[n + 1];
        T.DFS(1);


    }
}
