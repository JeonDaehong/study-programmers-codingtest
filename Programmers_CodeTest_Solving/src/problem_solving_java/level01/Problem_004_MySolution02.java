package problem_solving_java.level01;

//풀이시간  : 2021-10-27 10:00 ~ 10:47
//결과	 	: 100.0 / 100.0 (정확성: 100.0)
//나의 판단 : 답은 맞았는데, 이것보다 더 간단히 풀 수 있는 코드가 있으니 공부해서 다음에는 더 잘 풀어보자.

public class Problem_004_MySolution02 {
	
    int[][] phoneNum = {
    		{3, 1}, // 0
    		{0, 0}, // 1
    		{0, 1}, // 2
    		{0, 2}, // 3
    		{1, 0}, // 4
    		{1, 1}, // 5
    		{1, 2}, // 6
    		{2, 0}, // 7
    		{2, 1}, // 8
    		{2, 2}  // 9
    };
    
    // 초기 위치
    int[] myLeftUmji = {3, 0};
    int[] myRightUmji = {3, 2};
    String myHand = "";
	
	public String solution(int[] numbers, String hand) {
		
		myHand = (hand.equals("right")) ? "R" : "L";
		
	        String answer = "";
       
	        for (int i : numbers) {
	        	
	        	String temp = pushNum(i);
        	
	        	if (temp.equals("L")) {
	        		myLeftUmji = phoneNum[i];
	        	} else if (temp.equals("R")) {
	        		myRightUmji = phoneNum[i];
	        	}
	        	
	        	answer += temp;
	        }
	        
	        return answer;
	    }
	
	
	
	String pushNum (int num) {
		
		if (num == 1 || num == 4 || num == 7) {
			return "L";		
		} 
		if (num == 3 || num == 6 || num == 9) {	
			return "R";	
		}
		
		
		if ((distance(myLeftUmji , num) < distance(myRightUmji , num))) {
			return "L";	
		}
		if ((distance(myLeftUmji , num) > distance(myRightUmji , num))) {
			return "R";	
		}
		
		return this.myHand;
		
	}
	
	
	int distance (int[] umji , int num) {
		
		int result = Math.abs(phoneNum[num][0] - umji[0]) + Math.abs(phoneNum[num][1] - umji[1]);

		return result;
	}
	
	
	
}
