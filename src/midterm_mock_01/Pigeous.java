/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_mock_01;

/**
 *
 * @author misterfocusth
 */
public class Pigeous extends Bird {
    
    public Pigeous() {
        this("", 0);
    }
    
    public Pigeous(String name, int age) {
        super(name, age);
    }
    
    public void wingAttack(Animal a, int times) {
        for (int x = 0; x < times; x++) {
            this.wingAttack(a);
        }
    }
    
    @Override
    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }
    
    @Override
    public void eat(Food f) {
        this.setPower(this.getPower() + (f.getPower() * 2));
    }
    
    @Override
    public void fly() {
        System.out.println(this.getName() + " fly fly ....");
    }
    
}
