package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee("aditya",100);
        Employee e3=  new Employee("chhote",120);
        Employee e2= new Employee("Anju",110);

       List<Employee>employees= Arrays.asList(e1,e2,e3);
      List<Employee> list= employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());

        System.out.println(list);}
}
