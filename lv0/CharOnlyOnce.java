package lv0;

import java.util.ArrayList;

public class CharOnlyOnce {
	   public String solution(String s) {
	        String answer = "";
			int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
					't', 'u', 'v', 'w', 'x', 'y', 'z' };
			for (int i = 0; i < s.length(); i++) {

				for (int j = 0; j < arr.length; j++) {
					if (s.charAt(i) == arr[j]) {
						count[j]++;
					}
				}
			}
			for(int i = 0 ; i <count.length; i++) {
				if(count[i]==1) {
					answer += arr[i];
				}
			}
			
	        
	        return answer;
	    }
}
