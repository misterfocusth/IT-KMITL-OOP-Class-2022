/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_mock_01;

/**
 *
 * @author misterfocusth
 */
public abstract class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        super(name, 150, age);
    }

    public abstract void wingAttack(Animal a);
}
