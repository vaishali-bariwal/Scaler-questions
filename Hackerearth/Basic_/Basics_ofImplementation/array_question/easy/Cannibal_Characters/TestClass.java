package Hackerearth.Basic_.Basics_ofImplementation.array_question.easy.Cannibal_Characters;

import java.io.*;
import java.util.Arrays;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();

            int out_ = Minimum_Operations(n, s);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int Minimum_Operations(int n, String s){
       // Write your code here
        int result = 0;
        int[] ch = new int[n];
        Arrays.fill(ch, -1);
        for (int i = 0 ; i < n ; i++) {

            char c = s.charAt(i);
            int next = s.indexOf(c, i+1);
            if(next != -1 && ch[next] == -1){
                int left = s.indexOf(c, next+1);
                if( left != -1){
                    ch[i] = 1;
                    ch[left] = 1;
                    result++;
                    //System.out.println(i +" "+next+ " "+left);
                }
                else{
                    ch[i] = 1;
                    result++;
                }
                
            }
        }
       
        return result;
    
    }
}