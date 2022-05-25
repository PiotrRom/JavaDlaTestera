import model.User;

public class AccesModifiers {
    public static void main(String[] args) {

        User user = new User("Karol", "Testowy", "test@test.pl", 22);
        //System.out.println(user.firstName);
        System.out.println(user.isUserAdult());

    }
}
