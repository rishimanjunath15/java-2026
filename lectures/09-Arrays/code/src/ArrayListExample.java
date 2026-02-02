import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Dynamicc arrays

        //syntax
//        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(12);
//        list.add(24);
//        list.add(98);
//        list.add(23);
//        list.add(98);
//        list.add(79);
//        list.add(45);

//        System.out.println(list.contains(12));
//        System.out.println(list.set(0,99));
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        //get item ata any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)); //pass index here,list[index] syntax will not work here
        }

        System.out.println(list);




    }
}
