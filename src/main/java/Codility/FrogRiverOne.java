package Codility;

import java.util.HashSet;

public class FrogRiverOne {

	public static int solution(int X, int[] A) {
		HashSet<Integer> checked = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X)
				checked.add(A[i]);

			if (checked.size() == X)
				return i;
		}

		return -1;
    }
	
}
