class Studentsss {
    int roll_no;
    String name;
    float marks;

//    Studentsss(){
//        this.roll_no = 43;
//        this.name = "Rishi";
//        this.marks = 43.7f;
//    }
    void greeting(){
        System.out.println("hello my name is " +this.name );
    }
    void changename(String newname){
        this.name = newname;
    }

    Studentsss(){
        //this is how you call a constructor from another constructor
        //internally: new Studentsss(00,"deafault person",00.0f);
        this(00,"deafault person",00.0f);
    }

    //Studentsss druva = new Students(12,"druva",67.6f);
    //here this will be replace by druva
    Studentsss(int roll_no,String name,float marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }


    public static void main(String[] args) {
//        Studentsss rahul = new Studentsss();
//        rahul.changename("raghav");
//        rahul.greeting();

//        Studentsss student1 = new Studentsss(99,"dinga",34.9f);
//        System.out.println(student1.roll_no);
//        System.out.println(student1.name);
//        System.out.println(student1.marks);

//        Studentsss random = new Studentsss();
//        System.out.println(random.roll_no);
//        System.out.println(random.name);
//        System.out.println(random.marks);

        Studentsss random2 = new Studentsss();
        System.out.println(random2.name);
    }
}
