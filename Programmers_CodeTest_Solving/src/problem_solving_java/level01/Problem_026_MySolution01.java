package problem_solving_java.level01;

// 풀이시간    : 2021-11-29 10:30 ~ 11:51
// 결과	  	   : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단   : 잘 풀었음. Chacracter.isDigit은 char에서 숫자형을 찾는건데, 그걸 기억할 것.
//				 그리고 char 형태의 숫자 0은 int화 했을 때 48이 됨. (아스키 코드에 의해)
//				 그래서 char의 숫자를 뺄 때는 char형태의 숫자 - '0'을 해줘야함. (0도 char형태임)

/*
* <문제 제목> : 다트 게임

* <문제> : 
	→ 카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다.
	  다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로,
	  모두가 간단히 즐길 수 있다.
	  갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다.
	  다트 게임의 점수 계산 로직은 아래와 같다.
	  다트 게임은 총 3번의 기회로 구성된다.
	  
		1. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
		2. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
		3. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
		4. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
		5. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
		6. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
		7. Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
		8. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며,
		   존재하지 않을 수도 있다.
	   0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
	  
class Solution {
	 public int solution(String dartResult) {
     int answer = 0;
     return answer;
 }
}


* <입력 형식> :
	★ "점수|보너스|[옵션]"으로 이루어진 문자열 3세트.
		예) 1S2D*3T

		점수는 0에서 10 사이의 정수이다.
		보너스는 S, D, T 중 하나이다.
		옵선은 *이나 # 중 하나이며, 없을 수도 있다.
		
		
* <출력 형식> :
	★ 3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.
	  예) 37
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	예제	dartResult	answer	설명
	1		1S2D*3T		37		1^1 * 2 + 2^2 * 2 + 3^3
	2		1D2S#10S	9		1^2 + 2^1 * (-1) + 10^1
	3		1D2S0T		3		1^2 + 2^1 + 0^3
	4		1S*2T*3S	23		1^1 * 2 * 2 + 2^3 * 2 + 3^1
	5		1D#2S*3S	5		1^2 * (-1) * 2 + 2^1 * 2 + 3^1
	6		1T2D3D#		-4		1^3 + 2^2 + 3^2 * (-1)
	7		1D2S3T*		59		1^2 + 2^1 * 2 + 3^3 * 2
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
*/

public class Problem_026_MySolution01 {
	
	public int solution(String dartResult) {
		
        int[] score = new int[3];	// 다트 점수 보관 (1회차, 2회차, 3회차)
        
        int idx = 0;				// 현재 던진 다트가 몇번째인지 (0 ~ 2)
        
        int num = 0;				// 이번 차례의 점수
        
        for (int i=0; i<dartResult.length(); i++) {
        	
        	// 숫자일 경우
        	if (Character.isDigit(dartResult.charAt(i))) {
        		
        		// 맞춘 숫자가 10점일 경우 (length범위를 벗어나는건 걱정 x. 이유는 마지막 글자가 숫자가 아님)
        		// 아스키 코드를 의식하여 char형태의 '0'을 빼준다.
        		if (dartResult.charAt(i) - '0' == 1 && dartResult.charAt(i+1) - '0' == 0) {
        			num = 10;
        			i++;
        		}
        		
        		// 그 외의 일반적인 경우 (마찬가지로 아스키 코드를 의식하여 char형태의 '0'을 빼준다.)
        		else {
        			num = (int) dartResult.charAt(i) - '0';
        		}
        		
        	// 문자일 경우
        	} else if (dartResult.charAt(i) == 'S') {
        		score[idx] = num;
        		idx++;
        		num = 0;
        		
        	} else if (dartResult.charAt(i) == 'D') {
        		score[idx] = (int) Math.pow(num, 2);
        		idx++;
        		num = 0;
        		
        	} else if (dartResult.charAt(i) == 'T') {
        		score[idx] = (int) Math.pow(num, 3);
        		idx++;
        		num = 0;
        		
        	} else if (dartResult.charAt(i) == '*') {
        		
        		// idx가 1일 때는, 첫 점수만 2배임.
        		if (idx == 1) {
        			score[0] = (score[0] * 2);
        			
        		// 그 외에는 현재 점수와, 이전 점수만 2배임.	
        		} else if (idx > 1) {
        			for (int j=idx-2; j<idx; j++) {
            			score[j] = (score[j] * 2);
            		}
        		}
        		
        	} else if (dartResult.charAt(i) == '#') {
        		score[idx-1] = (score[idx-1] * -1);		// 음수로 전환
        	}
        }
        
        // 1,2,3번째로 얻은 점수를 모두 합한다.
        int answer = 0;      
        for (int i=0; i<idx; i++) {
        	answer += score[i];
        }
        
        return answer;
    }
	
}
