package Codility;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
        int distance = Y - X;
        double jumps = Math.ceil((double)distance/D);
        return (int)jumps;
    }
}
