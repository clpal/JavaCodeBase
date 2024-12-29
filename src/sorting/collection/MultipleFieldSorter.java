package sorting.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://howtodoinjava.com/java/sort/groupby-sort-multiple-comparators/
public class MultipleFieldSorter
{
    public static void main(String[] args)
    {
        List<Employee> list = Arrays.asList(
                new Employee(1, "A", "B", 34),
                new Employee(4, "C", "D", 30),
                new Employee(3, "B", "A", 31),
                new Employee(2, "D", "C", 25));

        Collections.sort(list, new FirstNameSorter()
                .thenComparing(new LastNameSorter())
                .thenComparing(new AgeSorter()));


        System.out.println(list);
    }
}