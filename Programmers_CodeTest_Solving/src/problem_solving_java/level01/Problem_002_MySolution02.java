package problem_solving_java.level01;

// 풀이시간   : 2021-11-18 09:30 ~ 09:55
// 결과		  : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단  : 중간에 정규식 생각안나서 구글링했는데, 정규식 꼭 다시 공부
//				그리고 substring(startInt , endInt)에서 endInt는 해당 인덱스 제외임.

public class Problem_002_MySolution02 {

	public String solution(String new_id) {
		
        String answer = new_id;
        
        // 1단계
        answer = answer.toLowerCase();
        
        // 2단계
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계
        answer = answer.replaceAll("[.]{2,}", ".");
        
        // 4단계
        answer = answer.replaceAll("^[.]{1}", "");
        answer = answer.replaceAll("[.]{1}$", "");
        
        // 5단계
        if (answer.equals("")) answer += "a";
        
        // 6단계
        if (answer.length() >= 16) {
        	answer = answer.substring(0, 15);
        }
        
        // 6단계에서 잘라낸 문자열 맨 끝이 마침표(.)일 경우
        answer = answer.replaceAll("[.]{1}$", "");
        
        // 7단계
        while (answer.length() < 3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        
        return answer;
        
    }	
	
}
