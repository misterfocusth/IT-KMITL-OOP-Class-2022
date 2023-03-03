/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_mock_01;

/**
 *
 * @author misterfocusth
 */
public abstract class Animal {

    private String name;
    private int power;
    private int age;

    public Animal() {
        this("", 0, 0);
    }

    public Animal(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Animal a) {
        return this.name.equals(a.getName()) && this.age == a.getAge();
    }

    public String toString() {
        return "Animal : name = " + this.name + ", power = " + this.power + ", age = " + this.age;
    }

    public abstract void eat(Food f);
}
