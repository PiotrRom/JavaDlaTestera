public class StringMethods {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));

        String s = str1.toUpperCase();
        System.out.println(s);

        String s1 = str1.toLowerCase();
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);

        System.out.println(str1.endsWith("lo"));

        System.out.println(str1.contains("ll"));

        System.out.println("   o ".isBlank()); // czy tekst zawiera jakieś litery ignorując spacje
        System.out.println("  ".isEmpty()); //długość stringa ze spacjami

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace );

        String s2 = str1.replaceAll("l", "x");
        System.out.println(s2);

        String substring = str1.substring(1, 4);
        System.out.println(substring);

        String texWithWhiteSpaces = "    to jest jakis text   ";

        System.out.println(texWithWhiteSpaces.length());

        String strip = texWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());
    }
}
