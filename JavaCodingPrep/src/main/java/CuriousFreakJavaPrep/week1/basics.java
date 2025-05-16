package CuriousFreakJavaPrep.week1;

public class basics {


    public static void main(String[] args) {
        int findingLastDigit= findingLastDigit ();
        int findingFirstDigit= findingFirstDigit ();

        int gcdOfTwoNumbers = gcdOfTwoNumbers();
        System.out.println("findingLastDigit :: "+ findingLastDigit);
        System.out.println("findingFirstDigit :: "+ findingFirstDigit);
        System.out.println("gcdOfTwoNumbers :: "+ gcdOfTwoNumbers);
        System.out.println("gcdOfTwoNumbersEucledeanAlgo :: "+ gcdOfTwoNumbersEucledeanAlgo(60,36));
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


    //finding gcd of two numbers
    public static int gcdOfTwoNumbers(){
        int  a = 60 ;
        int b= 36;
        int temp;
        while (b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return a ;

    }


    public static int gcdOfTwoNumbersEucledeanAlgo(int a, int b){
        // time complexity -- O(log(min(a,b))
        if (b==0){
            return a;
        }
        return gcdOfTwoNumbersEucledeanAlgo(b,a%b);

    }

    }
