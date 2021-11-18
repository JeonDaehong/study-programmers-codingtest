package problem_solving_java.level01;

// 풀이시간  : 2021-11-18  09:15 ~ 09:25
// 결과		 : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단 : 잘 풀었음 !

public class Problem_001_MySolution02 {

	public int[] solution(int[] lottos, int[] win_nums) {
		
        int zeroCnt = 0;	// 0의 갯수
        int sameCnt = 0;	// 같은 숫자의 갯수
        
        for (int i : lottos) {
        	if (i == 0) {
        		zeroCnt++;
        	} else {
        		for (int j : win_nums) {
        			if (i == j) {
        				sameCnt++;
        				break;	// win_nums에 동일한 값이 있을 수 있기때문에
        			}
        		}
        	} 		
        }
        
        // 최대, 최소 갯수
        int max = zeroCnt + sameCnt;
        int min = sameCnt;
        
        int[] answer = new int[2];
        answer[0] = Math.min((7-max) , 6); // 최고 순위
        answer[1] = Math.min((7-min) , 6); // 최저 순위
        
        
        return answer;
        
    }
	
}
