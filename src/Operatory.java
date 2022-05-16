public class Operatory {
    public static void main(String[] args) {

        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        System.out.println(10.0 / 4.0);

        //operatory porównania
        int numOne = 1;
        int numTwo = 2;

        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        //operatory logiczne
        // || - lub
        System.out.println(numOne > numTwo || numOne == 1);
        System.out.println(numOne > numTwo || numOne != 1);
        System.out.println(numOne < numTwo || numOne != 1);

        // && - i
        System.out.println(numOne < numTwo || numOne == 1);

        // Modulo - reszta z dzielenia
        System.out.println(10 % 3);

        if (10 % 2 == 0) {
            System.out.println("jest liczbą parzystą");
        } else {
            System.out.println("nie jest liczbą parzystą");
        }
    }
}
