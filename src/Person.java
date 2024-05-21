// Person.java
// Abstraction and Inheritance
public abstract class Person {
    private String name;  // Encapsulation
    private String id;    // Encapsulation

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getter and Setter methods
    public String getName() {  // Encapsulation
        return name;
    }

    public void setName(String name) {  // Encapsulation
        this.name = name;
    }

    public String getId() {  // Encapsulation
        return id;
    }

    public void setId(String id) {  // Encapsulation
        this.id = id;
    }

    @Override
    public String toString() {  // Polymorphism (method overriding)
        return "Name: " + name + ", ID: " + id;
    }
}
