public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'f'};
        int target = 'f';
        char ans  = smallest(letters,target);
        System.out.println(ans);
    }
    static char smallest(char[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
