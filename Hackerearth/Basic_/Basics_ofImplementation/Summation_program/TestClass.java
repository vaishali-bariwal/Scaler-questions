import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String test = br.readLine();
        int t = Integer.parseInt(test);
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            
            long ans = 0;
            long root = (long)Math.sqrt(n);
            for(long i=1;i<=root;i+=1){
                ans = ans+=(n/i);
            }
            ans = ans*2-(root*root);   
            System.out.println(ans);   
            
            
        }
        

    }
}
