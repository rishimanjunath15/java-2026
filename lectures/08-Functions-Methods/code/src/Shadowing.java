public class Shadowing {
    static int x = 65; //this will be shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x);
        int x = 34;
        System.out.println(x);
        read();
    }

    static void read() {
        int x = 76;
        System.out.println(x);

    }
}
