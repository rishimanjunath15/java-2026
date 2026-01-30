import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner input = new Scanner(System.in);
        int num;
        int temp = 0;

        while(true){
            num = input.nextInt();
            if(num == 0){
                break;
            }else if(num>temp){
                temp = num;
            }
        }
        System.out.println(temp);

    }
}
