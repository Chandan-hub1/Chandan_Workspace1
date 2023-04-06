package Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//A List<String> contains alpha, numeric and alpha numeric values as strings. Write a program to create a List<Integer>s from the original List.
public class FilterIntegerFromListString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("as", "123", "32", "2as");
        List<Integer> filterData=list.stream().filter(l->l.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
        filterData.forEach(System.out::println);

    }
}
