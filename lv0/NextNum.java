package lv0;
/*
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
 * 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 * 
 * */
public class NextNum {

	public int solution(int[] common) {   
        int answer = 0;
        
        if(common[1]-common[0] == common[2]- common[1]){
	        answer = common[0]+(common[1]-common[0])*(common.length);
		}
		else{
		    answer = (int)(common[0]*(Math.pow((common[1]/common[0]), common.length)));
		}

        return answer;
    }
}
