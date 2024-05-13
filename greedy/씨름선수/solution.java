import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] spec = new int[n][2];
        StringTokenizer st;
        for (int i = 0; i < spec.length; i++) {
            st = new StringTokenizer(br.readLine());
            spec[i][0] = Integer.parseInt(st.nextToken());
            spec[i][1] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(n, spec);

        System.out.println(answer);
    }

    /**
     * 씨름 선수
     */
    public static int solution(int n, int[][] spec) {

        int cnt = 1;
        int maxWeight = 0;

        // 1. 선택 절차 적용
        Arrays.sort(spec, new Comparator<int[]>() {     // 키 내림차순 정렬
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        maxWeight = spec[0][1]; // 제일 키 큰 사람의 몸무게를 우선 저장한다.

        // 2. 적절성 검사
        for (int i = 1; i < spec.length; i++) {
            if (spec[i][1] > maxWeight) {
                maxWeight = spec[i][1];
                cnt++;
            }
        }

        return cnt;
    }
}
