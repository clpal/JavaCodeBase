package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSortBySalary {

	public static void main(String[] args) {
		   List <Employee>employeeList= new ArrayList<>();
	        employeeList.add(new Employee(1,1000,"Chhote"));
	        employeeList.add(new Employee(1,1500,"Ram"));
	        employeeList.add(new Employee(1,10800,"Aman"));
	        employeeList.add(new Employee(1,101100,"Nikita"));
	    //  // sort list method reference sort by salary
	        System.out.println("sort list method reference sort by salary");
	        
	        employeeList.sort(Comparator.comparingInt(Employee::getSalary));
	        employeeList.forEach(s->System.out.println(s));
	        
	      //Lambda expression employeeListfor sorting by salary
	        System.out.println("Lambda expression employeeListfor sorting by salary");
	        employeeList.sort((o1, o2) -> o1.getSalary()-o2.getSalary());
	        employeeList.forEach(s->System.out.println(s));
	        
	     // method reference  with stream sorting
	        System.out.println("method reference  with stream sorting");
	        List<Employee>sortedSalary= employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
	        // sortedSalary.forEach(System.out::println);
	         sortedSalary.forEach(s->System.out.println(s));
	}

}
class Employee{
    int id;
    int salary;
    String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
