import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int t = Integer.parseInt(name);
        while(t-- > 0){
            String[] nmk = br.readLine().split(" ");
            double n = Double.parseDouble(nmk[0]);
            double m = Double.parseDouble(nmk[1]);
            double k = Double.parseDouble(nmk[2]);
            int ans = (int)Math.ceil(n/k) + (int)Math.ceil(m/k);
            System.out.println(ans);
        }
        
        

    }
}
