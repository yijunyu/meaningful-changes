public class HelloWorld {
    private static String hello = "Hello";
    private static String world = "world";

    <<<<<< "public static void main (String args []) {System.out.println (hello + \", \" + world + \"!\");}"

}

public class HelloWorld {
    static String world = "world";
    static String hello = "Hello";

    >>>>>> "public static void main (String args []) {System.out.println (hello + \", \" + world + \"!\");}"

}
