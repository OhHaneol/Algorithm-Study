import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


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
     * 최대 수입 스케줄
     * 언제, 얼마를 받을 지가 중요하다.
     * 제일 돈을 많이 주는 순서로 내림차순 정렬 후, 같은 돈을 줄 경우 더 늦게 오는 순으로 내림차순 정렬
     * 각 요청별 강의 마지막날을 우선 선택하고, 모두 선점되어 있을 경우 다음 요청으로.
     */
    public static int solution(int n, int[][] info) {

        int maxFee = 0;
        int totalDate = 0;

        // 1. 선택 절차 적용
        Arrays.sort(info, ((o1, o2) -> {
            return o2[1] - o1[1];
        }));
        totalDate = info[0][1];
        int[] lecCheck = new int[totalDate];    // 강의가 잡힌 날 체크하는 배열

        Arrays.sort(info, ((o1, o2) -> {
            return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
        }));

        // 2. 적절성 검사
        for (int i = 0; i < info.length; i++) {
            int date = info[i][1];
            for (int j = date - 1; j >= 0; j--) {
                if (lecCheck[j] == 0) {     // 강의가 잡히지 않은 날이면
                    lecCheck[j] = 1;        // 강의 예약
                    maxFee += info[i][0];
                    break;
                }
            }
        }

        return maxFee;
    }
}
