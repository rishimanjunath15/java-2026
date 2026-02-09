public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {12,32,1,38,65,87,45,65,13};
        int target = 87;
        boolean result = searchinrange(nums,target,1,6);
        System.out.println(result);

    }

//    static boolean searchinrange(int[] nums,int target){
//        if (nums.length == 0){
//            return false;
//        }
//
//        for (int i = 1; i < 6; i++) {
//            if (target == nums[i]){
//                return true;
//            }
//        }
//        return false;
//    }
static boolean searchinrange(int[] nums,int target,int start,int end){
    if (nums.length == 0){
        return false;
    }

    for (int i = start; i < end; i++) {
        if (target == nums[i]){
            return true;
        }
    }
    return false;
}
}
