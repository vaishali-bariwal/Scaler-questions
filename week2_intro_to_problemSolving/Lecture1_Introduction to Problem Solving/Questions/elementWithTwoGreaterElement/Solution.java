import java.util.Arrays;

public class Solution{
   
    /**
     * @param args
     */
    public static void main(String[] args) {
       int[] a =  {11, 17, 100, 5};
        System.out.println(solve(a).length);
    }

    /**
     * @param A
     * @return
     */
    public static int[] solve(int[] A) {

        int[] B = A.clone();
        Arrays.sort(B);
        int first = B[B.length-1];
        int second = B[B.length-2];
        int result[] = new int[B.length];
        int index =0;
        for(int i = 0 ; i < A.length;i++)
        {
            if(A[i] < first && A[i] < second)
            {
                result[index++] = A[i]; 
            }
        }
        return Arrays.copyOfRange(result,0,index);
    
    }
}