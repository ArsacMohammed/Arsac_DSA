package Streams;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class filter {


    public static void main(String[] args) {
        List<Integer> oddNumbers = findOddnumbers();
        List<String> wordsStartsWithA = findWordsStartWithA();
        List<Integer> findNoGrhunderd = findNoGr100();
        List<String> findEvenIndexedWords = findEvenIndexedWords();
        List<String> findNonEmptyStrings = findNonEmptyStrings();
        List<Integer> findAllPrimeNumbers = findAllPrimeNumbers();
        List<String> findWordswithMoreThanfiveCh = findWordswithMoreThanfiveCh();
        List<Integer> findDivBy3_5 = findDivBy3_5();
        List<Integer> isPerfectNumber = isPerfectNumber();
        System.out.println("oddnumers:: " + oddNumbers);
        System.out.println("words starts with a :: " + wordsStartsWithA);
        System.out.println("no greater than 100 :: " + findNoGrhunderd);
        System.out.println("even indexed words :: " + findEvenIndexedWords);
        System.out.println("null and emtpy  words :: " + findNonEmptyStrings);
        System.out.println("findWordswithMoreThanfiveCh :: " + findWordswithMoreThanfiveCh);
        System.out.println("findAllPrimeNumbers :: " + findAllPrimeNumbers);
        System.out.println("findDivBy3_5 :: " + findDivBy3_5);
        System.out.println("isPerfectNumber :: " + isPerfectNumber);

    }

    public static List<Integer> findOddnumbers() {
        return List.of(1, 2, 3, 4, 5, 6, 7, 8).stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }


    public static List<String> findWordsStartWithA() {
        return List.of("Arsac", "Atif", "Ahmed", "Shafi", "shaja").stream().filter(a -> a.startsWith("A")).collect(Collectors.toList());
    }


    //Extract only the even-indexed elements from a list.
    public static List<String> findEvenIndexedWords(){
        List<String> words = List.of("Arsac", "Atif", "Ahmed", "Shafi", "shaja");
        return IntStream.range(0,words.size()).filter(i->i%2==0).mapToObj(words::get).collect(Collectors.toList());
    }

    public static List<Integer> findNoGr100(){
        return List.of(111,112,113,114,2).stream().filter(n->n>100).collect(Collectors.toList());
    }


    public static List<String> findNonEmptyStrings() {
        return Arrays.asList(null, "arsac", "", "", " ", "skasha")
                .stream()
                .filter(i -> i != null && !i.trim().isEmpty()) // Correct filter logic
                .collect(Collectors.toList());
    }

    public static List<String> findWordswithMoreThanfiveCh(){
        return List.of("Arsac", "Atif", "Ahmed", "Shafiahmed", "shaja").stream().filter(str->str.length()>5).collect(Collectors.toList());
    }



    public static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        return IntStream.rangeClosed(2,(int) Math.sqrt(number)).allMatch(i->number%i!=0);
    }

    public static List<Integer> findAllPrimeNumbers(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23);
        return  numbers.stream().filter(filter::isPrime).collect(Collectors.toList());
   }


   //Extract numbers that are divisible by both 3 and 5.

    public static List<Integer> findDivBy3_5(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23);
        return numbers.stream().filter(i->i%3==0 && i%5==0).collect(Collectors.toList());
    }


    public static List<Integer> isPerfectNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23);
        return numbers.stream().filter(filter::isPN).collect(Collectors.toList());
    }

    private static boolean isPN(Integer integer) {
        int sum=  IntStream.rangeClosed(1,integer/2).filter(i -> integer% i==0).sum();
        return sum==integer;
    }


}