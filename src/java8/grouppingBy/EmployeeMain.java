package java8.grouppingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
       List<Employee> employees= Arrays.asList( new Employee("Alice", 30),
                new Employee("Bob", 25),
                new Employee("Charlie", 30),
                new Employee("David", 25),
                new Employee("Eve", 40));
      Map<Integer,List<Employee>> integerListList= employees.stream().collect(Collectors.groupingBy(Employee::getAge));
      integerListList.forEach((age, employeeslist) -> {
          System.out.println("Age" + ":" + age);
        employeeslist.forEach(System.out::println);

      });
    }
}
