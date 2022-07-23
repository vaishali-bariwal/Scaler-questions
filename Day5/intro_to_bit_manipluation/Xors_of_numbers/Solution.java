import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] n_q = br.readLine().split(" ");
        int n = Integer.parseInt(n_q[0]);
        int q = Integer.parseInt(n_q[1]);
        String[] arr = br.readLine().split(" ");
        int[] a= new int[n];
        int tot_xor = 0;
        for(int i = 0;i < arr.length;i++)
        {
             a[i] = Integer.parseInt(arr[i]);  
             tot_xor = tot_xor ^ a[i]; 
        }
        int[] pre = new int[n];
        pre[0] = a[0];
        for(int i = 1;i < arr.length;i++)
        {
             pre[i] = pre[i-1] ^ a[i];   
        }
        while(q-- > 0){
            String[] l_r = br.readLine().split(" ");
            int l = Integer.parseInt(l_r[0])-1;
            int r = Integer.parseInt(l_r[1])-1;
            System.out.println(pre[r] ^ (l > 0 ? pre[l-1] : 0) ^ tot_xor) ;
        }
        

    }
}
