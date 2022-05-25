package model;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public User(String firstName, String lastName, String email, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    public void greetings(String name, String lastName) {
        System.out.println("Hi " + name + " " + lastName + ". Nice to see you!");
    }

    public void howOldAreYou(String name, int age) {
        System.out.println("Hi " + name + ". Your age is " + age);
    }

    int yourAgePlusTen(int age) {
        return age + 10;
    }


}
