package lv0;

public class Counting369 {
	
	public int solution(int order) {
        int answer = 0;
        while(order/10.0 > 0.01){
            if(order%10 == 3 || order%10 == 6 || order%10 == 9){
                answer++;
            }
            order = order /10;
        }
        return answer;
    }
	
}
