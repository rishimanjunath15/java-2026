public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,3455,2,62,7896};

        int digitres = digits(0);
        System.out.println(digitres);

        boolean evenres = even(234546);
        System.out.println(evenres);

        int res = findNumbers(nums);
        System.out.println(res);
    }

    static int findNumbers(int[] nums){
           int count = 0;
        for (int num = 0; num < nums.length; num++) {
            if(even(nums[num])){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contain even digits or not
    static boolean even(int num){
        int numofdigits = digits(num);
        if (numofdigits%2==0){
            return true;
        }
        return false;
    }

    //cunt number of digits in a number
    static int digits(int num){
        if(num <0){
            num = num * -1;
        }

        if(num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
