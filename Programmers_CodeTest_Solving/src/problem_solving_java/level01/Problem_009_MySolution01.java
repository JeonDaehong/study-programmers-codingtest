package problem_solving_java.level01;

import java.util.ArrayList;
import java.util.List;

// 풀이시간    : 2021-10-29 17:35 ~ 17:55
// 결과	  	   : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단   : 잘 풀었음. 근데 좀 더 꼼꼼하게 풀기
//				 (cnt를 리셋 시키는 위치 /  if (i + 2 >= nums.length) break; 등등)

/*
* <문제 제목> : 소수 만들기


* <문제> : 
	→ 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
	  숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
	  nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때
	  소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

class Solution {
  public int solution(int[] nums) {
      int answer = -1;

      // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
      System.out.println("Hello Java");

      return answer;
  }
}
	
	
* <제한사항> :
	★ nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
	★ nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	nums			result
	[1,2,3,4]		1
	[1,2,7,6,4]		4
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ [1,2,4]를 이용해서 7을 만들 수 있습니다.

	★ 입출력 예 #2
		→ [1,2,4]를 이용해서 7을 만들 수 있습니다.
		→ [1,4,6]을 이용해서 11을 만들 수 있습니다.
		→ [2,4,7]을 이용해서 13을 만들 수 있습니다.
		→ [4,6,7]을 이용해서 17을 만들 수 있습니다.
	
*/

class Problem_009_MySolution01 {
	  public int solution(int[] nums) {
		  
		  List<Integer> numList = new ArrayList<>();
	     
		  int answer = 0;
	      int cnt = 0;
	      
	      for (int i=0; i<nums.length; i++) {
	    	  if (i + 2 >= nums.length) break;	//	중요
	    	  for (int j=i+1; j<nums.length; j++) {
	    		  for (int k=j+1; k<nums.length; k++) {
	    			  numList.add(nums[i]+nums[j]+nums[k]);
	    		  }
	    	  }
	      }
	      
	      for (int i : numList) {
	    	  cnt = 0;
	    	  for (int j=1; j<=i; j++) {
	    		  if (i % j == 0) {
	    			  cnt++;
	    		  }
	    	  }
	    	  if (cnt == 2) {
	    		  answer++;
	    	  }
	      }
	      return answer;
	  }
}