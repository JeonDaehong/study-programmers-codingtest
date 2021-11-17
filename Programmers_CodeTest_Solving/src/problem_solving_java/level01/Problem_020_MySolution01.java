package problem_solving_java.level01;

//풀이시간    : 2021-11-17 09:22 ~ 09:40
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : 잘 풀었는데, 코드가 너무 지저분함. 더 깔끔하게 풀 수 있는 코드를 구현하도록 공부.

/*
* <문제 제목> : 2016년

* <문제> : 
	→ 2016년 1월 1일은 금요일입니다.
	  2016년 a월 b일은 무슨 요일일까요?
	  두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
	  요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
	  예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        return answer;
    }
}
	
	
* <제한사항> :
	★ 2016년은 윤년입니다.
	★ 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	a		b		result
	5		24		"TUE"
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

*/

public class Problem_020_MySolution01 {
	
	public String solution(int a, int b) {
		
        String answer = "";
        
        int cnt = 6;
        int month = 1;
        int day = 1;
        int swithNum = 0;
        
        for (month=1; month<13; month++) {
        	
        	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        		for (day = 1; day <= 31; day++) {
        			if (month == a && day == b) {
        				swithNum = 1;
        				break;
        			}
        			cnt++;
        			if (cnt>7) cnt=1;
        		}
        	} else if ( month == 4 || month == 6 || month == 9 || month == 11) {
        		for (day = 1; day <= 30; day++) {
        			if (month == a && day == b) {
        				swithNum = 1;
        				break;
        			}
        			cnt++;
        			if (cnt>7) cnt=1;
        		}
        	} else if (month == 2) {
        		for (day = 1; day <= 29; day++) {
        			if (month == a && day == b) {
        				swithNum = 1;
        				break;
        			}
        			cnt++;
        			if (cnt>7) cnt=1;
        		}
        	}
        	
        	if (swithNum == 1) break;
        	
        }
        
        if 		(cnt == 1) answer = "SUN";
        else if (cnt == 2) answer = "MON";
        else if (cnt == 3) answer = "TUE";
        else if (cnt == 4) answer = "WED";
        else if (cnt == 5) answer = "THU";
        else if (cnt == 6) answer = "FRI";
        else if (cnt == 7) answer = "SAT";
        
        return answer;
        
    }

}
