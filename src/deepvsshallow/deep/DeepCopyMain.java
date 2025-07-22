package deepvsshallow.deep;

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return new Address(this.city); // create new Address object
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone(); // deep copy of address
        return cloned;
    }
}

public class DeepCopyMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Person p1 = new Person("John", addr);
        Person p2 = (Person) p1.clone();

        p2.name = "Jane";
        p2.address.city = "Los Angeles";

        System.out.println(p1.name);             // John
        System.out.println(p1.address.city);     // New York → unaffected
    }
}

/*
Deep Copy
A deep copy creates a new object and recursively copies all nested objects, so the copy is independent of the original.*/
