package code.rishi;

public class Largest {
    public static void main(String[] args) {

        //q: find the largest number
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        else{
//            System.out.println("Largest number is:" +max);
//        }

        int maximum = Math.max(12,2);
        System.out.println(maximum);
        int maximum1 = Math.max(32,Math.max(12,2));
        System.out.println(maximum1);


    }
}
