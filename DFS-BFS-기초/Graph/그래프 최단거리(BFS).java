import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();  // 여기서 큐는, 아직 가보지 않은 간선이 남은 노드를 저장하는 공간이다.
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();          // cv : current vertex
            for (int nv : graph.get(cv)) {  // nv : next vertex
                if (ch[nv] == 0) {          // 기본적으로, '가본 적 없는 노드로 간다 -> 체크한다 -> 큐에 넣는다 -> 거리를 추가한다' 이 순서로 진행.
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {              // 0 부터 n 까지 n + 1 개를 해야 함! 마지막 노드인 6에서 출발하는 방향도 있기 때문.
            graph.add(new ArrayList<Integer>());    // 각 정점의 인접리스트 생성
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);                    // 정점 a 에서 갈 수 있는 정점 b 추가
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
