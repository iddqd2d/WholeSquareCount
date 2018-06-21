public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(4, 17));
        System.out.println(new Solution().solution(new int[]{-1,2,-1,1,3,1,4,5}));

    }



    public int solution(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {

            double sqrt = Math.sqrt(i);
            if (sqrt % 1 == 0.0) {
                count++;
                     if (i != 0 ) i += (sqrt*2)-1;
            }
        }
        return count;
    }

    public int solution(int[] t) {
        int coldT = 0;
        int maxT = t[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] < 0) coldT = i + 1;
        }

        for(int i = 0; i < coldT; i++) {
            if(t[i] > maxT) maxT = t[i];
        }



        for(int i = coldT; i < t.length; i++) {
            if(t[i] <= maxT) {
                maxT = t[i];
                coldT = i;
            }
        }
         return coldT+1;





    }

}
