public class Main {
    public static void main(String[] args) {
        int[] arr = {-32,-13,0,4,5,6,32,56,67,78};
        int target = 32;
        int res = binarysearch(arr,target);
        System.out.println(res);

    }
    static int binarysearch(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;



    }
}
