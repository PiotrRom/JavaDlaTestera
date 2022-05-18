public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdults() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    void greetings(String name, String lastName) {
        System.out.println("Hi " + name + " " + lastName + ". Nice to see you!");
    }

    void howOldAreYou(String name, int age) {
        System.out.println("Hi " + name + ". Your age is " + age);
    }

    int yourAgePlusTen(int age) {
        return age + 10;
    }


}
