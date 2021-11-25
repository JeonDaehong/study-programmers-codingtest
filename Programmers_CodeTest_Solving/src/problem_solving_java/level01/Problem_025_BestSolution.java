package problem_solving_java.level01;

// 베스트 솔루션 (substring을 활용하였음)
public class Problem_025_BestSolution {
	
		String getMiddle(String word) {

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }
}
