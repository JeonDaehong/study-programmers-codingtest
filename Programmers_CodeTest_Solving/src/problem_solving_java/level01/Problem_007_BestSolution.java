package problem_solving_java.level01;

/*
 * <문제 제목> : 음양 더하기
 
 
 * <문제> : 
 	→ 어떤 정수들이 있습니다.
 	  이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
 	  실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 
	class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        return answer;
    }
}
	
	
 * <제한사항> :
 	★ absolutes의 길이는 1 이상 1,000 이하입니다.
	★ absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
	★ signs의 길이는 absolutes의 길이와 같습니다.
	★ signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
	
	
 * <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	absolutes		signs					result
	[4,7,12]		[true,false,true]		9
	[1,2,3]			false,false,true]		0
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다.
		→ 따라서 세 수의 합인 9를 return 해야 합니다.

	★ 입출력 예 #2
		→ signs가 [false,false,true] 이므로, 실제 수들의 값은 각각 -1, -2, 3입니다.
		→ 따라서 세 수의 합인 0을 return 해야 합니다.
	
*/

// 삼항 연산자를 활용하고 더 짧고 간결하게 잘 풀었음.
public class Problem_007_BestSolution {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}
