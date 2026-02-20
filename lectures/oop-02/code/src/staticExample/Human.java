package staticExample;

public class Human {
    int age;
    String name;
    double salary;
    boolean married;
    static long population;

    public Human(int age,String name,double salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population +=1;



    }
    static void message() {
        System.out.println("Hello from Human!");
        //we cannot able to use this keyword in this
        //becoz this belong to  object
//        System.out.println(this.age);//show an errr
    }
}
