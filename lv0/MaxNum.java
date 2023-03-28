package lv0;

public class MaxNum {
	
	 public int[] solution(int[] array) {
		       int[] answer = new int[2];
			        int max = array[array.length-1];
		            int idx = array.length-1;
			        int tmp;
			      
			        for(int i = 0; i < array.length; i++){
			            if(max<array[i]){
			                tmp=max;
			                max = array[i];
			                array[i] = tmp;
		                    idx = i;
			            }
			        }
		        answer[0] = max;
		        answer[1] = idx;
			    return answer;
		    
	    }
}
