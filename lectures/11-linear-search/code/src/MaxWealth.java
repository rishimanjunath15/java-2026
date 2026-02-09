public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {12,121,12},
                {13,11,10},
                {23,54,12}
        };

        int res = maximumwealth(accounts);
        System.out.println(res);
    }

    static int maximumwealth(int[][] accounts){
        int ans  = Integer.MIN_VALUE;
        for (int person = 0;person<accounts.length;person++){
            int sum = 0;
            for (int account = 0;account<accounts[person].length;account++){
                sum = sum + accounts[person][account];
            }
            if (sum > ans){
                ans = sum;
            }

        }

        return ans;

    }
}
