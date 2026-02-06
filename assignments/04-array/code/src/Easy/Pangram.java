package Easy;

public class Pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
