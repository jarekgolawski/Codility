package Codility;

public class CyclicRotation {
	
		private static void rotate(int[] B) {
			int a=B[0];
			int b;
			B[0]=B[B.length-1];
			for (int i=0; i<B.length-1; i++) {
				b = B[i+1];
				B[i+1]= a;
				a = b;
			}
		}
   
		public static int[] solution(int[] A, int K) {
     
			if (A.length==0) { return A; }
			
			int n = K%A.length;
     
			if (n == 0 || K % A.length == 0) { return A; }
			
			for (int i=0; i<n; i++) {
				rotate(A);
			}
			return A;
		}
        

}
