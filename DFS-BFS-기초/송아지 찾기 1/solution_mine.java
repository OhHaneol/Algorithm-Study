import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static int missingCow(int s, int e) {
        int jumpCnt = 0;
        if(s == e) return 0;
        if (s < e) {
            int i = (e - s) / 5;
            int j = (e - s) % 5;
            if (j > 3) {
                i++;
                jumpCnt = i + 5 - j;
            } else jumpCnt = i + j;
        }
        else {
            jumpCnt = s - e;
        }

        return jumpCnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        System.out.println(missingCow(S, E));
    }
}
