public class UsageOfClass {
    public static void main(String[] args) {

        User piotrek = new User();
        piotrek.firstName = "Piotrek";
        piotrek.lastName = "Testowy";
        piotrek.email = "test@test.pl";
        piotrek.age = 30;
        piotrek.isAdult = true;

        piotrek.getFullName();
        piotrek.getAllInfo();
        int userAge = piotrek.getUserAge();
        System.out.println(userAge);
        boolean userAdult = piotrek.isUserAdults();
        System.out.println(userAdult);

        piotrek.greetings("Piotr");
        piotrek.howOldAreYou("Piotr",30);
        int agePlusTen = piotrek.yourAgePlusTen(30);
        System.out.println(agePlusTen);

        piotrek.greetings("Piotr", "Romaniuk");

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Testowy";
        tomek.email = "test@test.pl";
        tomek.age = 15;
        tomek.isAdult = false;

        tomek.getFullName();
        tomek.getAllInfo();
        boolean isTomekAdult = tomek.isUserAdults();
        System.out.println(isTomekAdult);
        tomek.greetings("Tomek");

        System.out.println(tomek.yourAgePlusTen(tomek.age));
    }
}
