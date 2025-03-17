package CuriousFreakJavaPrep.week1;

public class basics {


    public static void main(String[] args) {
        int findingLastDigit= findingLastDigit ();
        int findingFirstDigit= findingFirstDigit ();
        System.out.println("findingLastDigit :: "+ findingLastDigit);
        System.out.println("findingFirstDigit :: "+ findingFirstDigit);
    }


    public static int findingLastDigit() {
        int number = 675438;
        while (number>0){
            number=number%10;
            break;
        }
        return number;
    }


    public static int findingFirstDigit() {
        int number = 675438;
        while (number>=10){
            number=number/10;
        }
        return number;
    }
}
