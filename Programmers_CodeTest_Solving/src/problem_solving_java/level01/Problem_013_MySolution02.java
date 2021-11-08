package problem_solving_java.level01;

//풀이시간    : 2021-11-08 19:20 ~ 19:27
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : 다시 잘 생각해서 잘 풀었으나, 나중에 꼭 다시 풀어볼 것. (변화된 for문 잘 활용할 것)
//              그리고 != 를 활용하면, 체육복 빌려주는 부분에서 if문을 2개를 줄일 수 있음.

/*
* <문제 제목> : 체육복



* <문제> : 
	→ 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
	다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
	학생들의 번호는 체격 순으로 매겨져 있어,
	바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
	예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
	체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

	전체 학생의 수 n,
	체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
	여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
	체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

class Solution {
  public int solution(int n, int[] lost, int[] reserve) {
      int answer = 0;
      return answer;
  }
}
	
	
* <제한사항> :
	★ 전체 학생의 수는 2명 이상 30명 이하입니다.
	★ 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	★ 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	★ 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
	★ 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
		이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
		남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	n		lost		reserve			return
	5		[2, 4]		[1, 3, 5]		5
	5		[2, 4]		[3]				4
	3		[3]			[1]				2
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ 1번 학생이 2번 학생에게 체육복을 빌려주고,
		  3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면
		  학생 5명이 체육수업을 들을 수 있습니다.
		  
		
	★ 입출력 예 #2

		→ 3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.

*/

public class Problem_013_MySolution02 {

	public int solution(int n, int[] lost, int[] reserve) {
		
        int answer = 0;
        
        // 체육복 (-1, 0, 1)
        int[] stuAll = new int[n];
        
        for (int i : lost) stuAll[i-1] --;		// 체육복 잃어버린 사람
        for (int i : reserve) stuAll[i-1] ++;	// 여벌의 체육복이 있는 사람
        
        // 앞 뒤로 체육복 빌려주기
        for (int i=0; i<stuAll.length; i++) {
        	if (stuAll[i] < 0) {
        		if (i == stuAll.length-1 && stuAll[i-1] > 0) {
        			stuAll[i] ++;
        			stuAll[i-1] --;
        		} else if (i == 0 && stuAll[i+1] > 0) {
        			stuAll[i] ++;
        			stuAll[i+1] --;
        		} else if (i > 0 && i < stuAll.length-1 && stuAll[i-1] > 0) {
        			stuAll[i] ++;
        			stuAll[i-1] --;
        		} else if (i > 0 && i < stuAll.length-1 && stuAll[i+1] > 0) {
        			stuAll[i] ++;
        			stuAll[i+1] --;
        		}
        	}
        }
        
        // 체육복 있는 사람 ( >= 0)
        for (int i=0; i<stuAll.length; i++) {
        	if (stuAll[i] >= 0) {
        		answer ++;
        	}
        }
         
        return answer;
        
    }
	
}
