# Algorithm-Study
코딩테스트 공부 with 자바

## 목차

1. [Greedy Algorithm](#-greedy-algorithm)
2. [Exhaustive Algorithm](#-exhaustive-algorithm)
3. [Recursive, Tree, Graph_DFS, BFS 기초](#-recursive,-tree,-graph_dfs,-bfs-기초)
4. [DFS, BFS 활용](#-dfs,-bfs-활용)
5. [dynamic programming_동적계획법](#-dynamic-programming_동적계획법)
6. [Sorting and Searching](#-sorting-and-searching)
---

## 📍 Greedy Algorithm

### 🧷 개념

### 🧷 문제 풀이
- [씨름 선수](https://github.com/OhHaneol/algorithm/tree/main/greedy/%EC%94%A8%EB%A6%84%EC%84%A0%EC%88%98)
  - 좌표 정렬로 `Comparator 익명 클래스` 구현을 이용 : [[Java] 2차원 배열 정렬 (오름차순, 내림차순, 다중 조건)](https://ifuwanna.tistory.com/328)
  - 방식: 첫 번째 인자를 기준으로 내림차순 정렬 후, 두 번째 인자의 비교
- [회의실 배정](https://github.com/OhHaneol/algorithm/tree/main/greedy/%ED%9A%8C%EC%9D%98%EC%8B%A4%20%EB%B0%B0%EC%A0%95)
  - 좌표 정렬로 `Lambda` 이용
  - 방식: 두 번째 인자를 기준으로 오름차순 정렬하며, 동일할 경우 첫 번째 인자를 기준으로 내림차순 정렬
- [결혼식](https://github.com/OhHaneol/algorithm/tree/main/greedy/%EA%B2%B0%ED%98%BC%EC%8B%9D)
  - `Collections.sort` 를 이용해 좌표 정렬 진행 : [[JAVA] 객체 List 정렬 및 2번째 조건으로 정렬](https://kim-oriental.tistory.com/45)
  - 방식: 객체를 만들고 한 객체를 기준으로 오름차순 정렬 후, 동일할 경우 다른 한 인자를 기준으로 오름차순 정렬
- [최대 수입 스케줄](https://github.com/OhHaneol/Algorithm-Study/tree/main/greedy/%EC%B5%9C%EB%8C%80%EC%88%98%EC%9E%85%EC%8A%A4%EC%BC%80%EC%A4%84)
  - 좌표 정렬로 `Lambda` 이용
  - 우선순위 큐 저장소 이용 : [[Data Structure] 우선순위 큐(Priority Queue)란?](https://tmdrnr96.tistory.com/32)
  - 방식 1: 일차원 배열을 만들어서, 선점된 날짜는 1, 비어 있는 날짜는 0 으로 구분
  - 방식 2: `우선순위 큐` 저장소를 통해 날짜가 바뀔 때마다 가장 큰 수입을 반환
- [다익스트라 알고리즘]()
- [친구인가](https://github.com/OhHaneol/Algorithm-Study/blob/main/greedy/%EC%B9%9C%EA%B5%AC%EC%9D%B8%EA%B0%80/README.md)
  - 방식: 자신을 인덱스로, 자신과 친구관계인 인덱스를 값으로 갖는 배열을 만들고, `x = f(x)` 의 재귀 형식을 취한다.
- [원더랜드 1]()
- [원더랜드 2]()

---

## 📍 Exhaustive Algorithm

### 🧷 개념

### 🧷 문제 풀이
- []()

---

## 📍 Recursive, Tree, Graph_DFS, BFS 기초

### 🧷 개념

### 🧷 문제 풀이
- []()

---

## 📍 DFS, BFS 활용

### 🧷 개념

### 🧷 문제 풀이
- []()

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
