package Codility;

public class PermMissingElem {

	 public static int solution(int[] A) {
	        int sumA=0;
	        int sumAplus=0;
	        int N = A.length+1;
	        
	        for (int temp: A) {
	            sumA+=temp;
	        }
	        
	        for (int i=1; i<=N; i++) {
	            sumAplus+=i;      
	        }
	        
	        int result = sumAplus - sumA;
	        return result;
	    }
}
