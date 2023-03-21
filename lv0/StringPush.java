package lv0;

public class StringPush {
	
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
}
