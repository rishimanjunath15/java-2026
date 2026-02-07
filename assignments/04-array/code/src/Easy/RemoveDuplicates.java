package Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1,1,1,2,2,3,3,4,4};

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int uniquelength = i + 1;
        System.out.println("unique count: " + uniquelength);
        for (int k = 0; k < uniquelength; k++) {
            System.out.println(nums[k]);
        }
    }
}
