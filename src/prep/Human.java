package prep;

/**
 *
 * @author misterfocusth
 */
public class Human {
    
    // Attribute
    String name;
    int age;
    
    // Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method
    public void sayHello() {
        System.out.println("Hello");
    }
    
    public void sayHi() {
        System.out.println("Hi");
    }
        
    public void sayName() {
        System.out.println("My name is: " + this.name);
    }

    public void sayProfile() {
        System.out.println("My Profile is: " + this.name + ", Age: " + this.age);
    }
    
    
    
}
