package Codility;

public class TapeEquilibriumFirst {

	public int solution(int[] A) {
		int beforeP;
        int pAndAfter;
        int between;
        int MinBetween=-1;
        for (int i=0; i<A.length-1; i++) {
        	beforeP=0;
            for (int j=0; j<=i; j++) {
                beforeP += A[j];
            }
            pAndAfter=0;
            for (int j=i+1; j<A.length; j++ ) {
                pAndAfter+=A[j];
            }
            between = Math.abs(beforeP - pAndAfter);
            if (MinBetween==-1) { MinBetween=between; }
            if (between<MinBetween) {MinBetween=between; }
        }
        return MinBetween;
	}
}
