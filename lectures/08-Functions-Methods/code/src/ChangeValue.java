import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int num[] = {1,25,3,4,5,867,24};
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int nums[]){
        nums[0] = 99; //if u make a change to the object via ref variable , same object will be changed
    }

}
