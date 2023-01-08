public class ChallengeFour {
    /*
    Write a function to reverse an integer using numeric
    operators and without using any arrays or other data structures.
    The signature of the function is:
    int f(int n)
     */

    public static void main(String[] args) {
        ChallengeFour c4 = new ChallengeFour();

        int testCase = 1000;
        System.out.println("Reversed valued of " + testCase + " is :" + c4.f(testCase));
    }

    int f(int n){
        int reversal = 0;
        while (n != 0){
            int remainder = n % 10;
            reversal = reversal * 10 + remainder;
            n = n /10;
        }

        return reversal;
    }
}
