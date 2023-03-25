package lv0;

public class OXQuiz {
	 public String[] solution(String[] quiz) {
		   String[] answer = new String [quiz.length];
	        for(int i = 0; i < quiz.length; i++){
	            String [] arr = new String [5];
	            int x;
	                arr = quiz[i].split(" ");
	               
	            if(arr[1].equals("+")) {
	            	x = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
	            	
	            	if(x == Integer.parseInt(arr[4])) {
	            		answer[i] = "O";
	            	}
	            	else {
	            		answer[i]= "X";
	            	}
	            }
	            else if(arr[1].equals("-")) {
	            	x = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
	            
	            	if(x == Integer.parseInt(arr[4])) {
	            		answer[i] = "O";
	            	}
	            	else {
	            		answer[i]= "X";
	            	}
	            }
	            
	        }
	            
	        
	        return answer;
	   }
	
}
