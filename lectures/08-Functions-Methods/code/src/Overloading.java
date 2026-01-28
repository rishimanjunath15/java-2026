public class Overloading {
    public static void main(String[] args) {
        add(5);
        add("rishi");
        int sum = add(2,5);
        System.out.println(sum);
        int res = add(2,5,3);
        System.out.println(res);
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }

    static int add(int a,int b){
        return a+b;
    }

    static void add(int a){
        System.out.println(a);
    }
    static void add(String name){
        System.out.println(name);
    }
}
