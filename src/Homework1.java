public class Homework1 {
    public static void main(String[] args) {

        int numOne = 37;
        int numTwo = 545;
        int numThree = 18;
        int numFour = 4;

        if ((numOne + numTwo) % 2 == 0 && (numThree + numFour) % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Liczby nie są parzyste");
        }
    }
}
