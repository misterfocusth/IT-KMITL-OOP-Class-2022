package prep;

/**
 *
 * @author misterfocusth
 */
public class Main {

    // Method
    public static void main(String[] args) {
        Human sila = new Human("Sila", 19);
        sila.sayHello();
        sila.sayName();
        sila.sayProfile();

        Human focus = new Human("Focus", 18);
        focus.sayHi();
        focus.sayProfile();
    }
}
