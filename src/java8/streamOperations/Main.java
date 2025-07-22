package java8.streamOperations;

import java.util.*;
import java.util.stream.Collectors;

record Employee(int id,
                String name,
                int age,
                String gender,
                String department,
                int yearOfJoining,
                double salary) {
}

public class Main {
    public static void main(String[] args) {

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        emps.add(new Employee(9, "Gita", 28, "Female", "Sales", 2016, 11500.0));
        emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        emps.add(new Employee(12, "Nithin", 26, "Male", "Development", 2016, 28200.0));
        emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        emps.add(new Employee(15, "Ashok", 26, "Male", "Infrastructure", 2018, 12700.0));
        emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
        System.out.println(emps);

        //1. How many male and female employees are there in the organization?
        Map<String, Long> map1 = emps.stream()
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
        System.out.println(map1);

//2. Print the name of all departments in the organization
        emps.stream()
                .map(Employee::department)
                .distinct()
                .forEach(name -> System.out.println(name));

//3. What is the average age of male and female employees?

        Map<String, Double> map = emps.stream()
                .collect(Collectors.groupingBy(Employee::gender, Collectors.averagingInt(Employee::age)));
        System.out.println(map);


//4. Get the details of highest paid employee in the organization
        Optional<Employee> optional = emps.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::salary)));

        if (optional.isPresent()) {
            Employee employee = optional.get();
            System.out.println(employee);
        }
        // 5. Get the names of all employees who have joined after 2015 ?
        emps.stream()
                .filter(e -> e.yearOfJoining() > 2015)
                .map(e -> e.name())
                .forEach(name -> System.out.println(name));

        // 6. Count the number of employees in each department ?
        Map<String, Long> map2 = emps.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
        System.out.println(map2);


// 7. What is the average salary of each department ?
        Map<String, Double> map3 = emps.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.averagingDouble(Employee::salary)));
        System.out.println(map3);

// 8. Get the details of youngest male employee in the Development department ?
        Optional<Employee> optional2 = emps.stream()
                .filter(e -> e.gender().equals("Male") && e.department().equals("Development"))
                .min(Comparator.comparing(Employee::age));

        if (optional2.isPresent()) {
            System.out.println(optional2.get());
        }
// 9. Who has the most working experience in the organization?

        Optional<Employee> optional1 = emps.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::yearOfJoining)));

        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        }

// 10. How many male and female employees are there in the Sales team?

        Map<String, Long> map4 = emps.stream()
                .filter(e -> e.department().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));

        System.out.println(map4);

// 11. What is the average salary and total salary of the whole organization?

        String result4 = emps.stream()
                .collect(Collectors.teeing(
                        Collectors.averagingDouble(Employee::salary),
                        Collectors.summingDouble(Employee::salary),
                        (avg, total) -> avg + " " + total
                ));
        System.out.println(result4);
// 12. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years

        Map<Boolean, List<Employee>> collect2 = emps.stream()
                .collect(Collectors.partitioningBy(emp -> emp.age() <= 25));

        List<Employee> list1 = collect2.get(true);
        List<Employee> list2 = collect2.get(false);
        System.out.println(list1);
        System.out.println(list2);

// 13. Who is the oldest employee in the organization?

        Optional<Employee> max = emps.stream()
                .max(Comparator.comparing(Employee::age));

        max.ifPresentOrElse(
                e -> System.out.println(e),
                () -> System.out.println("No emp available")
        );

    }

}