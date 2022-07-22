import java.util.Arrays;

public class Solution{
   
    /**
     * @param args
     */
    public static void main(String[] args) {
       int[] a =  {1, 2, 3};
        System.out.println(solve(a));
    }

    public static int solve(int[] A) {

        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length-1];
        int count = 0;

        for (int i = 1; i < A.length-1; i++) {
            if(A[i] > min && A[i] < max){
                count++;
            }
        }
        return count;

    }
}