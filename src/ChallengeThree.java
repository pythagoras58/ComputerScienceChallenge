public class ChallengeThree {

    /*
        Write a function that accepts a character array, a zero-based start position and a length.
        It should return a character array containing containing lengthcharacters starting with
        the startcharacter of the input array. The function should do error checking on the
        start position and the length and return null if the either value is not legal.
        The function signature is:
        char[ ] f(char[ ] a, int start, int len)
     */
    public static void main(String[] args) {

        ChallengeThree c3 = new ChallengeThree();

        // Test values
        char[] a = {'a', 'b', 'c'};
        System.out.println(c3.f(a, 0, 3));

    }

    public char[] f(char[] arr, int startPosition, int length){
        if((arr == null) || (length <0) || (startPosition <0) || (startPosition >= arr.length) || (length+startPosition > arr.length)){
            return null;
        }

        char[] chars = new char[length];
        int checks = 0;

        for(int i=startPosition; i<length; i++){
            chars[checks] = arr[i];
            checks++;
        }

        return arr;
    }
}
