package lv0;

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
