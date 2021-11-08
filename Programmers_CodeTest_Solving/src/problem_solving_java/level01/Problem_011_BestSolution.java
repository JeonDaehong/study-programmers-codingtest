package problem_solving_java.level01;

import java.util.Arrays;

// 베스트 코드
public class Problem_011_BestSolution {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
        	// array 배열의 , commands[i][0]-1인덱스 부터 commands[i][1]-1까지 복사해옴.
        	// 즉, Arrays.copyOdRange(arr,1,5) 라고 하면,
        	// arr의 인덱스 1부터 4까지 복사해오는 것이다.
        	// 이걸 사용할 때에는 원하는 범위 시작인덱스 ~ 끝 인덱스 + 1로 가져와야 된다.
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
