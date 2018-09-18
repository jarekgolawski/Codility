package Codility;

public class OddOccurrencesInArray {
		
	public static int solution(int[] A) {
		
		int solution=0;
        for (int temp: A) {
            solution^=temp;
        }
        return solution;  
	}
}
