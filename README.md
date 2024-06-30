# Algorithm-Study
코딩테스트 공부 with 자바

## 목차

1. [DFS - Tree, Recursive(재귀함수)](#-dfs---tree,-recursive(재귀함수))

2. [BFS - 최단거리](#-bfs---최단거리)

3. [Graph - DFS, BFS 이용](#-graph---dfs,-bfs-이용)
  
4. [DFS, BFS 활용](#-dfs,-bfs-활용)
  
5. [Exhaustive Algorithm](#-exhaustive-algorithm)
  
6. [Greedy Algorithm](#-greedy-algorithm)
  
7. [dynamic programming_동적계획법](#-dynamic-programming_동적계획법)
  
8. [Sorting and Searching](#-sorting-and-searching)
  
---

## 📍 DFS - Tree, Recursive(재귀함수)

### 🧷 개념

<img width=300 alt="스택 프레임" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/6dcafb2d-a915-4f17-99fc-d420fa13736d">

- 재귀함수는 다음과 같이 동작한다.
  1. 정해진 '조건' 이전까지는 스택 프레임에 순차적으로 저장된다. 이 때 변수 외에도 해당 함수가 재귀된 순간의 라인 넘버가 저장된다.
  2. '조건'에 이르면, LIFO 형식을 취하는 스택 프레임에 의해 마지막으로 저장된 것 부터 역으로 꺼내어 실행된다.

- 재귀함수의 성능은?
  - 스택프레임이 돌아가니 for 문 등에 비해서 좋지는 않다.
 
- 이진트리에서 DFS 는 자식 노드가 왼쪽과 오른쪽 둘 중 하나만 존재할 경우 Error 가 발생할 수 있다.

### 🧷 문제 풀이

  - [팩토리얼! - Recursive](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/DFS/%ED%8C%A9%ED%86%A0%EB%A6%AC%EC%96%BC_recursive.java)
    
  - [피보나치 출력 - Recursive](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/DFS/Recursive-%ED%94%BC%EB%B3%B4%EB%82%98%EC%B9%98%20%EC%B6%9C%EB%A0%A5.java)
    - 각 피보나치 수를 배열에 저장하는 메모리제이션을 사용하여 이미 구한 수는 건너뛰었다. (성능 향상)
    
  - [이진 트리 순회 - DFS](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/DFS/%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC%EC%88%9C%ED%9A%8C.java)
    - 전위 기준: 하위 루트 노드의 순회 및 출력이 끝나면 백트래킹하고, 상위 루트 노드에서 마찬가지로 로직을 수행한다.

  - [부분집합 구하기 - DFS](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/DFS/%EB%B6%80%EB%B6%84%EC%A7%91%ED%95%A9%EA%B5%AC%ED%95%98%EA%B8%B0.java)
    - 1부터 n 까지의 모든 부분집합을 구하기 위해, 출력 여부(각 부분집합 포함 여부)를 0과 1로 저장하는 ch[] 배열을 저장한다.
    - 만약 단말 노드(n)에 이르를 경우(L == n + 1) ch[] 배열에서 1로 저장된 인덱스만 출력한다.

  - [Tree 말단 노드까지의 가장 짧은 경로 - DFS](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/DFS/Tree%20%EB%A7%90%EB%8B%A8%20%EB%85%B8%EB%93%9C%EA%B9%8C%EC%A7%80%20%EC%B5%9C%EB%8B%A8%EA%B2%BD%EB%A1%9C.java)
    - DFS 는 최단경로에 적합하지 않지만, 공부 차원에서 문제가 나왔다.



## 📍 BFS - 최단거리

### 🧷 개념

- BFS 는 보통 레벨 탐색으로 **최단 거리** 문제에 많이 사용된다.

- 레벨 탐색은 다음과 같이 동작한다.
  1. 맨 처음 `Queue`를 선언한 뒤 루트 노드를 `offer` 한다.
  3. Queue 가 비어 있지 않으면 실행되는 **레벨 반복문**을 시작하고, 각 레벨의 노드 수인 `Q.size` 만큼 **노드 반복문**을 실행한다.
  5. 노드 반복문 내부에서는 필요한 작업과 함께 해당 노드의 자식 노드를 `offer` 한다.
  7. 레벨 반복문의 끝에서 레벨을 높인 뒤 다음 레벨 반복으로 넘어간다.

### 🧷 문제 풀이

  - [이진트리 레벨탐색](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/BFS/%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC%20%EB%A0%88%EB%B2%A8%20%ED%83%90%EC%83%89.java)
  - [송아지 찾기 1](https://github.com/OhHaneol/Algorithm-Study/tree/main/DFS-BFS-%EA%B8%B0%EC%B4%88/BFS/%EC%86%A1%EC%95%84%EC%A7%80%20%EC%B0%BE%EA%B8%B0%201)
  - [Tree 말단 노드까지의 가장 짧은 경로 - BFS](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/BFS/%ED%8A%B8%EB%A6%AC%20%EB%A7%90%EB%8B%A8%20%EB%85%B8%EB%93%9C%EA%B9%8C%EC%A7%80%20%EC%B5%9C%EB%8B%A8%EA%B2%BD%EB%A1%9C.java)


## 📍 Graph - DFS, BFS 이용

### 🧷 개념

1. 무방향 그래프

    | 그래프 | 인접행렬 |
    |:---:|:---:|
    | <img width=300 alt="그래프" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/f6d7dc6d-8ca9-4b8d-b0d3-78187013c103"> | <img width=200 alt="인접행렬" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/f25d4605-9795-449b-ad9e-434f25440bde"> |
     
2. 방향 그래프

    | 그래프 | 인접행렬 |
    |:---:|:---:|
    | <img width=300 alt="그래프" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/9cc621d7-248e-476e-b730-6df8bb47f3c2"> | <img width=200 alt="인접행렬" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/11fc9978-4f35-42de-9031-3cb46038b144"> |

   
3. 가중치 그래프

    | 그래프 | 인접행렬 |
    |:---:|:---:|
    | <img width=300 alt="그래프" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/ca353eb2-c205-4316-ac36-398cb8d2e386"> | <img width=200 alt="인접행렬" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/8801bf0c-99a9-44a7-b2c1-0b32a53b1971"> |

### 🧷 문제 풀이

- [경로 탐색(DFS) - 인접 행렬](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/Graph/%EA%B2%BD%EB%A1%9C%ED%83%90%EC%83%89(DFS).java)

  - 주어진 방향그래프에서 1번 정점으로부터 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 문제. 보통 stack 을 이용하면 편하지만, 공부를 위해 아래의 그림과 같은 상태 트리에서 **인접 행렬**을 이용한다.

      | 그래프 | 풀이 방식 |
      |:---:|:---:|
      | <img width=300 alt="방향 그래프" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/ac70b4a3-77d4-4503-8424-daf2818e3dbd"> | <img width=300 alt="방법" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/57e61bbe-bb78-48ab-a3d2-16b55dff925d"> |
  
  - 체크 배열을 만들고 두 번 이상 방문하지 않도록 한 번 방문한 노드는 체크 한다. 또 출발 노드는 앞으로 갈 방향에 포함되지 않기 때문에 마찬가지로 체크한다.
  - 하나의 경로가 만들어지면 백트래킹을 하게 되고, 이 때 백트래킹 한 상위 노트는 체크를 풀어야 한다.
  - 예를 들어 `1 2 3 4 5` 라는 경로가 하나 만들어지고, 이외에 다른 경로가 나올 때까지 백트래킹을 한 결과 `노드 2` 까지 올라갔다면, 그 중간의 `노드 3`과 `노드 4`는 체크를 해제한다.

- [경로 탐색 - 인접리스트, ArrayList](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/Graph/%EA%B2%BD%EB%A1%9C%ED%83%90%EC%83%89(%EC%9D%B8%EC%A0%91%EB%A6%AC%EC%8A%A4%ED%8A%B8%2C%20ArrayList).java)

  - 위와 같은, 주어진 방향그래프에서 1번 정점으로부터 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 문제. 

      | 그래프 | 풀이 방식 |
      |:---:|:---:|
      | <img width=300 alt="방향 그래프" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/ac70b4a3-77d4-4503-8424-daf2818e3dbd"> | <img width=300 alt="방법" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/9b86c001-efa5-4834-8f66-b788d8e6929e"> |

  - 정점의 크기가 만 개, 십만 개 이상으로 늘어날 경우 인접행렬로는 시간 복잡도가 증가하거나, 메모리가 낭비되는 등의 문제가 발생한다.
  - 이 경우 **인접 리스트**를 이용하여 각 정점에서 갈 수 있는 정점의 리스트로 graph 를 만든다.

- [그래프 최단 거리(BFS) - 인접리스트, Queue](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%EA%B8%B0%EC%B4%88/Graph/%EA%B7%B8%EB%9E%98%ED%94%84%20%EC%B5%9C%EB%8B%A8%EA%B1%B0%EB%A6%AC(BFS).java)

  - 1번 정점에서 각 정점으로 가는 최소 이동 간선 수를 출력하는 문제.

      | 그래프 | 풀이 방식 |
      |:---:|:---:|
      | <img width=300 alt="방향 그래프" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/cb761762-f1d6-49b5-9f61-08977bb8a19e"> | <img width=300 alt="방법" src="https://github.com/OhHaneol/Algorithm-Study/assets/62991586/2b076ad1-dbb1-4199-b73f-e0d8cc783396"> |
  
  - **최단 거리** -> BFS -> Queue 를 사용하여 앞으로 들릴 곳이 남은 노드(cv)를 저장하고, `cv` 에서 연결된 노드(nv)들 중 들리지 않은 곳을 들리며 작업을 진행한다.
  - cv(current vertex) : `queue.poll()` 하여 `nv` 를 살펴볼 값
  - nv(next vertex) : `graph.get(cv)` 하여 `queue.offer(nv)`할 값
 
  
---


## 📍 DFS, BFS 활용

### 🧷 문제 풀이

- [합이 같은 부분집합](https://github.com/OhHaneol/Algorithm-Study/blob/main/DFS-BFS-%ED%99%9C%EC%9A%A9/DFS/%ED%95%A9%EC%9D%B4%20%EA%B0%99%EC%9D%80%20%EB%B6%80%EB%B6%84%EC%A7%91%ED%95%A9.java)

  - 각 레벨마다 해당 숫자를 포함할지, 하지 않을지를 sum 에 더하는 것으로써 선택하여 DFS 메서드를 재귀로 돌린다.
  - 마지막 레벨에 도달했을 때 합이 같다면 답으로 체킹한 뒤 return 하도록 한다.
  - 이 때 배열은 **크기가 정해저 있지 않기 때문에** `static` 으로 선언하지 않고, 함수에 파라미터로 함께 넘기도록 한다.
  
- []()
  
- []()

  
---

## 📍 Greedy Algorithm

### 🧷 개념

### 🧷 문제 풀이

- [씨름 선수](https://github.com/OhHaneol/algorithm/tree/main/greedy/%EC%94%A8%EB%A6%84%EC%84%A0%EC%88%98)
  
  - 좌표 정렬로 `Comparator 익명 클래스` 구현을 이용한다. : [[Java] 2차원 배열 정렬 (오름차순, 내림차순, 다중 조건)](https://ifuwanna.tistory.com/328)
  
  - 방식: 첫 번째 인자를 기준으로 내림차순 정렬 후, 두 번째 인자의 비교를 진행한다.
  
- [회의실 배정](https://github.com/OhHaneol/algorithm/tree/main/greedy/%ED%9A%8C%EC%9D%98%EC%8B%A4%20%EB%B0%B0%EC%A0%95)
  
  - 좌표 정렬로 `Lambda`를 이용한다.
  
  - 방식: 두 번째 인자를 기준으로 오름차순 정렬하며, 동일할 경우 첫 번째 인자를 기준으로 내림차순 정렬한다.
  
- [결혼식](https://github.com/OhHaneol/algorithm/tree/main/greedy/%EA%B2%B0%ED%98%BC%EC%8B%9D)
  
  - `Collections.sort` 를 이용해 좌표 정렬을 진행한다. : [[JAVA] 객체 List 정렬 및 2번째 조건으로 정렬](https://kim-oriental.tistory.com/45)
  
  - 방식: 객체를 만들고 한 객체를 기준으로 오름차순 정렬 후, 동일할 경우 다른 한 인자를 기준으로 오름차순 정렬한다.
  
- [최대 수입 스케줄](https://github.com/OhHaneol/Algorithm-Study/tree/main/greedy/%EC%B5%9C%EB%8C%80%EC%88%98%EC%9E%85%EC%8A%A4%EC%BC%80%EC%A4%84)
  
  - 좌표 정렬로 `Lambda`를 이용한다.
  
  - `PriorityQueue` 저장소를 이용한다. : [[Data Structure] 우선순위 큐(Priority Queue)란?](https://tmdrnr96.tistory.com/32)
  
  - 방식 1: 일차원 배열을 만들어서, 선점된 날짜는 1, 비어 있는 날짜는 0 으로 구분한다.
  
  - 방식 2: `우선순위 큐` 저장소를 통해 날짜가 바뀔 때마다 가장 큰 수입을 반환한다.
  
- [다익스트라 알고리즘](https://github.com/OhHaneol/Algorithm-Study/tree/main/greedy/%EB%8B%A4%EC%9D%B5%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98)
  
  - `최단 거리` 또는 `최소 비용`을 구하는 데 쓰는 알고리즘.

  - `PriorityQueue` 저장소를 이용한다.
  
  - 객체 list를 갖는 list 인 `graph` 를 이용한다.
  
  - 정점을 인덱스로, 시작 정점을 기준으로 각 정점까지의 비용을 값으로 갖는 배열 `dist`를 이용한다.
  
  - (`dist` 에 저장된 `next` 까지의 비용)과, (`PriorityQueue` 에서 꺼낸 값 `now` + `graph` 에서 꺼낸 값 `next`) 를 반복해서 비교하며 최소비용을 `dist` 에 저장한다.
  
- [친구인가](https://github.com/OhHaneol/Algorithm-Study/tree/main/greedy/%EC%B9%9C%EA%B5%AC%EC%9D%B8%EA%B0%80)
  
  - 방식: Union&Find_자신을 인덱스로, 자신과 친구관계인 인덱스를 값으로 갖는 배열을 만들고, `x = f(x)` 의 재귀 형식을 취한다.
  
- [원더랜드 1_크루스칼](https://github.com/OhHaneol/Algorithm-Study/tree/main/greedy/%EC%9B%90%EB%8D%94%EB%9E%9C%EB%93%9C1)
  
  - `크루스칼`은 `최소스패닝트리(최소비용트리)`에 사용되는 알고리즘이다.
  
  - 방식: Union&Find 와 greedy 를 이용해서 최소 비용으로 모든 도시를 연결한다.
  
- [원더랜드 2_프림](https://github.com/OhHaneol/Algorithm-Study/tree/main/greedy/%EC%9B%90%EB%8D%94%EB%9E%9C%EB%93%9C2)
  
  - `PriorityQueue` 저장소를 이용한다.
  
  - 객체 list를 갖는 list 인 `graph` 를 이용하고, 방향성이 없으므로 각 객체에 이중으로 추가해준다.
  
  - 연결이 되었는지를 체크하는 배열 `unc`를 이용한다.

---

## 📍 dynamic programming_동적계획법

### 🧷 개념

### 🧷 문제 풀이
- []()

---

## 📍 Sorting and Searching

### 🧷 문제 풀이
  
- [좌표 정렬](https://github.com/OhHaneol/Algorithm-Study/tree/main/sorting-and-searching/%EC%A2%8C%ED%91%9C%20%EC%A0%95%EB%A0%AC)
  
  - 람다(Lambda)를 이용한 좌표 정렬을 알아보았다.
  
  - 좌표정렬은 기본적으로 `a - b`를 했을 때 음수 값이 나오면 자리를 바꾸도록 한다.
  
- []()
  
- []()
  
- []()
  

---
