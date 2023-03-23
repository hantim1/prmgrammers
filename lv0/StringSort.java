package lv0;

import java.util.Arrays;

public class StringSort {

	  public String solution(String my_string) {
	        String answer = "";
	        char [] arr = new char [my_string.length()];
	        my_string = my_string.toLowerCase();
	        for(int i = 0; i< arr.length; i++) {
	        	arr[i] = my_string.charAt(i);
	        }
	        
	        Arrays.sort(arr);
	       
	        for(int i = 0; i < arr.length; i ++) {
	        	answer += arr[i];
	        }
	        return answer;
	  }
}
