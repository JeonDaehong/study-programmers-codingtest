package problem_solving_java.level01;

// 베스트 솔루션 (리턴 값 공부할 것)
public class Problem_023_BestSolution {
	public long solution(long price, long money, long count) {
		
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
