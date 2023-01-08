public class ChallegeTwo {
    /*
    Write a function that takes an array of integers as an argument and returns a value
    based on the sums of the even and odd numbers in the array.
    Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers.
    The function should return X – Y
     */
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
