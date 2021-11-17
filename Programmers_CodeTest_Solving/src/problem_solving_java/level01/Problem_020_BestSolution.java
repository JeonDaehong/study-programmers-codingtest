package problem_solving_java.level01;

import java.util.Calendar;
import java.util.Locale;

// 연, 월, 일, 요일에 대한 계산을 알려주는 함수
public class Problem_020_BestSolution {

	public String getDayName(int month, int day) {
		
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
                        .setDate(2016, month - 1, day).build();
        
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
	
}


// 라이브러리를 사용하지 않고 가장 깔끔하게 만들 수 있는 코드. 공부 할 것 !
class Problem_020_BestSolution_02 {
	
    public String getDayName(int a, int b) {
    	
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        
        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }
}