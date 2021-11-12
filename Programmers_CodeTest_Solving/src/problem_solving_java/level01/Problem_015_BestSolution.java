package problem_solving_java.level01;

import java.util.HashMap;
import java.util.Map;

public class Problem_015_BestSolution {

public static int[] solution(int N, int[] stages) {
		
		Map<Integer , Double> stageFailureRateList = new HashMap<Integer , Double>();
		
		int[] answer = new int[N];
		
		int nowStage = 1;
		int stageAllPlayer = 0;
		int stagePassPlayer = 0;
		double fail = 0;
		
		while(nowStage <= N) {
			for (int i=0; i<stages.length; i++) {
				if (stages[i] >= nowStage) stageAllPlayer++;
				if (stages[i] > nowStage) stagePassPlayer++;
			}
			
			if (stageAllPlayer != 0 && stageAllPlayer-stagePassPlayer != 0) {
				fail = (double)(stageAllPlayer-stagePassPlayer) / (double)stageAllPlayer;
			} else {
				fail = 0;
			}
			
			stageFailureRateList.put(nowStage, fail);
			
			stageAllPlayer = 0;
			stagePassPlayer = 0;
			nowStage++;
		}
		
		double max = -1;
		int idx = 0;
		for (int k=0; k<N; k++) {
			max = -1;
			idx = 0;
			for (int i : stageFailureRateList.keySet()) {
				if (stageFailureRateList.get(i) > max) {
					max = stageFailureRateList.get(i);
					idx = i;
				}
			}
			answer[k] = idx;
			stageFailureRateList.remove(idx);
		}

        return answer;
        
	}
	
}
