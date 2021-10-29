package problem_solving_java.level01;

import java.util.Arrays;

//풀이시간    : 2021-10-29 18:15 ~ 18:55
//결과	  	  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단   : 풀긴 풀었는데, sort 말고 HashMap을 이용해서 다시 꼭 풀어보자.

/*
* <문제 제목> : 완주하지 못한 선수


* <문제> : 
	→ 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
	  단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	  마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
	  완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
	  완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

class Solution {
  public String solution(String[] participant, String[] completion) {
      String answer = "";
      return answer;
  }
}
	
	
* <제한사항> :
	★ 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
	★ completion의 길이는 participant의 길이보다 1 작습니다.
	★ 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
	★ 참가자 중에는 동명이인이 있을 수 있습니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	participant											completion									return
	["leo", "kiki", "eden"]								["eden", "kiki"]							"leo"
	["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
	["mislav", "stanko", "mislav", "ana"]				["stanko", "ana", "mislav"]					"mislav
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	★ 입출력 예 #1
		→ "leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

	★ 입출력 예 #2
		→ "vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

	★ 입출력 예 #3
		→ "mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
	
	
*/

public class Problem_010_MySolution01 {
	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
		String temp = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0;
		
		while (i < completion.length) {
			if (!completion[i].equals(participant[i])) {
				temp = participant[i];
				break;
			}
			i++;
		}
		
		// 혹시나 완주자하지 못한 사람이 맨 마지막 인덱스에 있을 수 있기 때문에, 해당 if문을 구현.
		if (temp.equals("")) {
			answer = temp;
		} else {
			answer = participant[participant.length-1];
		}
		
		return answer;
	}
}