public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-32,-13,0,4,5,6,32,56,67,78};
        int target = 32;
        int res = orderagnostic(arr,target);
        System.out.println(res);
    }

    static int orderagnostic(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        if(arr[start] < arr[end]) {
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid+1;
                }
            }
            else {
                if(target>arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    }

