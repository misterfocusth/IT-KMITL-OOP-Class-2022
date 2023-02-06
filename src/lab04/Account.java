
/**
 *
 * @author misterfocusth
 */
public class Account {

    public double balance;
    public String name;

    public void deposit(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
        } else {
            this.balance += b;
        }

    }

    public double withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
        } else if (this.balance < b) {
            System.out.println("Your account balance is insufficient.");
        } else {
            this.balance -= b;
        }
        return this.balance;
    }

    public void showInfo() {
        System.out.println("In " + this.name + " account, there is a balance equal to " + this.balance + " baht.");
    }
}
