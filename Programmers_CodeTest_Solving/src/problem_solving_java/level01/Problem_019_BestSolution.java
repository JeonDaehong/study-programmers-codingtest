package problem_solving_java.level01;

import java.util.Set;
import java.util.TreeSet;

// TreeSet을 이용하면, 중복된 숫자도 걸러주고, 자동 정렬도 해준다.
public class Problem_019_BestSolution {

	public Set<Integer> solution(int[] numbers) {
		
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0; i < numbers.length; i++) {	
			for(int j=i+1; j < numbers.length; j++) {	
				set.add(numbers[i] + numbers[j]);
			}
			
		}
		
		return set;
		
	}
}
