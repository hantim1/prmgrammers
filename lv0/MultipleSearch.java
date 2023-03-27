package lv0;

public class MultipleSearch {
	 public int[] solution(int n, int[] numlist) {
	        int[] answer = {};
	        int length=0;
	        for(int i = 0; i < numlist.length; i++){
	           
	        	if(numlist[i] %n == 0){
	               length++;
	            }
	        }
	        answer = new int[length];
	        int k = 0;
	        for(int i  = 0; i< numlist.length; i++) {
	        	if(numlist[i] %n == 0) {
	        		answer[k] = numlist[i];
	        		k++;
	        	}
	        }
	        return answer;
	    }
}
