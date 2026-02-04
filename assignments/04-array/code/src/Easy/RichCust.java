package Easy;

public class RichCust {
    public static void main(String[] args) {
        int[][] arr = {{31,45,87,12,31},
                {23,45,67,76,45},
                {45,54,12,98,34}};

        int maxValue = 0;

        for(int i = 0;i<arr.length;i++){
            int currentValue = 0;
            for(int j = 0; j<arr[i].length; j++){
                currentValue = currentValue + arr[i][j];
            }
            System.out.println(currentValue);
            if (currentValue>maxValue){
                maxValue=currentValue;
            }
        }
        System.out.println("max value among these: " +maxValue);



    }
}
