package problem_solving_java.level01;

//풀이시간   : 2021-11-22 10:00 ~ 10:05
//결과		  : 100.0 / 100.0 (정확성: 100.0)
//나의 판단  : 아주 깔끔하게 잘 풀었음.

public class Problem_003_MySolution02 {
	
	public int solution(String s) {
		
        int answer = 0;
        
        String[] temp = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<temp.length; i++) {
        	s = s.replaceAll(temp[i], String.valueOf(i));
        }
        
        answer = Integer.valueOf(s);
        
        return answer;
        
    }
	
}
