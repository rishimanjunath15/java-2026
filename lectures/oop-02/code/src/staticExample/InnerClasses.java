package staticExample;

public class InnerClasses {

//    class Test{
//        String name;
//        public Test(String name){
//            this.name = name;
//        }
//    }

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("rishi");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
