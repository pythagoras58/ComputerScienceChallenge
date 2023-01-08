public class Main {
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