package problem_solving_java.level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// 이건 연구해보기
class Problem_014_BestSolution01 {
	public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}


// HashSet을 이용한 문제풀이 공부하기
// HashSet은 중복된 원소를 허용하지 않기때문에, 중복값을 제거하기에 아주 좋다.
class Problem_014_BestSolution02 {
	
	public int solution(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        return (nums.length / 2 > a.size()) ? a.size() : nums.length / 2;
    }

}