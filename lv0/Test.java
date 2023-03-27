package lv0;

import java.util.Arrays;

public class Test {
	
	 
	 public static int[] solution(int n, int[] numlist) {
	        int[] answer = {};
	        int length=0;
	        for(int i = 0; i < numlist.length; i++){
	           
	        	if(numlist[i] %n == 0){
	               length++;
	            }
	        }
	        answer = new int[length];
	        int k = 0;
	        for(int i  = 0; i< numlist.length; i++) {
	        	
	        	if(numlist[i] %n == 0) {
	        		answer[k] = numlist[i];
	        		k++;
	        	}
	        }
	        return answer;
	    }

	 
	public static void main(String[] args) {
		String str = "AVCE";
		String [] arr = new String [str.length()];
		
		arr[0] = str.substring(0,1);
		arr[1] = str.substring(1,2);
		arr[2] = str.substring(2,3);
		arr[3] = str.substring(3);
	    System.out.println(Arrays.toString(arr));   
	}

}
