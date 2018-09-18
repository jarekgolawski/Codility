package Codility;

public class TapeEquilibrium {
	
	public int solution(int[] A) {
    
		int right=0;
		int left=0;
		int diff;
		for(int temp : A ) {
			left += temp;
		}
		
		int N = A.length;
		int min = Integer.MAX_VALUE;
		
		for (int i=N-1; i>0; i--) {
			left -= A[i];
			right += A[i];
			diff=Math.abs(left-right);
			min=Math.min(min, diff);
		}
		return min;
	}
}
