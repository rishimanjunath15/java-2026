package code.rishi;

public class Conditionals {
    public static void main(String[] args) {

        int salary = 25000;
        if(salary>1000){
            salary = salary+2000;
        }else if(salary>20000){
            salary = salary+2000;
        }else{
            salary = salary+5000;
        }
        System.out.println(salary);
    }
}
