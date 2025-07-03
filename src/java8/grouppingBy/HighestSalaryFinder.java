package java8.grouppingBy;

import java.util.*;

public class HighestSalaryFinder {
    public static void main(String[] args) {

            List<Employee> employees = Arrays.asList(
                    new Employee(1, "John", 50000),
                    new Employee(2, "Jane", 70000),
                    new Employee(3, "Mike", 60000)
            );

            Map<Integer, Double> highestSalaryEmployee = employees.stream()
                    .max(Comparator.comparingDouble(Employee::getSalary))
                    .map(emp -> Collections.singletonMap(emp.getId(), emp.getSalary()))
                    .orElse(Collections.emptyMap());

            System.out.println(highestSalaryEmployee);

    }
}
