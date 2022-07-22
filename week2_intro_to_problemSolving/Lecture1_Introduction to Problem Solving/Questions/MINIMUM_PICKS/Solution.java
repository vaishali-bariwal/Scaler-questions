public class Solution{
   
    /**
     * @param args
     */
    public static void main(String[] args) {
       int[] a =  {11, 17, 100, 5};
        System.out.println(solve(a));
    }

    /**
     * @param A
     * @return
     */
    public static int solve(int[] A) {
        int even_max = -1000000000;
        int odd_min = 1000000000;
        for(int i = 0;i<A.length;i++)
        {
            if((A[i]&1)==0)
            {
                even_max = even_max < A[i] ? A[i] : even_max;
            }
            else
            {
               odd_min = odd_min > A[i] ? A[i] : odd_min; 
            }
        }
        return even_max-odd_min;
    }
}