package hasmmap;


public class Employee {
    private  int id;
    private  String salary;
    

	public Employee(int id, String salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

}
