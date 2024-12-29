package Java8Pro;

public class User {
    private  int age;
    private  String name;
    private  String dept;

    public User(int age, String name, String dept) {
        this.age = age;
        this.name = name;
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
