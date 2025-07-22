package deepvsshallow.shallow;
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
   Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // default shallow copy
    }
}

public class ShallowMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Person p1 = new Person("John", addr);
      Person p2 = (Person) p1.clone();

        p2.name = "Jane";
        p2.address.city = "Los Angeles";

        System.out.println(p1.name);             // John
        System.out.println(p1.address.city);     // Los Angeles → affected by p2
    }

}
/* Shallow Copy
A shallow copy copies the values of an object as-is, including references to other objects. This means:

The copied object and the original object share references to the same nested objects.

Changes to mutable nested objects will reflect in both copies.*/