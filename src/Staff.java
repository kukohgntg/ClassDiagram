// Staff.java
// Inheritance
public class Staff extends Person {
    private String position;  // Encapsulation

    public Staff(String name, String staffId, String position) {
        super(name, staffId);  // Inheritance (calling the superclass constructor)
        this.position = position;
    }

    // Getter and Setter methods
    public String getPosition() {  // Encapsulation
        return position;
    }

    public void setPosition(String position) {  // Encapsulation
        this.position = position;
    }

    @Override
    public String toString() {  // Polymorphism (method overriding)
        return super.toString() + ", Position: " + position;
    }
}
