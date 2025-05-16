package Streams;

import ObjectClass.Order;
import ObjectClass.Student;

import java.util.*;
import java.util.stream.Collectors;

public class MapUsingStream {

    public static void main(String[] args) {
        Map<String,Integer> countriesLength = mapNameLength();
        Map<String ,Integer> customObjectMapping  = customObjectMapping();
        Map<String ,Integer> arrayToMapWithStream  = arrayToMapWithStream();
        Map<Integer ,Double> filterB4ConversionToMap  = filterB4ConversionToMap();
        System.out.println("countriesLengthMap :: "+ countriesLength);
        System.out.println("customObjectMapping  :: "+ customObjectMapping);
        System.out.println("arrayToMapWithStream  :: "+ arrayToMapWithStream());
        System.out.println("filterB4ConversionToMap  :: "+ filterB4ConversionToMap());
        System.out.println("mapFiltering  :: "+ mapFiltering());
        System.out.println("mapSorting  :: "+ mapSorting());
        System.out.println("mapGroupingByDepId  :: "+ mapGroupingByDepId());
    }
    /*
    *Basic Conversion:
    *Given a List<String.String> of country names, convert it into a Map where the key is the country name and the value is the length of the country name.
    */

    public static Map<String,Integer> mapNameLength(){
        List<String> countries = Arrays.asList("algeria","canada", "india","china");
        return countries.stream().collect(Collectors.toMap(name->name , String::length));
    }

    public static List<Student> createEmpInstance(){
        List<Student> students = Arrays.asList(
                new Student("jerold",1),
                new Student("arsac",2),
                new Student("ansari",3),
                new Student("kama",4)
        );
        return students;
    }


    public static Map<String,Integer> customObjectMapping(){
        List<Student> students = Arrays.asList(
                new Student("jerold",1),
                new Student("arsac",2),
                new Student("ansari",3),
                new Student("kama",4),
                new Student("kama",8)
        );

        return students.stream().collect(Collectors.toMap(
                Student::getName,
                Student::getId,
                (existing,replacement)->existing  // for duplicate key handling
        ));
    }

    public static Map<String,Integer> arrayToMapWithStream(){
        String[] students = {"jerold","max","jackie"};
        return Arrays.stream(students).collect(Collectors.toMap(
                student->student,String::length
        ));
    }


    public static Map<Integer, Double> filterB4ConversionToMap(){
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "Alice", 750.0));
        orders.add(new Order(102, "Bob", 300.0));
        orders.add(new Order(103, "Charlie", 1200.5));
        orders.add(new Order(104, "David", 450.0));
        orders.add(new Order(105, "Emma", 900.0));

        return orders.stream().filter(i->i.getAmount()>500.0).collect(Collectors.toMap(
                i->i.getOrderId(),i-> i.getAmount()
        ));
    }


    //Filtering a map

    public static Map<String,Integer> mapFiltering() {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 70000);
        productPrices.put("Mouse", 400);
        productPrices.put("Keyboard", 800);
        productPrices.put("Monitor", 15000);
        productPrices.put("Pen Drive", 450);


        return productPrices.entrySet().stream().filter(i->i.getValue()>500).collect(Collectors.toMap(
                Map.Entry::getKey,   // (entry) -> entry.getKey()
                Map.Entry::getValue  // (entry) -> entry.getValue()

        ));
    }


    // Sorting Map using Streams
    public static Map<Integer,String> mapSorting(){
        Map<Integer, String> students = new HashMap<>();
        students.put(102, "Alice");
        students.put(101, "Bob");
        students.put(105, "Charlie");
        students.put(104, "David");
        students.put(103, "Eve");

// for decending order -- put Comparator.reverseOrder() inside comparingByKey()
// for map values comparision , we have comparingByValue()
        return students.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1,e2) -> e1,
                LinkedHashMap::new
        ));
    }


    public static Map<String,List<String>> mapGroupingByDepId() {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR"),
                new Employee(2, "Bob", "IT"),
                new Employee(3, "Charlie", "HR"),
                new Employee(4, "David", "IT"),
                new Employee(5, "Eve", "Finance")
        );

        return employees.stream().collect(Collectors.groupingBy(
               Employee::getDepartment,
               Collectors.mapping(Employee::getName,Collectors.toList())
        ));
    }
}


class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}


/**
 * Question
 *
 * Here are **five questions** related to converting a `List` to a `Map` using Java Streams:
 *
 * 1. **Basic Conversion:**
 *    Given a `List<String.String>` of country names, convert it into a `Map` where the **key** is the country name and the **value** is the length of the country name.
 *
 * 2. **Custom Object Mapping:**
 *    You have a `List<Student>` where each `Student` has an `id`, `name`, and `grade`. Convert the list into a `Map<Integer, String.String>` where the key is the student’s `id` and the value is their `name`.
 *
 * 3. **Handling Duplicate Keys:**
 *    Suppose you have a `List<Product>` where each `Product` has a `category` and `price`. Convert the list into a `Map<String.String, Double>` where the key is the product’s `category` and the value is the **total price** of all products in that category.
 *
 * 4. **Sorting After Conversion:**
 *    Convert a `List<Employee>` to a `Map<Integer, String.String>` (id → name), then sort the map by employee names in **descending order**.
 *
 * 5. **Filtering Before Conversion:**
 *    Given a `List<Order>` with fields `orderId`, `customerName`, and `amount`, convert it into a `Map<Integer, Double>` where the key is `orderId` and the value is `amount`, **but only include orders with an amount greater than 500.0**.
 *
 * ---
 *
 * Once you’re ready, I can provide solutions for each of these! 🚀
 */









