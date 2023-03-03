/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_mock_01;

/**
 *
 * @author misterfocusth
 */
public class Owner {
    
    protected final String name;
    protected Animal animal;
    
    public Owner() {
        this("", null);
    }
    
    public Owner(String name) {
        this(name, null);
    }
    
    public Owner(Animal animal) {
        this("", null);
    }
    
    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }
    
    public Animal getAnimal() {
        return animal;
    }
    
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void feedFood(Food f) {
        animal.setPower(animal.getPower() + f.getPower());
    }
    
    public String toString() {
        return ("Owner : name = " + this.getName() + ", Animal : name = " + this.animal.getName() + ", power = " + this.animal.getPower() + ", age = " + this.animal.getAge());
    }
    
    public void protectOwnerFrom(Animal a) {
        if (this.animal instanceof Dog) {
            ((Dog) animal).kick(a);
        } else if (this.animal instanceof Pigeous) {
            ((Pigeous) animal).wingAttack(a);
        }
    }
}
