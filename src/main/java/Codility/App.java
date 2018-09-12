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
        
    }
}
