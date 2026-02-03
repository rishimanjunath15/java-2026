public class Triplet {
    public static void main(String[] args) {
        boolean res = triplet(4,5,3);
        System.out.println(res);

    }

    static boolean triplet(int x,int y,int z){
        return (x*x + y*y) == z*z ||
                (y*y +z*z) == x*x ||
                (z*z + x*x) == y*y;
    }


}
