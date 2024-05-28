import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Time {
    public int time;
    public char stage;

    public Time(int time, char stage) {
        this.time = time;
        this.stage = stage;
    }
}


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sT = Integer.parseInt(st.nextToken());
            int eT = Integer.parseInt(st.nextToken());
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }

        int answer = solution(n, arr);
        System.out.println(answer);
    }

    /**
     * 결혼식
     * 시간과 상태(도착 or 떠남)를 가지는 class 인 Time 을 만들고, 모든 사람들의 상태를 list 로 만들어서 정렬한다.
     * 정렬할 때는 시간을 기준으로 오름차순이고, 동일 시각일 경우 떠난 사람이 먼저 오게 한다. - cnt 를 먼저 감소시켜야 maxCnt 에 영향을 끼치지 않는다!
     * 중요 - 객체의 기준은 '사람'이 아니다!
     */
    public static int solution(int n, List<Time> arr) {

        int maxCount = 0;       // 최대 인원수
        int tmpCount = 0;       // 타임 블록의 인원수

        // 1. 선택 절차 적용
        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return o1.time != o2.time ? o1.time - o2.time : o1.stage - o2.stage;
            }
        });

        // 2. 적절성 검사
        for (Time time : arr) {
            if (time.stage == 's') {
                ++tmpCount;
            } else if (time.stage == 'e') {
                --tmpCount;
            }

            int max = Math.max(tmpCount, maxCount);
            maxCount = max;
        }

        return maxCount;
    }
}
