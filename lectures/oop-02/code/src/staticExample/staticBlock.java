package staticExample;

//this isa demo to show the initialization of static variables

public class staticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        staticBlock sb1 = new staticBlock();
        System.out.println(staticBlock.a);
        System.out.println(staticBlock.b);

        staticBlock.b += 3;

        staticBlock sb2 = new staticBlock();
        System.out.println(staticBlock.a);
        System.out.println(staticBlock.b);


    }
}