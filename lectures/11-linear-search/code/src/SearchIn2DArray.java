import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {23,4,1},
                {18,12,3,9},
                {78,89,34,56},
                {180,12}
        };
        int target = 12;

        int[] ans = searchtarget(nums,target);  //format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(nums));
    }


    static int max(int[][] nums){
        int maximum = nums[0][0];
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] > maximum) {
                    maximum = nums[row][col];
                }
            }
        }
        return maximum;
    }



    static int[] searchtarget(int[][] nums,int target){
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
