import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class TestClass {
    public static void main(String args[] )
    
    throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(":");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int min = h*60 + m ;
        int passes = (11*min/720)+1;
        System.out.println(passes);
    }
}