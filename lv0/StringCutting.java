package lv0;

public class StringCutting {

	  public String[] solution(String my_str, int n) {
	        String[] answer = new String [(int)(Math.ceil(my_str.length()/(n+.0)))];
	        for(int i = 0; i <(my_str.length()/n)+1; i++){
	            if(i == (my_str.length()/n)-1){
	               answer[i] = my_str.substring(i*n); 
	            }
	            else{
	                answer[i] = my_str.substring(i*n,i*n+n);
	            }  }
	        return answer;
	    }
}
