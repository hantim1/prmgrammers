package lv0;

import java.util.Arrays;

public class Test {

	 public static int[] solution(int num, int total) {
	        int[] answer = new int [num];
	        answer[0] = total/num - (num-1)/2;
	        for(int i = 1; i < num; i++) {
	        	answer[i] = answer[i-1]+1;
	        }
	        
	        return answer;
	    }
	 
	 public static int solution(String A, String B) {
			int answer = 0;
			
				String a = A;
				int i = 0;
				while(!(a.equals(B))) {
					if(i > a.length()) {
						answer = -1;
						break;
					}
					a = a.substring(a.length()-1)+a.substring(0,a.length()-1);
					
					i++;
				}
				answer = i;
				
	       return answer;
	   }
	public static void main(String[] args) {
		int num = 4;
		int total = 14;
		
		System.out.println(Arrays.toString(solution(num,total)));
		
		String A = "hello";
		String B = "ohell";
		
		System.out.println(solution(A,B));
		

	}

}
