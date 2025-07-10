package predefined_functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicate {
    public static void main(String[] args) {
        Employee e= new Employee(18,1200,"aman");
        Employee e1= new Employee(10,1000,"jay");
        Employee e2= new Employee(28,3330,"surya");
        List<Employee>list= Arrays.asList(e,e1,e2);
        Predicate<Employee>p=x->x.getAge()>18;
        Predicate<Employee>p2=x->x.getSalary()>1000;
        for (Employee employee:list) {
            if (p.and(p2).test(employee)){
                System.out.printf("employee name-> "+employee.getName());
            }

        }
    }
}
