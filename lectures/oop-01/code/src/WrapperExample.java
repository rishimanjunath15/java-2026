class WrapperExample {

    public static void main(String[] args) {

        Integer a = 45;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b); // will NOT swap

        final A rishi = new A("rishi manjunath");
        rishi.name = "other name";   // allowed
        System.out.println(rishi.name);

        // rishi = new A("new object"); // not allowed
    }

    // This will not swap
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
