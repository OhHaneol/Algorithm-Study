## 📍 문제

### 🧷 설명

아래의 가중치 방향 그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로그램을 작성하세요.

경로가 없으면 impossible 을 출력한다.

<img width=400 src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/5e7e7ebd-dd33-45bb-9d45-00018fe76375">

### 🧷 입력

첫째 줄에는 정점의 수 N과 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결 정보와 거리 비용이 주어진다.

### 🧷 출력

1번 정점에서 각 정점으로 가는 최소 비용을 2번 정점부터 차례대로 출력하세요.

#### 예시 입력  
> 6 9  
> 1 2 12  
> 1 3 4  
> 2 1 2  
> 2 3 5  
> 2 5 5  
> 3 4 5  
> 4 2 2  
> 4 5 5  
> 6 4 5

#### 예시 출력  
> 2 : 11  
> 3 : 4  
> 4 : 9  
> 5 : 14  
> 6 : impossible


## 📍 분석

- 주목해야 할 것은, `dist[]`, `graph`, `PriorityQueue` 이 세 가지 저장소이다.

- **`dist[]`**
  - 최소 비용을 구하기 위해, 원하는 정점으로부터의 최소 비용을 담는 배열 `dist[]` 를 선언하고, `Integer.MAX_VALUE` 로 초기화한다.

- **`graph`**
  - 도착 노드와 그 가중치를 갖는 객체 `Edge` 와, 시작 노트별 `Edge list` 를 갖는 `gragh` 를 이용한다. 이를 그림으로 표현하면 아래와 같다.

    <img width=400 src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/cf3bcda5-527d-41ef-983b-6486387b4e11">

- **`PriorityQueue`**
  - `PriorityQueue` 저장소 `pQ`를 생성하고, 시작 노드인 1 에 대한 비용을 0으로 초기화한다.
  - `pQ` 가 비기 전까지 다음의 과정을 반복한다.
    - 제일 비용이 적게 드는 `edge(최종 노드, 비용)`를 꺼내고, `now` 로 저장한다. 이 때 **객체의 우선순위**는 `Edge` 객체에서 `Comparable` 을 구현하여 정한다. - [PriorityQueue 우선순위 큐 사용법](https://kbj96.tistory.com/49)
    - 만약 현재 노드에 대해, `now`의 비용이 `dist[]`에 있는 now 의 비용보다 클 경우 (논할 가치도 없으므로) continue 한다.
    - (작을 경우)`graph` 의 `now` 노드에 대한 `edge` 리스트에 대해, 도착 노드를 `next`라고 할 때,`dist[]` 에 저장된 `next`까지의 비용이 (현재까지의 비용) + (next 비용) 보다 클 때(비용 바꿔야 할 때) dist[] 의 비용을 변경한다.
    - 그리고 `pQ`에 해당 `edge`를 추가한다.

### 🧷 시간 복잡도
- O(NlogN)
