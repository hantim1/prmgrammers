package lv0;

public class CountingSeven {
	public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i< array.length; i ++) {
        	while(array[i]/10.0 > 0.1){
                if(array[i] % 10 ==7) {
                    array[i] = array[i]/10;
        		answer++;
                }
                else {
                	array[i] = array[i]/10;
                }
        	}
        }
        return answer;
}
}
