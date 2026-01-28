import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
        multiple(1,2,"Rishi","Rohan");
        demo(4,5,5,5);
        demo("rishi","druva");
//        demo();  ambuiguity error

    }

    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void demo(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a,int b,String ...c){
        System.out.println(a + " " + b + " " + Arrays.toString(c));
    }

//    static void multiple(int a,String ...c,int b)
    //this is not posssible
    //variable length argument must always come at the end

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
