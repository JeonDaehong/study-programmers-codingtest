package problem_solving_java.level01;

// 풀이시간   : 2021-10-29 17:27 ~ 17:28
// 결과	  	  : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단  : 너무 잘 풀었음!! 이 풀이 자체가 BestSolution임.

/*
 * <문제 제목> : 내적
 
 
 * <문제> : 
 	→ 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
	  이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 
	class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        return answer;
    }
}
	
	
 * <제한사항> :
 	★ a, b의 길이는 1 이상 1,000 이하입니다.
	★ a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
	
	
 * <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	a				b				result
	[1,2,3,4]		[-3,-1,0,2]		3
	[-1,0,1]		[1,0,-1]		-2
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.

	★ 입출력 예 #2
		→ a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.
	
*/

public class Problem_008_MySolution01 {
	public int solution(int[] a, int[] b) {
       
		int answer = 0;
        
		for (int i=0; i<a.length; i++) {
			answer += a[i]*b[i];
		}
		
        return answer;
    }
}
