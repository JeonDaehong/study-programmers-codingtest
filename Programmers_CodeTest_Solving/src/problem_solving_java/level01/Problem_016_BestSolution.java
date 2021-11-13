package problem_solving_java.level01;


// Math.sqrt()는 제곱근을 계산해주는 코드이다.
// A % A의 제곱근 == 0 이면 왜 약수의 갯수가 홀수인지 공부하기
public class Problem_016_BestSolution {
	
	public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
        
    }
}
