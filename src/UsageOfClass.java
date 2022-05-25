import model.User;

public class UsageOfClass {
    public static void main(String[] args) {

        User piotrek = new User("Piotrek", "Testowy", "test@test.pl", 30);

        piotrek.getAllInfo();

        User tomek = new User("Tomek", "Testowy", "test@test.pl", 15);

        tomek.getAllInfo();


    }
}
