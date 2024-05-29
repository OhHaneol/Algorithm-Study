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
     * 강의 일자를 기준으로 내림차수 정렬 후, 같은 일자일 경우 돈을 많이 주는 순서로 내림차순 정렬.
     * pQ 저장소를 만들고, 배열을 순회하며 각 강의료를 pQ 에 넣는다.
     * 일자가 바뀔 때마다 break 하고, pQ 에서 가장 큰 값을 poll() 하여 pQ 에서 삭제와 동시에 반환, 해당 값을 총 강의료에 더한다.
     */
    public static int solution(int n, int[][] info) {

        int maxFee = 0;
        int totalDate = 0;

        // 1. 선택 절차 적용
        Arrays.sort(info, ((o1, o2) -> {
            return o2[1] - o1[1];
        }));
        totalDate = info[0][1];
      

        // 2. 적절성 검사

        // 우선 순위 큐는 기본적으로 작은 값 우선인데, reverseOrder() 를 이용해서 큰 값 우선으로 변경
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        int j = 0;
        for (int i = totalDate; i >=1 ; i--) {
            for (; j < n ; j++) {
                if(info[j][1] < i) break;
                pQ.offer(info[j][0]);
            }
            if(!pQ.isEmpty()) maxFee += pQ.poll();
        }

        return maxFee;
    }
}
