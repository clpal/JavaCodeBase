package java8.grouppingBy;

import java.util.Arrays;
import java.util.Objects;

public class Student {
     private  int id;
    private   String name;
     private  int age;

     private  int marks[];

    public Student(int id, String name, int age, int[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && age == student.age && Objects.equals(name, student.name) && Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, age);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}
