import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 원더랜드(최소스패닝트리)
 * 이어져 있는가?(회로 x)
 * 최소 비용인가?(정렬)
 */
class Edge implements Comparable<Edge> {
    int v1;
    int v2;
    int cost;

    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge e) {
        return this.cost - e.cost;
    }
}

public class Main {

    // 연결된 도시를 저장하는 배열
    static int[] unc;
    static int totalCost = 0;

    // 해당 도시와 연결된 가장 먼 도시를 반환한다.
    public static int Find(int v) {
        if (v == unc[v]) return unc[v];
        else return unc[v] = Find(unc[v]);
    }

    // 두 도시를 연결할 도로를 정하는 함수
    public static void Union(int cityA, int cityB, int cost) {

        int fa = Find(cityA); // cityA 와 연결된 가장 먼 도시 fa
        int fb = Find(cityB); // cityB 와 연결된 가장 먼 도시 fb
        if (fa != fb) {       // 둘이 연결되지 않았을 경우에만(회로가 아닐 경우에만) 연결
            unc[fa] = fb;
            totalCost += cost;
        }
    }

    private static int solution(ArrayList<Edge> arr) {
        // 비용 오름차순으로 정렬
        Collections.sort(arr);  // compareTo() 의 조건을 기준으로

        // 최소 비용이 드는 도시부터 union 시작,
        arr.stream().forEach(edge ->
                Union(edge.v1, edge.v2, edge.cost));


        return totalCost;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());


        unc = new int[v + 1];
        for (int i = 1; i < v + 1; i++) {
            unc[i] = i;
        }

        // 도시를 잇는 비용이 담긴 arr 정의
        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            arr.add(new Edge(v1, v2, cost));
        }

        System.out.println(solution(arr));
    }
}
