//static method can only access static data

package staticExample;

import static staticExample.Human.message;

public class Main {
    public static void main(String[] args) {
//        Human person1 = new Human(23,"rishi",2345.6,false);
//        Human person2 = new Human(35,"kunal",53000.45,true);
//
//        System.out.println(person1.name);
//        System.out.println(person2.name);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
        message();

    }


    //this is not dependent on objects
    static void fun(){
//        System.out.println("hello there");
//        //we cannot access the non static one inside a static one if we do that it require an object otherwise it will throw you an error
//        greeeting();//wsse cannot use it becauze it requires an instance
        //but the function you are using it doesnot depend on objects

        //you cannot access non sytatic stuff without referencing their instance in
        //a static context

        //hence,here i ama reference it
        Main obj = new Main();
        obj.greeting();

    }

    //we know something which is not static ,belongs to an object
    void greeting(){
        //we can accesss the static one inside the non- static one
        fun();
        System.out.println("Hello world");
    }
}
