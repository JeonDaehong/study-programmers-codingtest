package problem_solving_java.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//풀이시간    : 2021-11-11 09:45 ~ 10:20 + 2021-11-12 21:30 ~ 22:52
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : 1. int값으로 double을 구할 땐 (double) 넣기
//				   즉, 내가 원하는 자료형으로 뽑아내고 싶을 땐, 그 계산식때부터 캐스팅을 해줘야됨.
//				2. 나눗셈을 할 때 분자든, 분모든 0이 있어서는 안된다. (컴퓨터는 인피니티로 처리해버림)
//				3. 나눗셈에서 -가 나올 수도 있으니 그 부분을 고려해야 한다.
//				[잘은 풀었지만, 계속 공부해서 꼭 다시 풀어보기! 너무 좋은 문제임!]

/*
* <문제 제목> : 실패율


* <문제> : 
	→ 슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다.
	그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다.
	원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.

	이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다.
	역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다.
	오렐리를 위해 실패율을 구하는 코드를 완성하라.

	* 실패율은 다음과 같이 정의한다.
		스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		
	전체 스테이지의 개수 N,
	게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
	실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        return answer;
    }
}
	
	
* <제한사항> :
	★ 스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
	★ stages의 길이는 1 이상 200,000 이하이다.
	★ stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
	★ 각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
	★ 단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
	★ 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
	★ 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	N		stages						result
	5		[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
	4		[4,4,4,4,4]					[4,1,2,3]
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ 1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다.
		  따라서 1번 스테이지의 실패율은 다음과 같다.
		  
		  * 1번 스테이지 실패율 : 1/8
		  
		→ 2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.

	  	  * 2 번 스테이지 실패율 : 3/7

		→ 마찬가지로 나머지 스테이지의 실패율은 다음과 같다.

 		  * 3 번 스테이지 실패율 : 2/4
 		  * 4번 스테이지 실패율 : 1/2
 		  * 5번 스테이지 실패율 : 0/1

		→ 각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.

 		  * [3,4,2,1,5]
		  
		
	★ 입출력 예 #2

		→ 모든 사용자가 마지막 스테이지에 있으므로 4번 스테이지의 실패율은 1이며 나머지 스테이지의 실패율은 0이다.

 		  * [4,1,2,3]

*/

class Problem_015_MySolution01 {

	public static int[] solution(int N, int[] stages) {
		
		Map<Integer , Double> stageFailureRateList = new HashMap<Integer , Double>();
		
		int[] answer = new int[N];
		
		int nowStage = 1;
		int stageAllPlayer = 0;
		int stagePassPlayer = 0;
		double fail = 0;
		
		while(nowStage <= N) {
			for (int i=0; i<stages.length; i++) {
				if (stages[i] >= nowStage) stageAllPlayer++;
				if (stages[i] > nowStage) stagePassPlayer++;
			}
			
			if (stageAllPlayer != 0 && stageAllPlayer-stagePassPlayer != 0) {
				fail = (double)(stageAllPlayer-stagePassPlayer) / (double)stageAllPlayer;
			} else {
				fail = 0;
			}
			
			stageFailureRateList.put(nowStage, fail);
			
			stageAllPlayer = 0;
			stagePassPlayer = 0;
			nowStage++;
		}
		
		double max = -1;
		int idx = 0;
		for (int k=0; k<N; k++) {
			max = -1;
			idx = 0;
			for (int i : stageFailureRateList.keySet()) {
				if (stageFailureRateList.get(i) > max) {
					max = stageFailureRateList.get(i);
					idx = i;
				}
			}
			answer[k] = idx;
			stageFailureRateList.remove(idx);
		}

        return answer;
        
    }
	
	// 디버깅
	public static void main(String[] args) {
		
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		System.out.println(Arrays.toString(solution(5, stages)));
		
	}
	
}



