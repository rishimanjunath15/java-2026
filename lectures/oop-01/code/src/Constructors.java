class Constructors {
    int roll_no;
    String name;
    float marks;

    Constructors(){
        this.roll_no = 43;
        this.name = "Rishi";
        this.marks = 43.7f;
    }

    public static void main(String[] args) {
        Constructors rahul = new Constructors();
        System.out.println(rahul.roll_no);
        Constructors suresh = new Constructors();
        System.out.println(suresh.roll_no);
    }
}