import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 다익스트라
 */
class Edge implements Comparable<Edge> {
    public int vex;     // 정점
    public int cost;    // 비용

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost;
    }
}

public class Main {
    static ArrayList<ArrayList<Edge>> graph;    // 연결된 인덱스 대신 객체를 넣은 것!
    static int[] dist;   // 각 노드의 값에 정점으로부터의 비용을 담는다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 노드의 개수
        int m = Integer.parseInt(st.nextToken());   // 연결 개수

        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Edge>());       // 밑에서 m번 주어질, 각 시작 노드별 edge(도착 노드와 비용)의 list 를 저장하는 list
        }

        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // u -> v 로 가는 가중치 cost
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, cost));    // 시작 노드 u의 list 를 가져와서, 도착노드 v와 비용 cost 를 list 에 추가한다.
        }

        dijkstra(1);  // 정점 1로부터의 비용 계산

        for (int i = 2; i <= n; i++) {
            if (dist[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dist[i]);
            else System.out.println(i + " : impossible");
        }
    }

    public static void dijkstra(int start) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.add(new Edge(start, 0));    // 시작 노드에 대해서 초기화
        dist[start] = 0;                    // 1 자신에 대한 비용 0으로 초기화

        // now 는 현재까지 가장 적은 비용을 갖는 최종 노드, next 는 now 에서 출발한 도착 노드(다음으로 알고 싶은, pQ 에 추가될지는 모르는 노드)
        while (!pQ.isEmpty()) {
            Edge now = pQ.poll();           // 제일 작은 비용에 해당하는 edge 꺼내기
            if (now.cost > dist[now.vex]) continue;  // 현재 비용이 기존에 구한 최소비용보다 클 경우 제외

            for (Edge next : graph.get(now.vex)) {  // 각 시작 노드에 해당하는 edge 리스트에 대한 로직
                if (dist[next.vex] > now.cost + next.cost) {    // dist 에 저장된 next 에 대한 비용이, 현재까지의 비용과 next 에 대한 비용의 합보다 클 때(비용 바꿔야 할 때)
                    dist[next.vex] = now.cost + next.cost;
                    pQ.add(new Edge(next.vex, dist[next.vex])); // 최소 비용 추가
                }
            }
        }
    }
}
