package lv0;

public class SerialArray {
	
	 public int[] solution(int num, int total) {
	        int[] answer = new int [num];
	        for(int i = 0; i < answer.length; i++) {
	        	answer[i] = answer[answer.length]-(answer.length-1-i); 
	        }
	        
	        return answer;
	    }


}
 