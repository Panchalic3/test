import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class StreamTeat {
    public static void main(String[] args) {

        // you have a array list of numbers, print values that are greater than 5

    ArrayList<Integer> number = new ArrayList<>(Arrays. asList(1, 2, 3, 4, 5, 6, 99 , 7 ,77 , 3 , 17));
    List<Integer> num =  Arrays.asList(1,2,22,4,77,9,12,48,122);
     num.stream().
                filter(n -> n>10).
                forEach(n -> System.out.println(n));

     System.out.println("___________________________________________");


}}
