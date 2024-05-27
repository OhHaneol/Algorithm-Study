import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] info = new int[n][2];
        StringTokenizer st;
        for (int i = 0; i < info.length; i++) {
            st = new StringTokenizer(br.readLine());
            info[i][0] = Integer.parseInt(st.nextToken());
            info[i][1] = Integer.parseInt(st.nextToken());
        }

        int[][] answer = solution(n, info);
        String str = "";

        for (int i = 0; i < answer.length; i++) {
            str += answer[i][0];
            str += " ";
            str += answer[i][1];
            str += "\n";
        }

        System.out.print(str);
    }

    /**
     * 좌표 정렬
     */
    public static int[][] solution(int n, int[][] info) {

        Arrays.sort(info, ((o1, o2) -> {
            return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
        }));

        return info;
    }
}
