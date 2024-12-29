package code_practice;


import java.util.Arrays;
import java.util.List;

class Company {
    int compId;
    String compLicense;

    Company() {
        System.out.println("This is Base class");
    }

    Company(int compId, String compLicense) {
        this.compId = compId;
        this.compLicense = compLicense;
    }
    // salary method
}

class Employee extends Company {
    int empId;
    String name;
    String gender;
    int age;

    public Employee(int empId, String name, String gender, int age) {
        super();
        this.empId = empId;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static void main(String args[]) {
        Employee s1 = new Employee(1, "Raj", "M", 23);
        Employee s2 = new Employee(2, "Roopa", "F", 24);
        Employee s3 = new Employee(3, "Selva", "M", 22);
        Employee s4 = new Employee(4, "Selvi", "F", 26);
        Employee s5 = new Employee(5, "Jim", "M", 25);
        Employee s6 = new Employee(6, "Tom", "M", 30);
        Employee s7 = new Employee(7, "Tony", "M", 40);
        Employee s8 = new Employee(8, "Hema", "F", 31);
        Employee s9 = new Employee(9, "Jeny", "F", 35);
        Employee s10 = new Employee(10, "Sheetal", "F", 29);
        List<Employee> myEmpList = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        System.out.println(myEmpList);
/*
        main.Employee::salary()
        myEmpList.strem

// 1@acfc,1@bcfc
        //

        Abstract factory method Pattern

        Bank getFactort(new SBI( Double amount)){

            BAnk bank=new SBI




            Company com= emp:salary*/

        }
    }