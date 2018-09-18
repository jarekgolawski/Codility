package Codility;

public class PermCheck {
	
	public int solution(int[] A) {
		 int sumA=0;
	        for (int temp: A) {
	            sumA+=temp;
	        }
	        int correctSum=0;
	        for(int i=1; i<=A.length; i++) {
	            correctSum+=i;
	        }
	        
	        
	        
	        if(sumA==correctSum) return 1;
	    
	        else return 0;
    }

}
