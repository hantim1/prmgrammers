package lv0;

public class NumSearch {
	  public int solution(int num, int k) {
	        int answer = 0;
	        int [] arr = new int[(int)(Math.log10(num)+1)];
	        
	        for(int i = 0; i < arr.length; i++) {
	        	arr[arr.length-1-i] = num%10;
	        	num = num/10;
	        }
	        for(int i = 0; i < arr.length; i++) {
	        	if(arr[i]== k) {
	        		 answer++ ;
	        		 break;
	        	}
	        	else {
	        		answer++;
	        	}
	        	if(i==arr.length-1 && arr[i]!=k) {
	        		answer =-1;
	        	}
	        	     		
	        	
	        }
	        
	        return answer;
	       
	    }
}
