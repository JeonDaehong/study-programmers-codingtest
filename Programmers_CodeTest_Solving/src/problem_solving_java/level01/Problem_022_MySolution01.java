package problem_solving_java.level01;

// 풀이시간    : 2021-11-24 09:42 ~ 09:44
// 결과	  	   : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단   : 잘 풀었음. 처음에 문제를 너무 어렵게 생각하려했는데, 문제 그대로를 생각해 볼 것.

/*
* <문제 제목> : 나머지가 1이 되는 수 찾기

* <문제> : 
	→ 자연수 n이 매개변수로 주어집니다.
	  n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
	  답이 항상 존재함은 증명될 수 있습니다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }
}
	
	
* <제한사항> :
	★ 3 ≤ n ≤ 1,000,000
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	n		result
	10		3
	12		11
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

	★ 입출력 예 #1
		→ 10을 3으로 나눈 나머지가 1이고,
		  3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
		
	★ 입출력 예 #2
		→ 12를 11로 나눈 나머지가 1이고,
		  11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.

*/

public class Problem_022_MySolution01 {

	public int solution(int n) {
		
        int answer = 0;
        
        for (int x=1; x<n; x++) {
        	if (n%x == 1) {
        		answer = x;
        		break;
        	}
        }
        
        return answer;
        
    }
	
}
