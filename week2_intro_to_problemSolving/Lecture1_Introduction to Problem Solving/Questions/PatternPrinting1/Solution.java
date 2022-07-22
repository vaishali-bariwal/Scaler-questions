public class Solution{
   
    /**
     * @param args
     */
    public static void main(String[] args) {
       int a = 3;
       
       int[][] res = solve(a);
       for (int i = 0; i < res.length; i++) {
           for (int j = 0; j < res.length; j++) {
               System.out.print(res[i][j]+" ");
           }
           System.out.println();
       }
    }

    public static int[][] solve(int A) {

        int[][]  a = new int[A][A];

        for (int i = 0; i < a.length; i++) {
           
            for (int j = 0; j <= i; j++) {
                a[i][j] = j+1;
            }
        }
        return a;
    }
}