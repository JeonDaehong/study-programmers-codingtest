package problem_solving_java.level01;

// 풀이시간   : 2021-10-29 16:45 ~ 16:51
// 결과	 	  : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단  : 잘 풀었는데, 군더더기가 너무 많음. 좀 더 짧고 간결하게 코드를 짤 수 있도록 하자.

/*
 * <문제 제목> : 없는 숫자 더하기
 
 
 * <문제> : 
 	→ 0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다.
 	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 
	class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        return answer;
    }
}
	
	
 * <제한사항> :
 	★ 1 ≤ numbers의 길이 ≤ 9
	★ 0 ≤ numbers의 모든 수 ≤ 9
	★ numbers의 모든 수는 서로 다릅니다.
	
		
 
 * <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	numbers					result
	[1,2,3,4,6,7,8,0]		14
	[5,8,4,0,6,7,9]			6
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ 5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.

	★ 입출력 예 #2
		→ 1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
	
*/

class Problem_006_MySolution01 {
	public int solution(int[] numbers) {
        
		int answer = -1;
        int num = 0;
        int num2 = 0;
		
        // (1) 1~9까지 더한 값
		for (int i=0; i<10; i++) {
			num += i;
		}
		
		// (2) 임의의 숫자들의 합
		for (int i=0; i<numbers.length; i++) {
			num2 += numbers[i];
		}
		
		// (1) - (2)를 해주면 답이 나온다.
		answer = num - num2;
		
        return answer;
    }
}
