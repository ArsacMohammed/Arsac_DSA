package Streams;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUsingStream {

    public static void main(String[] args) {
        Map<String,Integer> countriesLength = mapNameLength();
        System.out.println("countriesLengthMap :: "+ countriesLength);
    }
    /*
    *Basic Conversion:
    *Given a List<String> of country names, convert it into a Map where the key is the country name and the value is the length of the country name.
    */

    public static Map<String,Integer> mapNameLength(){
        List<String> countries = Arrays.asList("algeria","canada", "india","china");
        return countries.stream().collect(Collectors.toMap(name->name , String::length));
    }


}



