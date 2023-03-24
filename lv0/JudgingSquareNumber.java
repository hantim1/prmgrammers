package lv0;

public class JudgingSquareNumber {
	 public int solution(int n) {
	        int answer = 0;
	        if(Math.pow(n,(double)1/2) == Math.ceil(Math.pow(n,(double)1/2))){
	            answer = 1;
	        }
	        else{
	            answer = 2;
	        }
	        return answer;
	    }
}
