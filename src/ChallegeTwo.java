public class ChallegeTwo {
    public static void main(String[] args) {
        ChallegeTwo challegeTwo = new ChallegeTwo();

        int[] arr = {1, 1};
        System.out.println(challegeTwo.arrSummation(arr));
    }

    public int arrSummation(int[] arr){
        int X = 0;
        int Y = 0;

        for(int d : arr){
            if(d%2 == 0){
                Y += d;
            }else{
                X += d;
            }
        }

        return X - Y;
    }
}
