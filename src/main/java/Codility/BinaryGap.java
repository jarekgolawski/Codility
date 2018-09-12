package Codility;

public class BinaryGap {
	public static int solution(int N) {

        int binarygap = -1;
        int maxbinarygap = 0;
        
        while(N>0) {
        	if ((N & 1)==1) {
        		if(maxbinarygap<binarygap) {
        		    maxbinarygap=binarygap;
        		}
        		binarygap = 0;
        	}
        	else if (binarygap != -1) {
        		binarygap++;
        	}
        	N >>= 1;
        }
        return maxbinarygap;
    }
}
