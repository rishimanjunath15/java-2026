public class Main {
    public static void main(String[] args) {
        int[] arr = {12,54,23,65,26,98,9};
        int target = 65;

        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if not found return -1

    static int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
