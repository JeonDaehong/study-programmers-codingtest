package problem_solving_java.level01;

// 풀이시간    : 2021-11-25 18:55 ~ 18:59
// 결과	  	   : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단   : 잘 풀었음. 다음에는 더 빠르게 풀 수 있도록 공부하자.

/*
* <문제 제목> : 가운데 글자 가져오기

* <문제> : 
	→ 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
	  단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	  
class Solution {
	public String solution(String s) {
        String answer = "";
        return answer;
    }
}


* <제한 사항> :
	★ s는 길이가 1 이상, 100이하인 스트링입니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	s			return
	"abcde"		"c"
	"qwer"		"we"	
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
*/

public class Problem_025_MySolution01 {
	
	public String solution(String s) {
		
        String answer = "";
        
        if (s.length() % 2 == 1) {
        	answer += String.valueOf(s.charAt(s.length() / 2));
        } else {
        	answer += String.valueOf(s.charAt((s.length() / 2)-1));
        	answer += String.valueOf(s.charAt(s.length() / 2));
        }
        
        return answer;
    }
}
