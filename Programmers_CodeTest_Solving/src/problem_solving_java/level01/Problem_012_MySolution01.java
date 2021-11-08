package problem_solving_java.level01;

import java.util.ArrayList;
import java.util.Arrays;

//풀이시간    : 2021-11-08 12:30 ~ 13:30 + 
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : 풀긴 풀었는데, 잔 실수가 너무 많았음. 다시 풀 것.

/*
* <문제 제목> : 모의고사


* <문제> : 
	→ 수포자는 수학을 포기한 사람의 준말입니다.
	수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
	가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        return answer;
    }
}
	
	
* <제한사항> :
	★ 시험은 최대 10,000 문제로 구성되어있습니다.
	★ 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	★ 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	answers			return
	[1,2,3,4,5]		[1]
	[1,3,2,4,2]		[1,2,3]
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ 수포자 1은 모든 문제를 맞혔습니다.
		→ 수포자 2는 모든 문제를 틀렸습니다.
		→ 수포자 3은 모든 문제를 틀렸습니다
		따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다
		
	★ 입출력 예 #2

		→ 모든 사람이 2문제씩을 맞췄습니다.	

*/

class Problem_012_MySolution01 {
	public int[] solution(int[] answers) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] answer = {};
		int[] stuA = {1,2,3,4,5};
		int[] stuB = {2,1,2,3,2,4,2,5};
		int[] stuC = {3,3,1,1,2,2,4,4,5,5};
		
		int[] score = {0,0,0};
		
		for (int i=0; i<answers.length; i++) {
			
			if  (stuA[i % 5] == answers[i]) score[0]++;
			if  (stuB[i % 8] == answers[i]) score[1]++;
			if  (stuC[i % 10] == answers[i]) score[2]++;
		}
		
		int[] arr =  Arrays.copyOfRange(score,0,3);
		Arrays.sort(arr);
		
		// ?
		for (int i=0; i<arr.length; i++) {
			if (score[i] == arr[2]) {
				list.add(i+1);
			}
		}
		
		// ?
		answer = new int[list.size()];
		for (int i=0; i< list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}