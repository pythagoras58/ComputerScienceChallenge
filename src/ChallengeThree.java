public class ChallengeThree {
    public static void main(String[] args) {

        ChallengeThree c3 = new ChallengeThree();

        // Test values
        char[] a = {'a', 'b', 'c'};
        System.out.println(c3.checker(a, 0, 3));

    }

    public char[] checker(char[] arr, int startPosition, int length){
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
