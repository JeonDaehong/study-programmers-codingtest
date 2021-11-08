package problem_solving_java.level01;

import java.util.Arrays;

//풀이시간    : 2021-11-08 10:30 ~ 11:05
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : 풀긴 풀었는데, 잔 실수가 너무 많았음. 다시 풀 것.

/*
* <문제 제목> : K번째 수


* <문제> : 
	→ 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	  예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	  1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	  2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	  3. 2에서 나온 배열의 3번째 숫자는 5입니다.
	  배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
	  commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        return answer;
    }
}
	
	
* <제한사항> :
	★ array의 길이는 1 이상 100 이하입니다.
	★ array의 각 원소는 1 이상 100 이하입니다.
	★ commands의 길이는 1 이상 50 이하입니다.
	★ commands의 각 원소는 길이가 3입니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	array						commands								return
	[1, 5, 2, 6, 3, 7, 4]		[[2, 5, 3], [4, 4, 1], [1, 7, 3]]		[5, 6, 3]
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
		  [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
		  [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.

*/

class Problem_011_MySolution01 {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        int cnt = 0;
        for (int i=0; i<commands.length; i++) {
        	int[] temp = new int[(commands[i][1]) - (commands[i][0]) + 1];
        	int k = 0;
        	// temp의 길이가 1일 경우의 예외처리
        	if (commands[i][0] == commands[i][1]) {
        		temp[k] = array[commands[i][0]-1];
        	// 일반적일 경우 (commands[i][0] 부터 commands[i][1]까지니까, j<=commnads[j][1]을 해줘야됨.
        	} else {
	        	for (int j=commands[i][0]; j<=commands[i][1]; j++) {
	        		temp[k] = array[j-1];
	        		k++;
	        	}
        	}
        	Arrays.sort(temp);
        	answer[cnt] = temp[(commands[i][2]) - 1];
        	cnt++;
        }
        return answer;
    }
}