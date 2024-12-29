package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
         Employee e1= new Employee("Chhote","Delhi");
         Employee e2= new Employee("Aman","Noida");
         Employee e3= new Employee("Nikta","Gurgaon");
         Employee e4= new Employee("Chandresh","Hydrabad");
           List<Employee> list=new ArrayList<>();
           list.add(e1);
           list.add(e2);
           list.add(e3);
           list.add(e4);
           list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
