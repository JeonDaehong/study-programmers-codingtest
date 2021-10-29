package problem_solving_java.level01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 1번 좋은 예시 (내 답안과 비슷함)
class Problem_005_BestSolution {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> nums = new ArrayList<Integer>();

        for(int i=0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1]!=0){
                    nums.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1]=0;
                    break;
                }

            }

        }
        for(int k=0;k<nums.size();k++){
            if(k!=(nums.size()-1)){
                if(nums.get(k)==nums.get(k+1)){
                    nums.remove(k);
                    nums.remove(k);
                    answer++;
                    k=-1;

                }

            }
        }

        return answer*2;
    }
}



// 2번 좋은 예시 (Stack의 isEmpty와 push, pop, peek를 이용.)
class Problem_005_BestSolution02 {
	 public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        Stack<Integer> stack = new Stack<>();
	        for (int move : moves) {
	            for (int j = 0; j < board.length; j++) {
	                if (board[j][move - 1] != 0) {
	                    if (stack.isEmpty()) {
	                        stack.push(board[j][move - 1]);
	                        board[j][move - 1] = 0;
	                        break;
	                    }
	                    if (board[j][move - 1] == stack.peek()) {
	                        stack.pop();
	                        answer += 2;
	                    } else
	                        stack.push(board[j][move - 1]);
	                    board[j][move - 1] = 0;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
}