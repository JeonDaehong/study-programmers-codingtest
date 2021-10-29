package problem_solving_java.level01;

// 베스트 코드
public class Problem_006_BestSolution {
	 public int solution(int[] numbers) {
	        int sum = 45; // 여기서는 미리 1~9까지의 합을 계산해두었음. (나는 그냥 코드로 짰고)
	        for (int i : numbers) {
	            sum -= i;
	        }
	        return sum;
	    }
}
