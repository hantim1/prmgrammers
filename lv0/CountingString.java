package lv0;

import java.util.Arrays;

public class CountingString {
	public int solution(String my_string) {
		int answer = 0;
        String [] arr = new String[my_string.length()];
        arr = my_string.split(" ");
        answer = Integer.parseInt(arr[0]);
        
        for(int i = 0; i< arr.length; i++){
        	while(!(i+1==arr.length)) {
        		if(arr[i+1].equals("+")){
                    answer += Integer.parseInt(arr[2]);
               }
               else if(arr[i+1].equals("-")){
                    answer -= Integer.parseInt(arr[2]);
               }
        		i++; 
        	}
        	       
        }
       
        return answer;
    }
}
