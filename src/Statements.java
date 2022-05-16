public class Statements {
    public static void main(String[] args) {

        int numOne = 1;
        int numTwo = 2;
        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = homePage;

        if (numOne > numTwo) {
            System.out.println("Jestem kodem ifa - true");
        } else {
            System.out.println("Opcjonalny tekst");
        }

        switch (page) {
            case "Home":
                System.out.println("Przełączam się do strony home");
                break;
            case "Login":
                System.out.println("Przełączam się do strony Login");
                break;
            case "Contact":
                System.out.println("Przełączam się do strony Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }

    }
}
