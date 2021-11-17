package problem_solving_java.level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//풀이시간    : 2021-11-17 08:47 ~ 09:06
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : 잘 풀었는데, 문제 꼼꼼하게 읽기. 오름차순으로 해야되는걸 못 봐서, 정확성 테스트의 오류 찾느냐 시간 낭비.

/*
* <문제 제목> : 두 개 뽑아서 더하기

* <문제> : 
	→ 정수 배열 numbers가 주어집니다.
	  numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
	  모든 수를 배열에 오름차순으로 담아
	  return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        return answer;
    }
}
	
	
* <제한사항> :
	★ numbers의 길이는 2 이상 100 이하입니다.
		- numbers의 모든 수는 0 이상 100 이하입니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	numbers			result
	[2,1,3,4,1]		[2,3,4,5,6,7]
	[5,0,2,7]		[2,5,7,9,12]
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
		→ 3 = 2 + 1 입니다.
		→ 4 = 1 + 3 입니다.
		→ 5 = 1 + 4 = 2 + 3 입니다.
		→ 6 = 2 + 4 입니다.
		→ 7 = 3 + 4 입니다.
		→ 따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
		  
		
	★ 입출력 예 #2

		→ 2 = 0 + 2 입니다.
		→ 5 = 5 + 0 입니다.
		→ 7 = 0 + 7 = 5 + 2 입니다.
		→ 9 = 2 + 7 입니다.
		→ 12 = 5 + 7 입니다.
		→ 따라서 [2,5,7,9,12] 를 return 해야 합니다.

*/

public class Problem_019_MySolution {

	public int[] solution(int[] numbers) {
		
		HashSet<Integer> numSet = new HashSet<>();
		
        int[] answer = {};
              
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                numSet.add(numbers[i]+numbers[j]);
            }
        }
               
        answer = new int[numSet.size()];
        int cnt = 0;
        
        // HashSet의 데이터를 순서대로 출력할 수 있는 코드 (꼭 외워두기)
        Iterator<Integer> iter = numSet.iterator();
        
        while(iter.hasNext()) {
        	answer[cnt] = iter.next();
        	cnt++;
        }
        
        Arrays.sort(answer);	// 오름차순으로 정리
        
        return answer;
        
    }
	
}
