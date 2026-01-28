public class Scope {
    public static void main(String[] args) {

        int num1 = 54;
        int num2 = 78;
        System.out.println(num1);

        {
//           int num1 = 97; already initialized outside the block in the same method. hence you cannot initialize again
            num1 = 789;  //we can change
            System.out.println(num1);
            int num3 = 79;
            System.out.println(num2);
            //values initialized in this block will remain in this block
        }
//        System.out.println(num3); //this will give me an error
        System.out.println(num1);
        System.out.println(num2);

        //scoping in for loops
        for(int i = 1; i<=5;i++){
            System.out.println(i);
            int num4 = 54;
            System.out.println(num4);
        }
//        System.out.println(i);  //we cannot initialize outside the loop
//        System.out.println(num4); //we cannot initialize outside the loop
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
