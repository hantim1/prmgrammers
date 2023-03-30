package lv0;

import java.util.Arrays;

public class Divisor {

	 public int[] solution(int n) {
	        int[] answer = new int [n/2+1];
	        for(int i =1; i <n/2+1; i++){
	            if(n % i == 0){
	            	if(n/i==i) {
	            		answer[i-1] = i;
	            		break;
	            	}
	                answer[i-1] = i;
	                answer[answer.length-1-i] = n/i;
	            }
	        }
	        Arrays.sort(answer);
	        return answer;
	    }
}
