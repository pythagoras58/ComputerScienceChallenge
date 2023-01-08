public class Main {
    /*
    An array with an odd number of elements is said to be centered if all elements
    (except the middle one) are strictly greater than the value of the middle element.
    Note that only arrays with an odd number of elements have a middle element.
    Write a function that accepts :
    an integer array and returns 1 if it is a centered array, otherwise it returns 0.
     */
    public static void main(String[] args) {
        Main main = new Main();

        int[] myArr = {1,2,3,4};

        main.isCenteredArray(myArr);
    }

    public int isCenteredArray(int[] isCentered){
        if((isCentered.length)%2 == 0){
            System.out.println("NOT CENTERED");
            return 0;
        }else{
            System.out.println("CENTERED");
            return 1;
        }
    }
}