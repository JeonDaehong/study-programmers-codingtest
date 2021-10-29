package problem_solving_java.level01;

import java.util.Random;

public class dfdsdfsf {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Problem_005_MySolution01 test = new Problem_005_MySolution01();
		
		int bored[][]= {
				{0,0,0,0,0},
				{0,4,0,4,0},
				{0,4,2,3,0},
				{0,3,1,1,0},
				{0,1,3,8,0},
				{0,1,7,8,0},
				{1,7,1,9,0},
				{5,5,1,7,1},
				{7,5,2,2,3}
				};
		int[] moves = new int[100];
		for (int i=0; i<moves.length; i++) {
			moves[i] = ran.nextInt(5);
		}
		
		
		
		int i = test.solution(bored, moves);
		System.out.println(i);

	}

}
