package problem_solving_java.level01;

//풀이시간    : 2021-11-15 18:45 ~ 19:10
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : StringBuffer 객체 속 reverse().toString()을 기억하자.
//				그리고, Integer.toString(int, radix)는 숫자->문자열 radix진법에 맞춰 변환
//				Integer.ValueOf(String, radix)는 String을 radix진법이라 생각하고, 그에 맞춰 정수(10진법)로 변환
//				시켜주는 것임을 잊지말자.

/*
* <문제 제목> : 3진법 뒤집기

* <문제> : 
	→ 자연수 n이 매개변수로 주어집니다.
	n을 3진법 상에서 앞뒤로 뒤집은 후,
	이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }
}
	
	
* <제한사항> :
	★ n은 1 이상 100,000,000 이하인 자연수입니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	n		result
	45		7
	125		229
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ 답을 도출하는 과정은 다음과 같습니다.
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		n (10진법)			n (3진법)			앞뒤 반전(3진법)		10진법으로 표현
		45					1200				0021					7
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		→ 따라서 7을 return 해야 합니다.
		  
		
	★ 입출력 예 #2

		→ 답을 도출하는 과정은 다음과 같습니다.
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		n (10진법)			n (3진법)			앞뒤 반전(3진법)		10진법으로 표현
		125					11122				22111					229
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		  
		→ 따라서 229를 return 해야 합니다.

*/

public class Problem_017_MySolution01 {
	public int solution(int n) {
		
		int answer = 0;
		String temp = "";
		
		// 정수(10진법) n을 3진법으로 바꾼 문자열을 temp에 저장한다.
		temp = Integer.toString(n, 3);
		
		// temp를 뒤집는다. (StringBuffer에 있는 reverse().toString()이용)
		StringBuffer sB = new StringBuffer(temp);
		temp = sB.reverse().toString();
		
		// temp가 3진법이라 생각하고, 그에 맞춰 정수(10진법)로 변환한다.
		answer = Integer.valueOf(temp, 3);
		
		return answer;
		
	}
}
