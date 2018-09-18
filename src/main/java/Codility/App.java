package Codility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int dosprawdzenia = 11;
    	int result = BinaryGap.solution(dosprawdzenia);
        System.out.println(result);
        Integer binary = new Integer(10);
        System.out.println(binary.toBinaryString(dosprawdzenia));
        dosprawdzenia = dosprawdzenia>>1;
        System.out.println(binary.toBinaryString(dosprawdzenia));
        dosprawdzenia = dosprawdzenia>>1;
        System.out.println(binary.toBinaryString(dosprawdzenia));
        dosprawdzenia = dosprawdzenia>>1;
        System.out.println(binary.toBinaryString(dosprawdzenia));
        dosprawdzenia = dosprawdzenia>>1;
        System.out.println(binary.toBinaryString(dosprawdzenia));
        
        int[] z = {1,2,3,4,5};

        
        
        int x[] = {2,5,6,9,4};
        for (int i=0; i<x.length; i++) {
        	System.out.print(x[i]);
        }
        System.out.println("\n");
        CyclicRotation.solution(x, 3);
        for (int i=0; i<x.length; i++) {
        	System.out.print(x[i]);
        }
        
    }
}
