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

        int answer = solution(n, info);

        System.out.println(answer);
    }

    /**
     * 회의실 배정
     *  시작 시간이 느린 회의가 빠른 회의보다 먼저 진행될 수는 없다!  -> X    : 단순히 물리적 규칙이 아니라
     *  회의가 먼저 끝나는 것 부터 선택해나가면 최선의 결과가 나온다!  -> O    : 알고리즘 사고적 규칙 적용하기!
     */
    public static int solution(int n, int[][] info) {

        int cnt = 1;
        int endMeet = 0;

        // 1. 선택 절차 적용
        Arrays.sort(info, ((o1, o2) -> {
            return o1[1] != o2[1]? o1[1] - o2[1] : o1[0] - o2[0] ;   // 회의 끝나는 시간 오름차순 정렬
        }));
        endMeet = info[0][1];       // 제일 먼저 끝나는 회의 시간 저장

        // 2. 적절성 검사
        for (int i = 1; i < info.length; i++) {
            if (endMeet <= info[i][0]) {
                endMeet = info[i][1];
                cnt++;
            }
        }

        return cnt;
    }
}
