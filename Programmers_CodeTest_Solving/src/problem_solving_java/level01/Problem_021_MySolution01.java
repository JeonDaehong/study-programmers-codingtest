package problem_solving_java.level01;

import java.util.ArrayList;
import java.util.List;

// 풀이시간    : 2021-11-22 10:15 ~ 10:36
// 결과	  	   : 100.0 / 100.0 (정확성: 100.0)
// 나의 판단   : 클래스를 활용하여 문제를 구해봤는데, 다음에는 Math의 max와 min을 활용하여 깔끔하게 풀어보자.

/*
* <문제 제목> : 최소직사각형

* <문제> : 
	→ 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
	  다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
	  작아서 들고 다니기 편한 지갑을 만들어야 합니다.
	  이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

	  아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
	  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	  명함 번호			가로 길이		세로 길이
	  1					60				50
  	  2					30				70
	  3					60				30
	  4					80				40
	  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	  가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
	  하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다.
	  이때의 지갑 크기는 4000(=80 x 50)입니다.

	  모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
	  모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
	  지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        return answer;
    }
}
	
	
* <제한사항> :
	★ sizes의 길이는 1 이상 10,000 이하입니다.
		- sizes의 원소는 [w, h] 형식입니다.
		- w는 명함의 가로 길이를 나타냅니다.
		- h는 명함의 세로 길이를 나타냅니다.
		- w와 h는 1 이상 1,000 이하인 자연수입니다.
	
	
* <입.출력 예시>
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	sizes													result
	[[60, 50], [30, 70], [60, 30], [80, 40]]				4000
	[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]			120
	[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]			133
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

	★ 입출력 예 #1
		→ 문제 예시와 같습니다.
		
	★ 입출력 예 #2
		→ 명함들을 적절히 회전시켜 겹쳤을 때,
		  3번째 명함(가로: 8, 세로: 15)이 다른 모든 명함보다 크기가 큽니다.
		  따라서 지갑의 크기는 3번째 명함의 크기와 같으며, 120(=8 x 15)을 return 합니다.
		
	★ 입출력 예 #3
		→ 명함들을 적절히 회전시켜 겹쳤을 때,
		  모든 명함을 포함하는 가장 작은 지갑의 크기는 133(=19 x 7)입니다.

*/

class Problem_021_MySolution012 {
	
	public int solution(int[][] sizes) {
		
		List<SaveData> dataList = new ArrayList<>();
		
        int answer = 0;
        
        // 1. 배열의 0에는 큰수, 1에는 작은 수 정렬
        for (int i=0; i<sizes.length; i++) {
        	SaveData data = new SaveData(sizes[i]);
        	dataList.add(data);
        }
        
        // 2. 가로와 세로 각각의 가장 큰 수 구하기
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i=0; i<dataList.size(); i++) {
        	if (dataList.get(i).a > maxWidth) {
        		maxWidth = dataList.get(i).a;
        	}
        	if (dataList.get(i).b > maxHeight) {
        		maxHeight = dataList.get(i).b;
        	}
        }
        
        // 3. 곱한다
        answer = maxWidth * maxHeight;
        
        return answer;
        
    }
	
}

// 큰 수, 작은 수 구분 클래스
class SaveData {
	
	int a;
	int b;
	
	SaveData (int[] num) {
		if (num[0] == num[1]) {
			this.a = num[0];
			this.b = num[1];
		} else {
			this.a = (num[0] > num[1]) ? num[0] : num[1];
			this.b = (num[0] < num[1]) ? num[0] : num[1];
		}
		
	}
	
}


