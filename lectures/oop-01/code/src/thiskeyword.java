public class thiskeyword {
    int roll_no;
    String name;
    float marks;

    thiskeyword(){
        this.roll_no = 43;
        this.name = "Rishi";
        this.marks = 43.7f;
    }

    void greeting(){
        System.out.println("hello my name is " +marks);
        System.out.println("hello my name is " +this.marks);
    }

    void changename(int newname){
        marks = newname;
    }

    public static void main(String[] args) {
                thiskeyword rahul = new thiskeyword();
        System.out.println(rahul.roll_no);
                rahul.marks = 87;
                System.out.println(rahul.roll_no);


                thiskeyword suresh = new thiskeyword();
                System.out.println(suresh.roll_no);
        rahul.greeting();
        suresh.greeting();
        rahul.changename(76);
        rahul.greeting();
            }
        }

