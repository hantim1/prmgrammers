package lv0;

import java.util.Arrays;

public class Test {

	 
	 public static String[] solution(String my_str, int n) {
		 String[] answer = new String [(int)(Math.ceil(my_str.length()/(n+.0)))];
	        for(int i = 0; i <(int)(Math.ceil(my_str.length()/(n+.0))); i++){
	            if(i == (int)(Math.ceil(my_str.length()/(n+.0)))-1){
	               answer[i] = my_str.substring(i*n); 
	            }
	            else{
	                answer[i] = my_str.substring(i*n,i*n+n);
	            }  }
	        return answer;
        

   	}
	 
	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		
		System.out.println(Arrays.toString(solution(A,2)));
		System.out.println(Math.ceil(7/(2+.0)));
		
	}

}
